package plugins.qignyu.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player players = event.getPlayer();
        event.setJoinMessage(ChatColor.BLUE + "你好啊, " + players.getName() + "!");
    }
}
