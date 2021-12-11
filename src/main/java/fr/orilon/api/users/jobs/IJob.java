package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public interface IJob {
    String getName();

    ChatColor getColor();

    String getColorizedName();

    default JobTaskInfos getTaskInfos(Player player, API api) {
        return null;
    }
}
