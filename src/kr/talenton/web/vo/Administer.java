package kr.talenton.web.vo;

import java.util.Date;

public class Administer {
	
	private String member_id; // �⺻Ű, �ܷ�Ű
	private String administrator_id; // �⺻Ű, �ܷ�Ű
	private Date date; // �⺻Ű
	private String content;
	

	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public String getAdministrator_id() {
		return administrator_id;
	}
	
	public void setAdministrator_id(String administrator_id) {
		this.administrator_id = administrator_id;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	

}
