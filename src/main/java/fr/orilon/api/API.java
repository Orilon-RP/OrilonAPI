package fr.orilon.api;

import fr.orilon.api.managers.DatabaseManager;
import fr.orilon.api.managers.UserManager;
import org.bukkit.plugin.java.JavaPlugin;

public interface API {
    JavaPlugin getPlugin();

    DatabaseManager getDatabaseManager();

    void setDatabaseManager(DatabaseManager databaseManager);

    UserManager getUserManager();

    void setUserManager(UserManager userManager);
}
