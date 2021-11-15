package fr.orilon.api.utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

import java.util.*;

/**
 * @author Sorway
 */
public class Cuboid {
    private World w;
    private int xmax;
    private int xmin;
    private int ymax;
    private int ymin;
    private int zmax;
    private int zmin;
    private Location l1;
    private Location l2;

    public Cuboid(Location l1, Location l2) {
        if (l1.getWorld().getName().equals(l2.getWorld().getName())) {
            this.w = l1.getWorld();
            this.xmax = Math.max(l1.getBlockX(), l2.getBlockX());
            this.xmin = Math.min(l1.getBlockX(), l2.getBlockX());
            this.ymax = Math.max(l1.getBlockY(), l2.getBlockY());
            this.ymin = Math.min(l1.getBlockY(), l2.getBlockY());
            this.zmax = Math.max(l1.getBlockZ(), l2.getBlockZ());
            this.zmin = Math.min(l1.getBlockZ(), l2.getBlockZ());
        }
        this.l1 = l1;
        this.l2 = l2;
    }

    public Cuboid(int xmax, int xmin, int ymax, int ymin, int zmax, int zmin, World world) {
        this.w = world;
        this.xmax = xmax;
        this.xmin = xmin;
        this.ymax = ymax;
        this.ymin = ymin;
        this.zmax = zmax;
        this.zmin = zmin;
    }

    public int getXmax() {
        return this.xmax;
    }

    public void setXmax(int xmax) {
        this.xmax = xmax;
    }

    public int getXmin() {
        return this.xmin;
    }

    public void setXmin(int xmin) {
        this.xmin = xmin;
    }

    public int getYmax() {
        return this.ymax;
    }

    public void setYmax(int ymax) {
        this.ymax = ymax;
    }

    public int getYmin() {
        return this.ymin;
    }

    public void setYmin(int ymin) {
        this.ymin = ymin;
    }

    public int getZmax() {
        return this.zmax;
    }

    public void setZmax(int zmax) {
        this.zmax = zmax;
    }

    public int getZmin() {
        return this.zmin;
    }

    public void setZmin(int zmin) {
        this.zmin = zmin;
    }

    public World getWorld() {
        return this.w;
    }

    public void setWorld(World world) {
        this.w = world;
    }

    public Location getL1() {
        return l1;
    }

    public Location getL2() {
        return l2;
    }

    public boolean hasInCuboidWithY(Player player) {
        Location loc = player.getLocation();
        return ymin <= loc.getY() && ymax >= loc.getY() && w.getName().equals(loc.getWorld().getName());
    }

    public boolean hasPlayerInside(Player player) {
        Location loc = player.getLocation();
        return xmin <= loc.getX() && xmax >= loc.getX() && ymin <= loc.getY() && ymax >= loc.getY() && zmin <= loc.getZ() && zmax >= loc.getZ() && w.getName().equals(loc.getWorld().getName());
    }

    public boolean hasBlockInside(Block block) {
        Location loc = block.getLocation();
        return xmin <= loc.getX() && xmax >= loc.getX() && ymin <= loc.getY() && ymax >= loc.getY() && zmin <= loc.getZ() && zmax >= loc.getZ() && w.getName().equals(loc.getWorld().getName());
    }

    public boolean hasBlockInsideNoY(Block block) {
        Location loc = block.getLocation();
        return xmin <= loc.getX() && xmax >= loc.getX() && zmin <= loc.getZ() && zmax >= loc.getZ() && w.getName().equals(loc.getWorld().getName());
    }

    public CuboidIterator iterator() {
        return new CuboidIterator(new Cuboid(xmax, xmin, ymax, ymin, zmax, zmin, w));
    }

    public class CuboidIterator implements Iterator<Block> {

        Cuboid cci;
        World wci;
        int baseX;
        int baseY;
        int baseZ;
        int sizeX;
        int sizeY;
        int sizeZ;
        ArrayList<Block> blocks;
        Map<Location, Material> blocks2;
        ArrayList<Location> blocks3;
        private int x, y, z;

        public CuboidIterator(Cuboid c) {
            this.cci = c;
            this.wci = c.getWorld();
            baseX = getXmin();
            baseY = getYmin();
            baseZ = getZmin();
            sizeX = Math.abs(getXmax() - getXmin()) + 1;
            sizeY = Math.abs(getYmax() - getYmin()) + 1;
            sizeZ = Math.abs(getZmax() - getZmin()) + 1;
            x = y = z = 0;
        }

        public Cuboid getCuboid() {
            return cci;
        }

        public boolean hasNext() {
            return x < sizeX && y < sizeY && z < sizeZ;
        }

        public Block next() {
            Block b = w.getBlockAt(baseX + x, baseY + y, baseZ + z);
            if (++x >= sizeX) {
                x = ymin;
                if (++y >= sizeY) {
                    y = ymin;
                    ++z;
                }
            }
            return b;
        }

        public Map<Location, Material> getBlockAtLocations() {
            blocks2 = new HashMap<>();
            for (int x = cci.getXmin(); x <= cci.getXmax(); x++) {
                for (int y = cci.getYmin(); y <= cci.getYmax(); y++) {
                    for (int z = cci.getZmin(); z <= cci.getZmax(); z++) {
                        blocks2.put(new Location(cci.getWorld(), x, y, z), getWorld().getBlockAt(x, y, z).getType());
                    }
                }
            }
            return blocks2;
        }

        public Collection<Location> getLocations() {
            blocks3 = new ArrayList<>();
            for (int x = cci.getXmin(); x <= cci.getXmax(); x++) {
                for (int z = cci.getZmin(); z <= cci.getZmax(); z++) {
                    blocks3.add(new Location(wci, x, ymin, z));
                }
            }
            return blocks3;
        }

        public Collection<Block> iterateBlocks() {
            blocks = new ArrayList<>();
            for (int x = cci.getXmin(); x <= cci.getXmax(); x++) {
                for (int y = cci.getYmin(); y <= cci.getYmax(); y++) {
                    for (int z = cci.getZmin(); z <= cci.getZmax(); z++) {
                        blocks.add(cci.getWorld().getBlockAt(x, y, z));
                    }
                }
            }
            return blocks;
        }

        public boolean hasInZone(Location location) {
            for (int x = cci.getXmin(); x <= cci.getXmax(); x++) {
                for (int z = cci.getZmin(); z <= cci.getZmax(); z++) {
                    if (location.getBlockX() == x && location.getBlockZ() == z) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
