package fr.orilon.api.users.ranks;

import fr.orilon.api.users.Rank;
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
