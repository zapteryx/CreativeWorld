package us.creativecraft.Language;

import org.bukkit.ChatColor;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import us.creativecraft.CreativeWorld;
import us.creativecraft.Utilities.Logger;

import java.io.File;
import java.io.IOException;

/**
 *  Language class for all the plugin messages. Other languages will be added in future
 *  release.
 *
 * @author: GTA5Racer
 *
 */
public class Language {

    private File languageFile;
    private FileConfiguration language;


    public static String prefix = ChatColor.AQUA + "[CreativeWorld] " + ChatColor.RESET;
    public static String no_Perm;

    public Language(){
        loadLanguageFile();
        Logger.log("Loaded language file");
    }


    private void loadAllNodes(){
        no_Perm = prefix + loadNodeFromConfig("no_Perm");
    }


    private String loadNodeFromConfig(String language_node){
        return ChatColor.translateAlternateColorCodes('&', language.getString(language_node));
    }

    private void loadLanguageFile() {
        languageFile = new File(CreativeWorld.getInstance().getDataFolder(), "language.yml");
        if (!languageFile.exists()) {
            languageFile.getParentFile().mkdirs();
            CreativeWorld.getInstance().saveResource("language.yml", false);
        }

        language = new YamlConfiguration();
        loadAllNodes();
        try {
            language.load(languageFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
