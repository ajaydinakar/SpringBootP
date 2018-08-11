package com.ajay.springboot.SimpleRestController;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ajay.springboot.SimpleRestController.domains.*;

@RestController
@RequestMapping("/body")
public class Handler1 {
	
	Team team;
	@PostConstruct
	public void init() 
	{
		Set<Player> players=new HashSet<>();
		players.add(new Player("Sachin","batsman",10));
		players.add(new Player("Yuvraj","batsman",12));
		players.add(new Player("Dhoni","batsman",7));
		team=new Team("India","blue",1,players);
	}
@RequestMapping("/msg")
	public String map1()
	{
	return "This is a simple boot program";
	}
@RequestMapping("/json")

public Team map2()
{
return team ;
}
}
