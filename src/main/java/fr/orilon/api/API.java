package fr.orilon.api;

import fr.orilon.api.database.DatabaseManager;
import fr.orilon.api.managers.UserManager;
import org.bukkit.plugin.java.JavaPlugin;

public interface API {
    JavaPlugin getPlugin();

    DatabaseManager getDatabaseManager();

    UserManager getUserManager();
}
