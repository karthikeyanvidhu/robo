package com.example.robo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RoboApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboApplication.class, args);
	}
	
	@GetMapping("/")
    public String hello() {
            return "Hello Spring Boot!";
    }
	
	@Autowired
	RoboStatusService rss;
	
	@GetMapping("/direction")
	public String direction() {
		RoboStatus rs=rss.status();
		return rs.getAction()+"|"+rs.getStatus();
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/off")
	public String off() {
		rss.off();
		return "Internet mode Switched Off";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/on")
	public String on() {
		rss.on();
		return "Internet mode Switched On";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/front")
	public String front() {
		rss.front();
		return "front movement initiated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/back")
	public String back() {
		rss.back();
		return "back movement initiated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/right")
	public String right() {
		rss.right();
		return "right movement initiated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/left")
	public String left() {
		rss.left();
		return "left movement initiated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/search")
	public String search() {
		rss.search();
		return "search initiated";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/fire")
	public String fire() {
		rss.fire();
		return "search initiated";
	}
	
	
}
