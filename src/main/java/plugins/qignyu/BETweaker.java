package plugins.qignyu;

import org.bukkit.plugin.java.JavaPlugin;
import plugins.qignyu.listeners.PlayerInteract;

public final class BETweaker extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("BETweaker is enabled!");
        getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

    }
}
