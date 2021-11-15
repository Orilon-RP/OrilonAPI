package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.Task;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.List;

public class CitizenJob implements Job {
    @Override
    public String getName() {
        return "Citoyen";
    }

    @Override
    public ChatColor getColor() {
        return ChatColor.GRAY;
    }

    @Override
    public String getColorizedName() {
        return getColor() + getName();
    }

    @Override
    public List<Task> getTasks(Player player, API api) {
        return null;
    }
}
