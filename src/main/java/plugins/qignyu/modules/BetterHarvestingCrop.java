package plugins.qignyu.modules;

import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Collection;

public class BetterHarvestingCrop {
    public static void LoadBetterHarvestingCrop(Block block, Player player) {
        if (block != null) {
            BlockData blockData = block.getBlockData();
            if (blockData.getAsString().contains("age=7")) {
                Location pos = block.getLocation();
                block.breakNaturally();
                pos.getBlock().setBlockData(blockData.getMaterial().createBlockData("[age=0]"));
            }
        }
    }
}
