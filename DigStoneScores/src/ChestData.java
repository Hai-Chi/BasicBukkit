import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ChestData{
    private static Player player=Bukkit.getPlayer("1");
    public static Inventory stoneChestData = Bukkit.createInventory(player,54,"背包");
}
