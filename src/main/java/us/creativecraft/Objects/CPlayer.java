package us.creativecraft.Objects;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

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
}
