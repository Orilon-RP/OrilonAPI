package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class MinerJob implements Job {
    @Override
    public String getName() {
        return "Mineur";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GRAY;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
