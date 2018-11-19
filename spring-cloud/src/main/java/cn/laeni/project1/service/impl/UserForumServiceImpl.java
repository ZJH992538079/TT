package cn.laeni.project1.service.impl;

import java.util.List;

import cn.laeni.project1.entity.ApiJson;
import cn.laeni.project1.entity.SystemCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.mapper.ForumMapper;
import cn.laeni.project1.service.UserForumService;


@Service
public class UserForumServiceImpl implements UserForumService {

	@Autowired
	ForumMapper forumMapper;

	/**
	 * 根据用户ID查询该用户下所以帖子
	 * @param userId
	 * @return
	 */
	public List<Forum> selectForumByUserId(String userId) {
		return forumMapper.selectByUserId(userId);
	}

	/**
	 * 根据帖子id查询帖子内容
	 */
	public Forum selectByPrimaryKey(Integer id) {
		return forumMapper.selectByPrimaryKey(id);
	}

	/**
	 * 根据帖子id修改帖子内容
	 */
	public int upDateByUserId(Forum forum) {
		return forumMapper.upDateByUserId(forum);
	}

	@Override
	public ApiJson deletetForum(Integer id) {
		forumMapper.deleteByPrimaryKey(id);
		return new ApiJson(SystemCode.SUCCESS);
	}
	@Override
	public String insertForum(String title, String userId, int typeId, String value ) {
		Forum forum=new Forum();
		forum.setTitle(title);

		forum.setTypeId(typeId);
		forum.setUserId(userId);
		forum.setValue(value);
		if(forumMapper.insert(forum)>0) {
			return "SUCCESS";
		}
		return "ERROR";
	}

}
