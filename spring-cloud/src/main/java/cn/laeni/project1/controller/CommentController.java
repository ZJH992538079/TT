package cn.laeni.project1.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.laeni.project1.entity.Comment;
import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.service.CommentService;

@Controller
public class CommentController {
	@Autowired
	CommentService cs;

//	@RequestMapping("/commentPage.do")
	@RequestMapping("/comment")
	public String commentPage(HttpServletRequest request, Integer id){
		Forum forum = cs.commentPage(id);
		request.setAttribute("ONEFORUM", forum);
		return "comment-1.0";
	}

//	@RequestMapping("/insertComment.do")
	@RequestMapping("/insertComment")
	@ResponseBody
	public String insert(Integer forumId, String userId, String commentValue) {
		String insert = cs.insert(forumId, userId, commentValue);
		return insert;
	}
	
	/**
	 * 根据帖子ID查询该帖子下所有的评论
	 * @param id
	 * @return
	 */
//	@RequestMapping("/selectComment.do")
	@RequestMapping("/selectComment")
	@ResponseBody
	public List<Comment> selectCommentById(Integer id){
		List<Comment> list = cs.selectCommentById(id);
		for(Comment cc:list) {
			System.out.println(cc);
		}
		return list;
	}
}
