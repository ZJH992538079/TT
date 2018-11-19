package cn.laeni.project1.service;

import java.util.List;

import cn.laeni.project1.entity.ApiJson;
import cn.laeni.project1.entity.Forum;

public interface UserForumService {
	/**
	 * 根据用户的Id查询帖子的内容
	 * @param userId
	 * @return
	 */
	List<Forum> selectForumByUserId(String userId);
	
	/**
	 * 根据帖子的Id查询帖子的内容
	 * @param id
	 * @return
	 */
	
	Forum selectByPrimaryKey(Integer id);
	
	/**
	 * 根据得到的userId和相应的贴子id修改贴子内容
	 * @param forum
	 * @return
	 */
	int upDateByUserId (Forum forum);

	ApiJson deletetForum(Integer id);

	/**
	 * 发帖
	 * @param title
	 * @param userId
	 * @param typeId
	 * @param value
	 * @return
	 */
	String insertForum(String title, String userId, int typeId, String value );


}
