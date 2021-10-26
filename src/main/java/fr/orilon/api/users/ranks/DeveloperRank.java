package fr.orilon.api.users.ranks;

import org.bukkit.ChatColor;

public class DeveloperRank implements Rank {
    @Override
    public String getName() {
        return "Développeur";
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
