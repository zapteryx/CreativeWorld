package us.creativecraft;

import org.bukkit.plugin.java.JavaPlugin;
import us.creativecraft.Commands.CommandProcessor;
import us.creativecraft.Language.Language;

public class CreativeWorld extends JavaPlugin {

    private static CreativeWorld instance;
    private Language language;
    @Override
    public void onEnable() {
        instance = this;
        initCommands();
        language = new Language();
    }

    public static CreativeWorld getInstance() {
        return instance;
    }

    private void initCommands() {
        CommandProcessor.addCommand(null, null);
        CommandProcessor.processCommands();
    }

}
