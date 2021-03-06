package com.bridge.app.domain;

public class AlbumReplyVO {
	private int replyNumber;
	private int albumNumber;
	private int userNumber;
	private String replyContext;
	private int replyGroup;
	private int replyDept;
	private String replyDate;
	
	public int getReplyNumber() {
		return replyNumber;
	}
	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}
	public int getAlbumNumber() {
		return albumNumber;
	}
	public void setAlbumNumber(int albumNumber) {
		this.albumNumber = albumNumber;
	}
	public int getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}
	public String getReplyContext() {
		return replyContext;
	}
	public void setReplyContext(String replyContext) {
		this.replyContext = replyContext;
	}
	public int getReplyGroup() {
		return replyGroup;
	}
	public void setReplyGroup(int replyGroup) {
		this.replyGroup = replyGroup;
	}
	public int getReplyDept() {
		return replyDept;
	}
	public void setReplyDept(int replyDept) {
		this.replyDept = replyDept;
	}
	public String getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(String replyDate) {
		this.replyDate = replyDate;
	}	
}
