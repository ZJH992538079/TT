package cn.laeni.project1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import cn.laeni.project1.entity.Comment;

public interface CommentMapper {
    @Insert({
        "insert into comment (forum_id,",
        "user_id, comment_value)",
        "values (#{forumId},#{userId},#{commentValue})"
    })
//    @Options(useGeneratedKeys=true, keyProperty="commentId", keyColumn="comment_id")
    int insertComment(Comment comment);

    
    int insertSelective(Comment record);
    

    @Select({
        "select comment_id,forum_id,user_id,comment_value from `comment` WHERE forum_id=#{forumId}",
    })
    @ResultMap("ResultMapWithBLOBs")
    List<Comment> selectCommentById(Integer forumId);
}