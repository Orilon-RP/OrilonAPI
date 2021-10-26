package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class JewelerJob implements Job {
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
