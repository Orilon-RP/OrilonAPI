package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class CookerJob implements Job {
    @Override
    public String getName() {
        return "Cuisinier";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.BOLD;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
