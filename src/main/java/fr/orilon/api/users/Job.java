package fr.orilon.api.users;

import org.bukkit.ChatColor;

public interface Job {
    String getName();

    ChatColor getColor();

    String getColorizedName();

    int getPrice();
}
