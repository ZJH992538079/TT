package cn.laeni.project1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.laeni.project1.entity.Comment;
import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.mapper.CommentMapper;
import cn.laeni.project1.mapper.ForumMapper;
import cn.laeni.project1.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	ForumMapper fm;
	@Autowired
	CommentMapper cm;
	
	public Forum commentPage(int id) {
		
		return fm.selectByPrimaryKey(id);
	}

	public Forum showForum(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String insert(Integer forum_id, String $userId, String comment_value) {
		Comment comment = new Comment();
		comment.setForumId(forum_id);
		comment.setUserId($userId);
		comment.setCommentValue(comment_value);
		
		if(cm.insertComment(comment)>0) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	public List<Comment> selectCommentById(Integer forumId) {
		
		return cm.selectCommentById(forumId);
	}

}
