package cn.laeni.project1.controller;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.service.IndexService;
import cn.laeni.project1.service.UserForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class IndexController {

	@RequestMapping(method= RequestMethod.GET,value="/")
	public String index(HttpServletRequest request) {
		request.setAttribute("LUNBO", is.showIndexForum());
		return "index-1.0";
	}

	/**
	 * 个人中心
	 * @return
	 */
	@RequestMapping("/myforum")
	public String myforum() {
		return "myforum";
	}

	/**
	 * 发帖页面
	 * @return
	 */
	@RequestMapping("/fatie")
	public String fatie() {
		return "fatie";
	}

	@RequestMapping("/link")
	public String link(){
		return "link.html";
	}

	@Autowired
	IndexService is;
	@Autowired
	UserForumService userForumService;

//	@RequestMapping("/indexPages.do")
	@RequestMapping("/indexPages")
	@ResponseBody
	public List<Forum> indexByAjax(String ss) {

		return is.showIndexSomeForum(ss);
	}

//	@RequestMapping("/insertForum.do")
	@RequestMapping("/insertForum")
	@ResponseBody
	public String insertForum(String title, String userId, int typeId, String value ) {
		return userForumService.insertForum(title, userId, typeId, value);
	}

}
