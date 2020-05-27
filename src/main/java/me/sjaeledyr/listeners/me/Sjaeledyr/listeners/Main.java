package me.Sjaeledyr.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import me.Sjaeledyr.listeners.join.JoinListener;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
	}
}
