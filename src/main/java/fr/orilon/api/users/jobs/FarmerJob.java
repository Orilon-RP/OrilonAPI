package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class FarmerJob implements Job {
    @Override
    public String getName() {
        return "Fermier";
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
