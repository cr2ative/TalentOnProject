package kr.talenton.web.vo;

import java.util.Date;

public class Bid {  
	
	private String member_id; //�⺻Ű, �ܷ�Ű
	private int product_code; //�⺻Ű, �ܷ�Ű
	private Date date; //�⺻Ű
	private int price;
	private int pay_amount;
	private Date pay_date;
	private String pay_type; //�ܷ�Ű
	
	
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
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPay_amount() {
		return pay_amount;
	}
	
	public void setPay_amount(int pay_amount) {
		this.pay_amount = pay_amount;
	}
	
	public Date getPay_date() {
		return pay_date;
	}
	
	public void setPay_date(Date pay_date) {
		this.pay_date = pay_date;
	}
	
	public String getPay_type() {
		return pay_type;
	}
	
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	
	

}
