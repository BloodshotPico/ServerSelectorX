package xyz.derkades.serverselectorx;

import com.mitch528.sockets.events.MessageReceivedEvent;
import com.mitch528.sockets.events.MessageReceivedEventListener;

public class PlaceholderReceiver /*implements PluginMessageListener*/ implements MessageReceivedEventListener {

	@Override
	public void messageReceived(MessageReceivedEvent event) {
		Main.getPlugin().getLogger().info("Recieved message: " + event.getMessage());
	}
	
	/*@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] message) {
		System.out.println("Recieved message with channel: " + channel);
		
		if (!channel.equals("ServerSelectorX-Placeholder")) return;
		
		ByteArrayDataInput in = ByteStreams.newDataInput(message);
		String subchannel = in.readUTF();
		short len = in.readShort();
		byte[] msgbytes = new byte[len];
		in.readFully(msgbytes);
		
		System.out.println("Subchannel: " + subchannel);
		
		if (subchannel.equals("PlayerCount")) {
			DataInputStream msgin = new DataInputStream(new ByteArrayInputStream(msgbytes));
			try {
				String serverName = msgin.readUTF();
				String placeholder = msgin.readUTF();
				String output = msgin.readUTF();
				
				System.out.println("serverName: " + serverName);
				System.out.println("placeholder: " + placeholder);
				System.out.println("output: " + output);
				
				Map<String, String> placeholders;
				
				if (Main.PLACEHOLDERS.containsKey(serverName)) {
					placeholders = Main.PLACEHOLDERS.get(serverName);
				} else {
					placeholders = new HashMap<>();
				}
				
				placeholders.put(placeholder, output);
				
				Main.PLACEHOLDERS.put(serverName, placeholders);
				Main.LAST_INFO_TIME.put(serverName, System.currentTimeMillis());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}*/

}