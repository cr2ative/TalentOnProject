package kr.talenton.web.vo;

import java.util.Date;

public class Export {
	
	private String member_id; // �⺻Ű, �ܷ�Ű
	private int product_code; // �⺻Ű, �ܷ�Ű
	private Date date;
	private String sns; // �ܷ�Ű
	
	
	public String getMember_id() {
		return member_id;
	}
	
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	
	public int getProduct_code() {
		return product_code;
	}
	
	public void setProduct_code(int product_code) {
		this.product_code = product_code;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getSns() {
		return sns;
	}
	
	public void setSns(String sns) {
		this.sns = sns;
	}
	
	
	

}
