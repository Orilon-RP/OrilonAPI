package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class CitizenJob implements Job {
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
}
