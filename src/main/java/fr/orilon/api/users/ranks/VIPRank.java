package fr.orilon.api.users.ranks;

import org.bukkit.ChatColor;

public class VIPRank implements Rank {
    @Override
    public String getName() {
        return "VIP";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.YELLOW;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
