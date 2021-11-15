package fr.orilon.api.users.jobs;

import fr.orilon.api.API;
import fr.orilon.api.users.jobs.tasks.Task;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public interface Job {
    String getName();

    ChatColor getColor();

    String getColorizedName();

    default List<Task> getTasks(Player player, API api) {
        return new ArrayList<>();
    }

    // on verra après
    // int getPrice();
}
