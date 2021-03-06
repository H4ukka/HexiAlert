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
 * Main plug-in file
 */

package h4;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class HexiAlert extends Plugin{
	
	@Override
	public void onEnable() {
		ProxyServer.getInstance().getPluginManager().registerCommand(this, new Alert(this));
	}

}
