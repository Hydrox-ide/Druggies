package me.Hydroxide.Druggies;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(new EventListener(), this);
		getLogger().info("Police are looking for us, but they haven't found us yet..");
	}

	public void onDisable() {
		
		getLogger().info("SHIT! The police are here! Shut down the lab and let's get the fuck outta here!");
	}
	
}
	