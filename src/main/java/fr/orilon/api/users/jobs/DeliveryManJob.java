package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class DeliveryManJob implements Job {
    @Override
    public String getName() {
        return "Livreur";
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
