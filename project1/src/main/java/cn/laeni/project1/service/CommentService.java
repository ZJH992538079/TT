package cn.laeni.project1.service;

import java.util.List;

import cn.laeni.project1.entity.Comment;
import cn.laeni.project1.entity.Forum;

public interface CommentService {
	
	Forum commentPage(int id);
	
	Forum showForum(int id);
	
	String insert(Integer forum_id, String $userId, String comment_value);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	List<Comment> selectCommentById(Integer id);
}
