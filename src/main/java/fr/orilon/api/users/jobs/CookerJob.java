package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class CookerJob implements IJob {
    @Override
    public String getName() {
        return "Cuisinier";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GOLD;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
