import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;
import java.util.List;

public class EventListener implements Listener {
    List<Player> joinPlayerList = new ArrayList<>();

    @EventHandler
    public void playerJoin(PlayerJoinEvent e) {
        if (!joinPlayerList.contains(e.getPlayer())) joinPlayerList.add(e.getPlayer());
    }

    @EventHandler
    public void playerMove(PlayerMoveEvent e) {
        if (joinPlayerList.contains(e.getPlayer())) {
            e.getPlayer().sendMessage(ChatColor.RED + "右键以获得移动权限!");
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void rightClick(PlayerInteractEvent e) {
        if (joinPlayerList.contains(e.getPlayer())) {
            if (e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_BLOCK || e.getAction() == Action.LEFT_CLICK_AIR) {
                e.getPlayer().sendMessage(ChatColor.GREEN + "已获得移动权限");
                joinPlayerList.remove(e.getPlayer());
            }
        }
    }
}
