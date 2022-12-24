import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class DigStoneScores extends JavaPlugin {
    public static Plugin instance;
    public static final String DIG_STONE_SCORE_DATA = "DigStoneScore.yml";
    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getPluginManager().registerEvents(new EventListener(),this);
        Bukkit.getPluginCommand("stonescore").setExecutor(new StoneScoreCommands());
        saveResource(DIG_STONE_SCORE_DATA,false);
        getLogger().info("插件已加载");
    }

    @Override
    public void onDisable() {
        getLogger().info("插件已卸载");
    }
}
