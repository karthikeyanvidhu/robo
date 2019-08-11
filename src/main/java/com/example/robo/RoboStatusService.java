package com.example.robo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoboStatusService {

	@Autowired
	private RoboStatusRepository roborepo;
	
	public RoboStatus status(){
		Optional<RoboStatus> rsIf=roborepo.findById(1);
		RoboStatus rs = new RoboStatus();
		if(rsIf.isPresent()) {
			rs=rsIf.get();
		}
		return rs;		
	}
	
	public void off() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("OFF");
		rs.setAction("");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void on() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("FRONT");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void left() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("LEFT");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void right() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("RIGHT");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void front() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("FRONT");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void back() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("BACK");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void search() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("SEARCH");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
	public void fire() {
		RoboStatus rs=new RoboStatus();
		rs.setId(1);
		rs.setName("robo");
		rs.setStatus("ON");
		rs.setAction("FIRE");
		System.out.println(rs);
		roborepo.save(rs);
	}
	
}
