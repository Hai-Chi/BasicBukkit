import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ClickRight extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("插件已加载");
        Bukkit.getPluginManager().registerEvents(new EventListener(),this);
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已卸载");
    }
}
