package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import fr.orilon.api.users.jobs.tasks.Task;
import fr.orilon.api.users.jobs.tasks.deliveryman.WarehouseTask;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class DeliveryManJob implements Job {
    @Override
    public String getName() {
        return "Livreur";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.BOLD;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }

    @Override
    public List<Task> getTasks(Player player, API api) {
        final JobTaskInfos jobTaskInfos = new JobTaskInfos();

        jobTaskInfos.setJobTask(() -> {
            player.sendMessage("§6Allez chercher un colis à l'entrepôt ! (§7§nx: 441, y: 44, z: 140)");

            new WarehouseTask(player, jobTaskInfos, api).getRunnable().runTaskTimerAsynchronously(api.getPlugin(), 0, 20);
        });

        return jobTaskInfos.getTasks();
    }
}
