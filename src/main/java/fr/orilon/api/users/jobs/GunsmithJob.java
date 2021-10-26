package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class GunsmithJob implements Job {
    @Override
    public String getName() {
        return "Armurier";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.BLUE;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }
}
