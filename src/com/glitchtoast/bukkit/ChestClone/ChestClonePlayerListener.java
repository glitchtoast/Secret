package com.glitchtoast.bukkit.ChestClone;

import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.entity.Player;
import com.glitchtoast.bukkit.ChestClone.ChestClone;

/**
 * Handle events for all Player related events
 * @author <yourname>
 */
public class ChestClonePlayerListener extends PlayerListener {
    public static ChestClone plugin;
    public ChestClonePlayerListener(ChestClone plugin) {
        this.plugin = plugin;
    }

    
	public void onPlayerCommand(PlayerChatEvent event) {
		String[] split = event.getMessage().split(" ");
		Player player = event.getPlayer();
		if ((split[0].equalsIgnoreCase("/cc on"))
				|| (split[0].equalsIgnoreCase("/cc off"))) {
					plugin.toggleVision(player);
					event.setCancelled(true);
				}
	}
	
}
