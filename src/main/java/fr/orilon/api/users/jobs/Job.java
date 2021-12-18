package fr.orilon.api.users.jobs;

import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import org.bukkit.ChatColor;

public record Job(String getName, ChatColor getColor,
                  JobTaskInfos getJobTaskInfos) {

    public String getColorizedName() {
        return getColor + getName;
    }
}
