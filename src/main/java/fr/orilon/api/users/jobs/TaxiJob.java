package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class TaxiJob implements Job {
    @Override
    public String getName() {
        return "Taxi";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.YELLOW;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
