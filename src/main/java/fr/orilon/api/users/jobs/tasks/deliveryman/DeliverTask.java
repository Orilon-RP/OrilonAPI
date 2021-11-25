package fr.orilon.api.users.jobs.tasks.deliveryman;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import fr.orilon.api.users.jobs.tasks.Task;
import fr.orilon.api.utils.Cuboid;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class DeliverTask extends Task {

    public DeliverTask(Player player, Cuboid cuboid, JobTaskInfos jobTaskInfos, API api) {
        super(player.getWorld(), cuboid, false, "deliver", jobTaskInfos);

        this.setName("§7§oAllez livrer le colis à x: " + cuboid.getXmax() + ", y: " + cuboid.getYmax() + ", z: " + cuboid.getZmax());

        this.setRunnable(new BukkitRunnable() {
            @Override
            public void run() {
                if (!cuboid.hasPlayerInside(player)) {
                    player.sendActionBar(Component.text("§6Allez livrer le coli à x: " + cuboid.getXmax() + ", y: " + cuboid.getYmax() + ", z: " + cuboid.getZmax()));
                } else {
                    this.cancel();
                    jobTaskInfos.setEnd(true);
                    jobTaskInfos.setActualTask(null);

                    player.sendMessage("§aMission finie !");

                    api.getJobTasksInfos().remove(jobTaskInfos);
                }
            }
        });
    }
}
