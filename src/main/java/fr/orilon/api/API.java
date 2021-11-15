package fr.orilon.api;

import fr.orilon.api.managers.DatabaseManager;
import fr.orilon.api.managers.UserManager;
import fr.orilon.api.users.User;
import fr.orilon.api.users.jobs.tasks.JobTaskInfos;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.UUID;

public interface API {
    JavaPlugin getPlugin();

    DatabaseManager getDatabaseManager();

    void setDatabaseManager(DatabaseManager databaseManager);

    UserManager getUserManager();

    void setUserManager(UserManager userManager);

    List<User> getUsers();

    User getUser(UUID uuid);

    List<JobTaskInfos> getJobTaskInfos();

    JobTaskInfos getPlayerJobTaskInfos();
}
