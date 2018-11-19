package cn.laeni.project1.umeditor;

import cn.laeni.utlis.cos.CosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UmeditorService {
	@Autowired
	CosClient cosClient; // 腾讯对象存储支持

	// 上传文件
	public Uploader localFile(MultipartFile ofile){
		Uploader uploader = new Uploader(ofile,cosClient);
		uploader.setMaxSize(10240); // 设置文件最大长度
		uploader.setProjectName("project1"); // 该值决定了上传的文件在对象存储和文件的url地址,一般是固定的
		uploader.upload();

		return uploader;
	}
}
