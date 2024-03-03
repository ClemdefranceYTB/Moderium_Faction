package fr.clemdefrance.moderiumplugins;

import org.bukkit.plugin.java.JavaPlugin;

public class ModeriumPlugins extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Plugins Enable");
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Goodbye");
	}


}
