package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

public class GunsmithJob implements IJob {
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
