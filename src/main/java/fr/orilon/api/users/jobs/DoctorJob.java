package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class DoctorJob implements IJob {
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
