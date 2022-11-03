package plugins.qignyu.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import plugins.qignyu.modules.BetterHarvestingCrop;

public class PlayerInteract implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (event.getHand() == EquipmentSlot.HAND) {
                if (BetterHarvestingCrop.LoadBetterHarvestingCrop(event.getClickedBlock(), event.getPlayer())){ event.setCancelled(true);};
            }
        }
    }
}
