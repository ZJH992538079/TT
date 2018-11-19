package cn.laeni.project1.mapper;

import cn.laeni.project1.entity.ForumType;

public interface ForumTypeMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(ForumType record);

    int insertSelective(ForumType record);

    ForumType selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(ForumType record);

    int updateByPrimaryKey(ForumType record);
}