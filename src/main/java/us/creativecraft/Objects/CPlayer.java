package us.creativecraft.Objects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import us.creativecraft.CManager;

import java.util.UUID;

public class CPlayer {

    private String name;
    private UUID uuid;
    private CWorld world;

    public String getName() {
        return name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public CWorld getWorld() {
        return world;
    }

    public void setWorld(CWorld world) {
        this.world = world;
    }

    public Player getPlayer(){
        return Bukkit.getPlayer(uuid);
    }

    public static CPlayer get(String name){
          return CManager.getCPlayers().stream()
                .filter(cplayer -> name.equalsIgnoreCase(cplayer.getName()))
                .findAny()
                .orElse(null);
    }

    public static CPlayer get(UUID uuid){
        return CManager.getCPlayers().stream()
                .filter(cplayer -> uuid.toString().equalsIgnoreCase(cplayer.getUuid().toString()))
                .findAny()
                .orElse(null);
    }
}
