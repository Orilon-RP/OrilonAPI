package fr.orilon.api.users.ranks;

import org.bukkit.ChatColor;

public class HelperRank implements Rank {
    @Override
    public String getName() {
        return "Guide";
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
