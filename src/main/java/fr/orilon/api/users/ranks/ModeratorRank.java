package fr.orilon.api.users.ranks;

import fr.orilon.api.users.Rank;
import org.bukkit.ChatColor;

public class ModeratorRank implements Rank {
    @Override
    public String getName() {
        return "Modérateur";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.DARK_BLUE;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
