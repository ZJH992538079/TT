package cn.laeni.project1.mapper;

import java.util.List;

import cn.laeni.project1.entity.Forum;
import cn.laeni.project1.mapper.dynaSqlProvider.ForumDynamic;
import org.apache.ibatis.annotations.*;

public interface ForumMapper {
	@Delete({
			"delete from forum",
			"where id = #{id,jdbcType=INTEGER}"
	})
	int deleteByPrimaryKey(Integer id);

	@Insert({
			"insert into forum (id, title, ",
			"cover, user_id, type_id, ",
			"value)",
			"values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
			"#{cover,jdbcType=VARCHAR}, #{userId,jdbcType=CHAR}, #{typeId,jdbcType=INTEGER}, ",
			"#{value,jdbcType=LONGVARCHAR})"
	})
	int insert(Forum record);

	/**
	 * 使用动态SQL修改帖子
	 * @param record
	 * @return
	 */
	@UpdateProvider(type = ForumDynamic.class,method = "upDateByUserId")
	int upDateByUserId(Forum record);

	int insertSelective(Forum record);

	@Select({
			"select",
			"id, title, cover, user_id, type_id, value",
			"from forum",
			"where id = #{id,jdbcType=INTEGER}"
	})
	@ResultMap("ResultMapWithBLOBs")
	Forum selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Forum record);

	@Update({
			"update forum",
			"set title = #{title,jdbcType=VARCHAR},",
			"cover = #{cover,jdbcType=VARCHAR},",
			"user_id = #{userId,jdbcType=CHAR},",
			"type_id = #{typeId,jdbcType=INTEGER},",
			"value = #{value,jdbcType=LONGVARCHAR}",
			"where id = #{id,jdbcType=INTEGER}"
	})
	int updateByPrimaryKeyWithBLOBs(Forum record);

	@Update({
			"update forum",
			"set title = #{title,jdbcType=VARCHAR},",
			"cover = #{cover,jdbcType=VARCHAR},",
			"user_id = #{userId,jdbcType=CHAR},",
			"type_id = #{typeId,jdbcType=INTEGER}",
			"where id = #{id,jdbcType=INTEGER}"
	})
	int updateByPrimaryKey(Forum record);

	/**
	 * 根据用户Id查出该用户的所有帖子
	 *
	 * @param userId
	 * @return
	 */
	@Select({
			"select",
			"id, title, cover, user_id, type_id, `value`",
			"from forum",
			"where user_id = #{userId,jdbcType=CHAR}"
	})
	@ResultMap("ResultMapWithBLOBs")
	List<Forum> selectByUserId(String userId);
	
	
    @Select({
    	"select",
        "id, title, cover, user_id, type_id, value",
        "from forum",
        "order by rand() limit 3"
    })
    @ResultMap("cn.laeni.project1.mapper.ForumMapper.ResultMapWithBLOBs")
    List<Forum> selectForumLast3();

    @Select("select id,title,cover,user_id,type_id,value from forum where type_id=#{typeId}")
    @ResultMap("cn.laeni.project1.mapper.ForumMapper.ResultMapWithBLOBs")
    List<Forum> selectForumByTypeId(String typeId);
}