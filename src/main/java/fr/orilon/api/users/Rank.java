package fr.orilon.api.users;

import org.bukkit.ChatColor;

public interface Rank {
    String getName();

    ChatColor getColor();

    String getColorizedName();
}
