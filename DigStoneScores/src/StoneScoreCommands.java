import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;

public class StoneScoreCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player p = (Player) commandSender;
        p.sendMessage(ChatColor.GREEN+"你的石头挖掘数是"+ YamlConfiguration.loadConfiguration(new File(DigStoneScores.instance.getDataFolder(),DigStoneScores.DIG_STONE_SCORE_DATA)).getInt(p.getName()));
        return true;
    }
}
