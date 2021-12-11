package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class JewelerJob implements IJob {
    @Override
    public String getName() {
        return "Bijoutier";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.LIGHT_PURPLE;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
