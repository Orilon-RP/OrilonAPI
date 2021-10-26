package fr.orilon.api.users.ranks;

import org.bukkit.ChatColor;

public class PlayerRank implements Rank {
    @Override
    public String getName() {
        return "Joueur";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GRAY;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
