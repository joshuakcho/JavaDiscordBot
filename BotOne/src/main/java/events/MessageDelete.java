package events;

import net.dv8tion.jda.api.events.message.MessageDeleteEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageDelete extends ListenerAdapter {
	
	public void onMessageDelete(MessageDeleteEvent e) {
		
		String message = e.getMessageId();
		
		e.getChannel().sendMessage("Why delte bruh?").queue();
	}
}
