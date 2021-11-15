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
        super(player.getWorld(), new Cuboid(new Location(player.getWorld(), 444, 47, 138), new Location(player.getWorld(), 444, 44, 142)), false,
                "entrepot", jobTaskInfos);

        this.setRunnable(new BukkitRunnable() {
            @Override
            public void run() {
                if (!destination.hasPlayerInside(player)) {
                    player.sendActionBar(Component.text("§6Allez à x: 441, y: 44, z: 140 !"));
                } else {
                    player.sendMessage("§aVous êtes bien arrivé !");
                    this.cancel();
                    setEnd(true);

                    final Cuboid[] cuboids = {
                            new Cuboid(new Location(player.getWorld(), 364, 45, 3), new Location(player.getWorld(), 364, 45, 3))
                    };

                    final Cuboid cuboid = cuboids[new Random().nextInt(cuboids.length)];

                    new DeliverTask(player, cuboid, jobTaskInfos).getRunnable().runTaskTimerAsynchronously(api.getPlugin(), 0, 20);
                }
            }
        });
    }
}
