package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class CitizenJob implements IJob {
    @Override
    public String getName() {
        return "Citoyen";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GRAY;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }

    @Override
    public JobTaskInfos getTaskInfos(Player player, API api) {
        return null;
    }
}
