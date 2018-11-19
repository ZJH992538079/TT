package cn.laeni.project1.umeditor;

import cn.laeni.utlis.cos.CosClient;
import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

public class Uploader {
	static SimpleDateFormat formater = new SimpleDateFormat("yyyyMMdd");

	private String name;                // 上传文件名
	private String originalName;        // 原始文件名
	private Long size;                    // 文件大小
	private String state;                // 状态
	private String type;                // 文件类型
	private String url;                // 图片网络地址


	// start 必须有的属性,但是序列化时不显示的字段
	@JSONField(serialize = false)
	private String projectName;    // 项目名
	@JSONField(serialize = false)
	private MultipartFile ofile; //接受到的文件
	@JSONField(serialize = false)
	private Long index;            // 文件存储的索引,是必须的
	@JSONField(serialize = false)
	private CosClient cosClient;    // 腾讯对象存储支持
	@JSONField(serialize = false)
	private String[] allowFiles = {".rar", ".doc", ".docx", ".zip", ".pdf", ".txt", ".swf", ".wmv", ".gif",
			".png", ".jpg", ".jpeg", ".bmp"};    // 文件允许格式
	@JSONField(serialize = false)
	private int maxSize = 10240;    // 文件大小限制，单位KB
	@JSONField(serialize = false)
	private HashMap<String, String> errorInfo = new HashMap<String, String>();    // 返回的信息
	// end 必须有的属性

	/**
	 * 初始化,只有初始化了才能进行文件上传
	 */
	void init() {
		errorInfo.put("SUCCESS", "SUCCESS"); //默认成功
		errorInfo.put("NOFILE", "未包含文件上传域");    //*
		errorInfo.put("TYPE", "不允许的文件格式");        //*
		errorInfo.put("SIZE", "文件大小超出限制");        //*
		errorInfo.put("ENTYPE", "请求类型ENTYPE错误");
		errorInfo.put("REQUEST", "上传请求异常");
		errorInfo.put("IO", "IO异常");
		errorInfo.put("DIR", "目录创建失败");
		errorInfo.put("UNKNOWN", "未知错误");

		if (ofile != null && !"".equals(ofile.getOriginalFilename()) && cosClient != null) {
			this.originalName = ofile.getOriginalFilename();    // 获取文件原始文件名
			this.name = this.originalName;
			this.index = cosClient.getindex();    // 获取该文件的索引
			this.size = ofile.getSize();            // 获取文件大小
			this.type = getFileExt();// 获取文件扩展名
		} else {
			this.ofile = null;
		}
	}


	public Uploader() {
	}

	/**
	 * 有参构造方法
	 *
	 * @param ofile     文件对象
	 * @param cosClient 对象存储
	 */
	public Uploader(MultipartFile ofile, CosClient cosClient) {
		this.ofile = ofile;
		this.cosClient = cosClient;
		if (ofile != null && cosClient != null)
			this.init();// 初始化
	}

	/**
	 * 传入文件对象
	 * @param ofile 文件对象
	 */
	public void setOfile(MultipartFile ofile) {
		this.ofile = ofile;
		if (this.ofile != null && this.cosClient != null)
			this.init();// 初始化
	}

	/**
	 * 设置对象存储
	 * @param cosClient 对象存储
	 */
	public void setCosClient(CosClient cosClient) {
		this.cosClient = cosClient;
		if (this.ofile != null && this.cosClient != null)
			this.init();// 初始化
	}

	/**
	 * 开始上传文件
	 */
	public void upload() {
		// 如果没有上传文件则终止操作
		if (this.ofile == null) {
			this.state = this.errorInfo.get("NOFILE");
			return;
		}
		if (ofile.getSize() > maxSize * 1024) {
			this.state = this.errorInfo.get("SIZE");    // 文件大小超出限制
			return;
		}
		if (!this.checkFileType(this.originalName)) {
			this.state = this.errorInfo.get("TYPE");    // 不允许的文件格式
			return;
		}

		// 创建临时文件
		String temFileName = new StringBuilder(System.getProperty("java.io.tmpdir")).append(UUID.randomUUID().toString()).append(".tem").toString();
		File targetFile = new File(temFileName);


		// 开始上传文件
		try {
			// TODO 这个理应不需要将文件暂存
			ofile.transferTo(targetFile);    // 将接收到的文件暂时存在本地
			cosClient.localFile(targetFile, getKey());        // 将暂存文件上传到对象存储中
			targetFile.delete();    // 删除暂存文件

			this.state = this.errorInfo.get("SUCCESS");    // 成功
		} catch (Exception e) {
			e.printStackTrace();
			this.state = this.errorInfo.get("UNKNOWN"); // 未知错误
		}
	}


	@Override
	public String toString() {
		return "Result{" +
				"name='" + name + '\'' +
				", originalName='" + originalName + '\'' +
				", size='" + size + '\'' +
				", state='" + state + '\'' +
				", type='" + type + '\'' +
				", url='" + url + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSize() {
		return size;
	}

	public void setSize(Long size) {
		this.size = size;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getOriginalName() {
		return originalName;
	}

	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

	/**
	 * 返回文件对应的网络url
	 *
	 * @return
	 */
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

// ----------------------------------------------------------------------------------------------

	/**
	 * 接受并保存以base64格式上传的文件
	 */
	public void uploadBase64() {
		// TODO
	}

	/**
	 * 文件类型判断(不符合要求返回false)
	 *
	 * @param fileName 文件名
	 * @return 文件格式是否符合要求
	 */
	private boolean checkFileType(String fileName) {
		Iterator<String> type = Arrays.asList(this.allowFiles).iterator();
		while (type.hasNext()) {
			String ext = type.next();
			if (fileName.toLowerCase().endsWith(ext)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 获取文件扩展名
	 *
	 * @return string
	 */
	private String getFileExt() {
		return this.originalName.substring(this.originalName.lastIndexOf("."));
	}

	/**
	 * 文件对象的key
	 * <p>示例:project1/upload/20181010/xxx.jpeg</p>
	 *
	 * @return
	 */
	private synchronized String getKey() {
		if (this.url != null)
			return this.url;
		this.url = new StringBuilder(projectName)
				.append("/upload/")
				.append(formater.format(new Date()))
				.append("/")
				.append(index)
				.append("-")
				.append(new Random().nextInt(100000))
				.append(getFileExt())
				.toString();
		return this.url;
	}


	/**
	 * 设置运行的文件格式
	 *
	 * @param allowFiles
	 */
	public void setAllowFiles(String... allowFiles) {
		this.allowFiles = allowFiles;
	}

	/**
	 * 设置允许的最大文件值(KB)
	 *
	 * @param size
	 */
	public void setMaxSize(int size) {
		this.maxSize = size;
	}

}
