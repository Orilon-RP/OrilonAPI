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
        super(player.getWorld(), new Cuboid(new Location(player.getWorld(), 454, 65, 163), new Location(player.getWorld(), 451, 62, 166)), false,
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
                            new Cuboid(new Location(player.getWorld(), 451, 65, 172), new Location(player.getWorld(), 448, 62, 175)),
                            new Cuboid(new Location(player.getWorld(), 450, 65, 181), new Location(player.getWorld(), 447, 62, 184)),
                    };

                    final Cuboid cuboid = cuboids[new Random().nextInt(cuboids.length)];

                    final DeliverTask deliverTask = new DeliverTask(player, cuboid, jobTaskInfos);
                    jobTaskInfos.setActualTask(deliverTask);
                    jobTaskInfos.getTasks().add(deliverTask);

                    deliverTask.getRunnable().runTaskTimerAsynchronously(api.getPlugin(), 0, 20);
                }
            }
        });
    }
}
