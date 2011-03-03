package com.glitchtoast.bukkit.ChestClone;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import com.glitchtoast.bukkit.ChestClone.ChestClonePlayerListener;

/**
 * <pluginname> block listener
 * @author <yourname>
 */
public class ChestCloneBlockListener extends BlockListener {
	private final ChestClone plugin;

    public ChestCloneBlockListener(ChestClone plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
    public void onBlockPlace(BlockPlaceEvent event) {
    	Player player = event.getPlayer();
    	Block block = event.getBlockPlaced();
    	
    	if(block.getType() == Material.CHEST && ChestClonePlayerListener.plugin.enabled(player))
    		player.sendMessage("Chest Placed");
    	}
    		
    	
    }
