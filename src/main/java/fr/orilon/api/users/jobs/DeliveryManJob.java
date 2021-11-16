package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import fr.orilon.api.users.jobs.tasks.deliveryman.WarehouseTask;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

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
    public JobTaskInfos getTaskInfos(Player player, API api) {
        final JobTaskInfos jobTaskInfos = new JobTaskInfos(player.getUniqueId());

        jobTaskInfos.setJobTask(() -> {
            player.sendMessage("§6Allez chercher un colis à l'entrepôt ! §7§o(x: 452, y: 63, z: 160)");
            final WarehouseTask warehouseTask = new WarehouseTask(player, jobTaskInfos, api);
            jobTaskInfos.getTasks().add(warehouseTask);
            jobTaskInfos.setActualTask(warehouseTask);

            warehouseTask.getRunnable().runTaskTimerAsynchronously(api.getPlugin(), 0, 20);
        });

        return jobTaskInfos;
    }
}
