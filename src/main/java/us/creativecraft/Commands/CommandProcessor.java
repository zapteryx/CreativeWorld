package us.creativecraft.Commands;


import org.bukkit.command.CommandExecutor;
import us.creativecraft.CreativeWorld;
import us.creativecraft.Utilities.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {

    private static HashMap<String, Object> commands = new HashMap<>();

    public static void processCommands(){
        int registeredCommands = 0;

        for(Map.Entry<String, Object> entry : commands.entrySet()){
            CreativeWorld.getInstance().getCommand(entry.getKey()).setExecutor((CommandExecutor) entry.getValue());
            registeredCommands++;
        }

        Logger.log("Successfully registered " + registeredCommands + " commands.");
    }

    public static void addCommand(String command, Object commandObject){
        commands.put(command, commandObject);
    }
}
