package fr.orilon.api.users.jobs.tasks;

import fr.orilon.api.API;
import fr.orilon.api.utils.Cuboid;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

public abstract class Task {
    protected World world;
    protected Cuboid destination;
    protected boolean end;
    protected String name;
    protected BukkitRunnable bukkitRunnable = null;
    protected final JobTaskInfos jobTaskInfos;

    public Task(World world, Cuboid destination, boolean end, String name, JobTaskInfos jobTaskInfos) {
        this.world = world;
        this.destination = destination;
        this.end = end;
        this.name = name;
        this.jobTaskInfos = jobTaskInfos;
    }

    public Cuboid getDestination() {
        return destination;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BukkitRunnable getRunnable() {
        return bukkitRunnable;
    }

    public void setRunnable(BukkitRunnable bukkitRunnable) {
        this.bukkitRunnable = bukkitRunnable;
    }

    public JobTaskInfos getJobTaskInfos() {
        return jobTaskInfos;
    }
}
