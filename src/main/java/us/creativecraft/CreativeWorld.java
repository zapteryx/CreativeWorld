package us.creativecraft;

import org.bukkit.plugin.java.JavaPlugin;
import us.creativecraft.Commands.CommandProcessor;

public class CreativeWorld extends JavaPlugin {

    private static CreativeWorld instance;

    @Override
    public void onEnable() {
        instance = this;
        initCommands();
    }

    public static CreativeWorld getInstance() {
        return instance;
    }

    public void initCommands() {
        CommandProcessor.addCommand(null, null);
        CommandProcessor.processCommands();
    }
}
