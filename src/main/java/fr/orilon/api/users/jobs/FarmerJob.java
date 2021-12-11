package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class FarmerJob implements IJob {
    @Override
    public String getName() {
        return "Fermier";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GREEN;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
