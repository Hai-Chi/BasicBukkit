import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.io.File;
import java.io.IOException;

public class EventListener implements Listener {
    File stoneDigScoreData = new File(DigStoneScores.instance.getDataFolder(), DigStoneScores.DIG_STONE_SCORE_DATA);

    @EventHandler
    public void playerDigStone(BlockBreakEvent e) throws IOException {
        //e.getPlayer().sendMessage("1");
        if (!e.isCancelled()) {
           // e.getPlayer().sendMessage("1");
                if(e.getBlock().getType()== Material.STONE){
                    //e.getPlayer().sendMessage("1");
                    FileConfiguration config = YamlConfiguration.loadConfiguration(stoneDigScoreData);
                    config.set(e.getPlayer().getName(),config.getInt(e.getPlayer().getName(),0)+1);
                    config.save(stoneDigScoreData);
                }
        }
    }
}
