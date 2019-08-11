package com.example.robo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RoboStatus {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id",unique=true, nullable = false)
	private Integer id;
	private String name;
	private String status;
	private String action;
	
	
	public RoboStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoboStatus(Integer id, String name, String status, String direction) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.action = direction;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "RoboStatus [id=" + id + ", name=" + name + ", status=" + status + ", action=" + action + "]";
	}
	
	
}
