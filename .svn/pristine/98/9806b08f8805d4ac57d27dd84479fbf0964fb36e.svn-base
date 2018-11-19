package cn.laeni.project1.umeditor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

@Controller
@CrossOrigin	// 跨域支持
public class UmeditorController {

	@Autowired
	UmeditorService umeditorService;

	@RequestMapping(value = {"/imageUp.do"}, produces = "application/json; charset=utf-8")
	@ResponseBody
	public Uploader upImg(HttpServletRequest request, @RequestParam("upfile") MultipartFile upfile) throws UnsupportedEncodingException {

		// 上传文件并获取返回的状态信息
		Uploader result1 = umeditorService.localFile(upfile);

		/*if(request.getParameter("callback") != null){
			return new StringBuilder("<script>")
					.append(request.getParameter("callback"))
					.append("(")
					.append(JSON.toJSONString(result1))
					.append(")</script>")
					.toString();
		}*/

		return result1;
	}

}
