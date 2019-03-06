package us.creativecraft.Commands;


import org.bukkit.command.CommandExecutor;
import us.creativecraft.CreativeWorld;
import us.creativecraft.Utilities.Logger;

import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {

    public static HashMap<String, Object> commands = new HashMap<String, Object>();

    public static void processCommands(){
        int registeredCommands = 0;

        for(Map.Entry<String, Object> entry : commands.entrySet()){
            CreativeWorld.getInstance().getCommand(entry.getKey()).setExecutor((CommandExecutor) entry.getValue());
            registeredCommands++;
        }

        Logger.Log("Successfully registered " + registeredCommands + " commands.");
    }

    public static void addCommand(String command, Object commandObject){
        commands.put(command, commandObject);
    }
}
