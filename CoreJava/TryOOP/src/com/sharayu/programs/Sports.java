package com.sharayu.programs;

import com.sohamglobal.classes.Player;

public class Sports {
	public static void main(String[] args) {
		Player p=new Player();
		//p.playerName="virgil van dijk"; not allowed as it is private
		p.setPlayerName("virgil van dijk");
		p.setAge(29);
		p.setCountry("netherlands");
		p.setClub("liverpool");
		
		System.out.println("Name : "+p.getPlayerName());
		System.out.println("Age : "+p.getAge());
		System.out.println("Country : "+p.getCountry());
		System.out.println("Club : "+p.getClub());
		
	}
	

}
