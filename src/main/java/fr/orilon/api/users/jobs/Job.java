package fr.orilon.api.users.jobs;

import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import org.bukkit.ChatColor;

public record Job(String name, ChatColor color,
                  JobTaskInfos jobTaskInfos) {

    public String getName() {
        return name;
    }

    public ChatColor getColor() {
        return color;
    }

    public String getColorizedName() {
        return color + name;
    }

    public JobTaskInfos getJobTaskInfos() {
        return jobTaskInfos;
    }
}
