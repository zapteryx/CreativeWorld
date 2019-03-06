package us.creativecraft.Objects;

import org.bukkit.World;

public class CWorld {

    private CPlayer owner;
    private World world;

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    public CPlayer getOwner() {
        return owner;
    }

    public void setOwner(CPlayer owner) {
        this.owner = owner;
    }
}
