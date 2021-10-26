package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;
import org.bukkit.ChatColor;

public class DoctorJob implements Job {
    @Override
    public String getName() {
        return "Médecin";
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
