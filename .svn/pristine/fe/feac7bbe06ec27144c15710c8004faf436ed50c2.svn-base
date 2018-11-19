package cn.laeni.project1.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import cn.laeni.project1.entity.ApiJson;
import cn.laeni.project1.entity.SystemCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.service.UserForumService;

@Controller
@CrossOrigin // 跨域
public class UserForumController {

	protected static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	@Autowired
	UserForumService userForumService;

	/**
	 * 查询指定用户的所有帖子
	 * @param userId 用户ID
	 * @return 帖子列表
	 */
	@RequestMapping("/selectForumByUserId.do")
	@ResponseBody
	public List<Forum> selectForumByUserId(String userId) {
		System.out.println(userId);
		return userForumService.selectForumByUserId(userId);
	}
	
	/**
	 * 通过贴子的id查询帖子内容，转发数据到编辑页面
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping("/selectByPrimaryKey.do")
	public String selectByPrimaryKey(HttpServletRequest request , Integer id) {
		System.out.println(id);
		Forum forum = userForumService.selectByPrimaryKey(id);
		System.out.println("forum"+forum);
		request.setAttribute("forum", forum);
		return "updateforum";
	}


	/**
	 * 根据请求修改帖子内容数据
	 * @param id 帖子ID
	 * @param title 帖子标题
	 * @param value 帖子内容
	 * @return
	 */
	@RequestMapping("/upDateByUserId.do")
	@ResponseBody
	public ApiJson upDateByUserId(Integer id, String title, String value) {
		Forum forum = new Forum();
		forum.setId(id);
		forum.setTitle(title);
		forum.setValue(value);

		// 修改操作
		userForumService.upDateByUserId(forum);

		return new ApiJson(SystemCode.SUCCESS);
	}

	@RequestMapping("/deletetForum.do")
	@ResponseBody
	public ApiJson deletetForum(Integer id) {
		return userForumService.deletetForum(id);
	}
}
