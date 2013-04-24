package com.github.phlopsi.noflintandsteel;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoFlintAndSteel extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	@EventHandler(ignoreCancelled = true)
	public void craftFlintAndSteel(CraftItemEvent event) {
		if (event.getRecipe().getResult().getType() == Material.FLINT_AND_STEEL) {
			event.setCancelled(true);
		}
	}
}
