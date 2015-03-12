package me.Hydroxide.Druggies;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Cocaine {
	
	public void addCocaine(Inventory inven) {
		ItemStack cocaine = new ItemStack(Material.SUGAR);
		ItemMeta cocaineMeta = cocaine.getItemMeta();
		cocaineMeta.setDisplayName(ChatColor.DARK_AQUA + "Cocaine");
		cocaine.setItemMeta(cocaineMeta);
		
		inven.addItem(cocaine);
	}
	
	public boolean hasCocaine(Inventory inven) {
		if(inven.contains(Material.SUGAR)) {
			return true;
		} else {
		return false;
		}
	}
}
