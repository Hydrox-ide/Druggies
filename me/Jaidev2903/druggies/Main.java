package me.Jaidev2903.druggies;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getLogger().info("Police are looking for us, but they haven't found us yet..");
	}

	public void onDisable() {
		getLogger().info("SHIT! The police are here! Shut down the lab and let's get the fuck outta here!");
	}
	
}
