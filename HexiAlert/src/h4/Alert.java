/*
 * HexiAlert2
 * v0.1r2
 * 03.02.0214
 * Last Update: 02.03.2014
 * by H4
 * 
 * Send a broadcast type alert to all servers connected to the current proxy session.
 * 
 * TO.DO: 
 * - Server specific alerts
 * - Server specific timed alerts (like AutoAnnouncer)
 * - color support
 * 
 * Alert command file
 */

package h4;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.chat.ComponentBuilder;

public class Alert extends Command {
	private Plugin plugin;
	private String servertag = "&5[&6Hexicraft&5]&f ";
	
    public Alert(Plugin plugin) {
        super("alert","hexialert");
        this.plugin = plugin;
    }
    
    @Override
    public void execute (CommandSender sender, String[] args) {
    	StringBuilder message = new StringBuilder();
    	for (int i = 0; i < args.length; ++i){
    		message.append(args[i] + " ");
    	}
    	String alertMessage = message.toString().trim();
    	if ((sender instanceof ProxiedPlayer)) {
    		plugin.getProxy().broadcast(new ComponentBuilder("").append(ChatColor.translateAlternateColorCodes('&', servertag + alertMessage)).create());
    	}
    }
}


