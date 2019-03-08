package us.creativecraft;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import us.creativecraft.Objects.CPlayer;
import us.creativecraft.Objects.CWorld;

import java.util.ArrayList;
import java.util.UUID;

public class CManager {

    private static ArrayList<CPlayer> cPlayers = new ArrayList<>();
    private static ArrayList<CWorld> cWorlds = new ArrayList<>();


    public static ArrayList<CPlayer> getCPlayers() {
        return cPlayers;
    }

    public static ArrayList<CWorld> getCWorlds() {
        return cWorlds;
    }

    public static void loadCWorld(String uuid){

    }
}
