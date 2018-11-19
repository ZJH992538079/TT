package cn.laeni.project1.mapper.dynaSqlProvider;

import cn.laeni.project1.entity.Forum;
import org.apache.ibatis.jdbc.SQL;

public class ForumDynamic {
	/**
	 * "update forum",
	 * 			"set title = #{title},",
	 * 			"value = #{value}",
	 * 			"where id = #{id}",
	 * 			"and user_id = #{userId}"
	 * @return
	 */
	public String upDateByUserId(Forum record){
		String sql = new SQL() {
			{
				UPDATE("forum");
				if (record.getTitle() != null) {
					SET("title = #{title}");
				}
				if (record.getValue() != null) {
					SET("value = #{value}");
				}
				WHERE("id = #{id}");
			}
		}.toString();

		System.out.println(sql);

		return sql;
	}

}
