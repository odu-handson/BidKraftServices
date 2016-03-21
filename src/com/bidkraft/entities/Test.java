package com.bidkraft.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test")
public class Test implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String msg;
	
	public Test()
	{
		
	}
	
	public Test(int id,String msg)
	{
		this.id=id;
		this.msg=msg;
	}

	@Id
	@Column(name="id",unique=true,nullable=false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Id
	@Column(name="msg",nullable=false)
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
