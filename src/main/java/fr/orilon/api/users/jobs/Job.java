package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public interface Job {
    String getName();

    ChatColor getColor();

    String getColorizedName();

    // on verra après
    // int getPrice();
}
