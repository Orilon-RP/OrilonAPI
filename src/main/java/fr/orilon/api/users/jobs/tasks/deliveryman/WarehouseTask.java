package fr.orilon.api.users.jobs.tasks.deliveryman;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import fr.orilon.api.users.jobs.tasks.Task;
import fr.orilon.api.utils.Cuboid;
import net.kyori.adventure.text.Component;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Random;

public class WarehouseTask extends Task {
    public WarehouseTask(Player player, JobTaskInfos jobTaskInfos, API api) {
        super(player.getWorld(), new Cuboid(new Location(player.getWorld(), 455.3, 67, 162.7), new Location(player.getWorld(), 451.3, 61, 166.7)), false,
                "entrepot", jobTaskInfos);

        this.setName("§7§oAllez chercher un colis à x: 452, y: 63, z: 160");

        this.setRunnable(new BukkitRunnable() {
            @Override
            public void run() {
                if (!destination.hasPlayerInside(player)) {
                    player.sendActionBar(Component.text("§6Allez à x: 452, y: 63, z: 160 !"));
                } else {
                    player.sendMessage("§aVous êtes bien arrivé !");
                    this.cancel();
                    setEnd(true);

                    final Cuboid[] cuboids = {
                            new Cuboid(new Location(player.getWorld(), 452.3, 67, 171.7), new Location(player.getWorld(), 448.3, 61, 175.7)),
                            new Cuboid(new Location(player.getWorld(), 451.3, 67, 180.7), new Location(player.getWorld(), 447.3, 61, 184.7)),
                    };

                    final Cuboid cuboid = cuboids[new Random().nextInt(cuboids.length)];

                    final DeliverTask deliverTask = new DeliverTask(player, cuboid, jobTaskInfos, api);
                    jobTaskInfos.setActualTask(deliverTask);
                    jobTaskInfos.getTasks().add(deliverTask);
                    api.getJobTasksInfos().remove(jobTaskInfos);
                    api.getJobTasksInfos().add(jobTaskInfos);

                    player.sendMessage("§6Allez livrer le colis ! §7§o(x: " + cuboid.getXmax() + ", y: " + cuboid.getYmax() + ", z: " + cuboid.getZmax());

                    deliverTask.getRunnable().runTaskTimerAsynchronously(api.getPlugin(), 0, 20);
                }
            }
        });
    }
}
