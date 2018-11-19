package cn.laeni.project1.entity;

public class Forum {
	private Integer id;

	private String title;

	private String cover;

	private String userId;

	private Integer typeId;

	private String value;

	@Override
	public String toString() {
		return "Forum{" +
				"id=" + id +
				", title='" + title + '\'' +
				", cover='" + cover + '\'' +
				", userId='" + userId + '\'' +
				", typeId=" + typeId +
				", value='" + value + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}