package cn.laeni.project1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.laeni.project1.service.UserForumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.service.IndexService;
@Controller
public class MyController {
	
	@Autowired
	IndexService is;
	@Autowired
	UserForumService userForumService;

	/**
	 *
	 * 首页
	 * by：朱景辉
	 */
	@RequestMapping(method=RequestMethod.GET,value="indexPage.do")
	public String index(HttpServletRequest request) {
		request.setAttribute("LUNBO", is.showIndexForum());
		return "index";
	}

	@RequestMapping(method=RequestMethod.GET,value="indexPages.do")
	@ResponseBody
	public List<Forum> indexByAjax(String ss) {

		return is.showIndexSomeForum(ss);
	}

	@RequestMapping("/insertForum.do")
	@ResponseBody
	public String insertForum(String title, String userId, int typeId, String value ) {

		return userForumService.insertForum(title, userId, typeId, value);
	}

}
