package fr.orilon.api.users.jobs.tasks.deliveryman;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import fr.orilon.api.users.jobs.tasks.Task;
import fr.orilon.api.utils.Cuboid;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class DeliverTask extends Task {

    public DeliverTask(Player player, Cuboid cuboid, JobTaskInfos jobTaskInfos) {
        super(player.getWorld(), cuboid, false, "deliver", jobTaskInfos);

        this.setRunnable(new BukkitRunnable() {
            @Override
            public void run() {
                if (end) {
                    this.cancel();
                    setEnd(true);
                    jobTaskInfos.setEnd(true);

                    player.sendMessage("§aMission finie !");
                } else {
                    player.sendActionBar(Component.text("§6Allez livrer un coli à x: " + cuboid.getXmax() + ", y: " + cuboid.getYmax() + ", z: " + cuboid.getZmax()));
                }
            }
        });
    }
}
