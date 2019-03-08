package us.creativecraft.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import us.creativecraft.Language.Language;
import us.creativecraft.Objects.CPlayer;

public class GetWorldCommand implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        CPlayer cPlayer = CPlayer.get(commandSender.getName());
        Player player = cPlayer.getPlayer();

        if(player.hasPermission("creativeworld.getworld")){
            player.sendMessage(Language.no_Perm);
            return true;
        }

        return false;
    }
}
