package fr.orilon.api.users.ranks;

import fr.orilon.api.users.Rank;
import org.bukkit.ChatColor;

public class AdministratorRank implements Rank {
    @Override
    public String getName() {
        return "Admin";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.RED;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
