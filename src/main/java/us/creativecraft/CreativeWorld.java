package us.creativecraft;

import org.bukkit.plugin.java.JavaPlugin;
import us.creativecraft.Commands.CommandProcessor;
import us.creativecraft.Commands.GetWorldCommand;
import us.creativecraft.Language.Language;
import us.creativecraft.Utilities.Logger;

public class CreativeWorld extends JavaPlugin {

    private static CreativeWorld instance;
    private Language language;
    private String serverFork;

    @Override
    public void onEnable() {
        instance = this;
        initCommands();
        language = new Language();
        serverFork = getServerFork();
        if(!serverFork.equalsIgnoreCase("paper")) {
            Logger.log("PaperMC (https://papermc.io/) is recommended with this plugin.");
        }



    }

    public static CreativeWorld getInstance() {
        return instance;
    }

    private void initCommands() {
        CommandProcessor.addCommand("getworld", new GetWorldCommand());
        CommandProcessor.processCommands();
    }


    public String getServerFork(){
        try {
            Class.forName("com.destroystokyo.paper.PaperConfig");
            return "paper";
        } catch (Exception e) {
            try {
                Class.forName("org.spigotmc.SpigotConfig");
                return "spigotmc";
            } catch (Exception e2) {
                return "craftbukkit";
            }
        }
    }


}
