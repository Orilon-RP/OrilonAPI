package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class MechanicJob implements Job {
    @Override
    public String getName() {
        return "Garagiste";
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
