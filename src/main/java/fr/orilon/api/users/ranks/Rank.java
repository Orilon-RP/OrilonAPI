package fr.orilon.api.users.ranks;

import org.bukkit.ChatColor;

public interface Rank {
    String getName();

    ChatColor getColor();

    String getColorizedName();
}
