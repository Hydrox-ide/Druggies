package me.Jaidev2903.druggies;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.Inventory;

public class EventListener extends Main implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		Inventory playerInven = player.getInventory();
		
		new Cocaine().addCocaine(playerInven);
	}
	
}
