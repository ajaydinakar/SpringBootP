package com.ajay.springboot.SimpleRestController.domains;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component
@XmlRootElement
public class Team {
String country;
String jerseyColor;
int iccRank;
Set <Player> Players;


public Team() {
	super();
	// TODO Auto-generated constructor stub
}

public Team(String country, String jerseyColor, int iccRank, Set<Player> players) {
	this();
	this.country = country;
	this.jerseyColor = jerseyColor;
	this.iccRank = iccRank;
	Players = players;
}

public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getJerseyColor() {
	return jerseyColor;
}
public void setJerseyColor(String jerseyColor) {
	this.jerseyColor = jerseyColor;
}
public int getIccRank() {
	return iccRank;
}
public void setIccRank(int iccRank) {
	this.iccRank = iccRank;
}
public Set<Player> getPlayers() {
	return Players;
}
public void setPlayers(Set<Player> players) {
	Players = players;
}

}
