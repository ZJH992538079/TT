package cn.laeni.project1.test;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

@Controller
@Component
public class TestUpFileController {

	@RequestMapping(value = { "/"}/*, produces = "application/json; charset=utf-8"*/)
//	@ResponseBody
	public String test(String value, HttpServletResponse response) {
		return "index";
	}
	@RequestMapping(value = "/testFreemarker1")
	public String testFreemarker1() {
		return "may1";
	}

	// 上传文件的处理
	@RequestMapping(value = {"/file.do"}, produces = "application/json; charset=utf-8")
	@ResponseBody
	public String doUploadFile(HttpServletRequest request, @RequestParam("ofile") MultipartFile ofile) {
		System.out.println("进入doUploadFile()方法");

		// 获取Application作用域对象
		ServletContext context = request.getServletContext();
		// 获取本请求根路径对应的计算机真实地址
		String contextPath = context.getContextPath();
		// 获取上传的文件的文件名
		String oname = ofile.getOriginalFilename();
		// 要保存的路径和文件名
		File file = new File(contextPath, oname);
		// 将文件保存在file对象指定的位置
		try {

			System.out.println("文件名:" + ofile.getOriginalFilename());
			System.out.println("大小:" + ofile.getSize());

			System.out.println("Bytes大小:" + ofile.getBytes().length);

			ofile.transferTo(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "上次文件成功!!!";
	}
}
