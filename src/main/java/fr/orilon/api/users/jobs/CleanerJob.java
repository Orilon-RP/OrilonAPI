package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class CleanerJob implements Job {
    @Override
    public String getName() {
        return "Nettoyeur";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_GREEN;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
