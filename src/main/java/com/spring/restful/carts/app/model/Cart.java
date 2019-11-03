package com.spring.restful.carts.app.model;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Cart {
	private long id;
	private String custinfo;
	private String itemcount;
	private String status;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd",timezone = "IST")
	private Date createdate;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SS", timezone = "IST")
	private Timestamp lastmodified;
	
	public Cart() {
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCustinfo() {
		return custinfo;
	}
	public void setCustinfo(String custinfo) {
		this.custinfo = custinfo;
	}
	public String getItemcount() {
		return itemcount;
	}
	public void setItemcount(String itemcount) {
		this.itemcount = itemcount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Timestamp getLastmodified() {
		return lastmodified;
	}
	public void setLastmodified(Timestamp lastmodified) {
		this.lastmodified = lastmodified;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", custinfo=" + custinfo + ", itemcount=" + itemcount + ", status=" + status
				+ ", createdate=" + createdate + ", lastmodified=" + lastmodified + "]";
	}
	

}
