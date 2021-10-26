package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class PoliceJob implements Job {
    @Override
    public String getName() {
        return "Police";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.AQUA;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
