package me.joshuacho.BotOne;

import javax.security.auth.login.LoginException;

import events.HelloEvent;
import events.MessageDelete;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {
	public static void main(String[] args) throws LoginException {
		
		JDA jda = new JDABuilder("NzIwMzE0NTk1ODM5MDQ5NzY4.XuELVw.PFfZKg4wX0g2GvWOr7BqwCPC7JI").build();
		
		jda.addEventListener(new HelloEvent());
		jda.addEventListener(new MessageDelete());
		
	}
}
