package me.Hydroxide.Druggies;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class EventListener implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Inventory playerInven = player.getInventory();
		
		if(new Cocaine().hasCocaine(playerInven) == true) {	
		
		player.sendMessage(ChatColor.RED + "You already have cocaine. No more for you.");
		}
		
		else {
			
			new Cocaine().addCocaine(playerInven);
		}
	}
}
