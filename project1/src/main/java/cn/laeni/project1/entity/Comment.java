package cn.laeni.project1.entity;

public class Comment {
    private String commentId;

    private Integer forumId;

    private String userId;

    private String commentValue;

    @Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", forumId=" + forumId + ", userId=" + userId + ", commentValue="
				+ commentValue + "]";
	}

	public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCommentValue() {
        return commentValue;
    }

    public void setCommentValue(String commentValue) {
        this.commentValue = commentValue;
    }
}