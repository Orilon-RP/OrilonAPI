package fr.orilon.api.managers;

import fr.orilon.api.users.User;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface UserManager {
    void createUserInDatabase(Player player);

    void createUserInDatabase(User user);

    void deleteUserFromDatabase(User user);

    void deleteUserFromDatabase(UUID uuid);

    void deleteUserFromDatabase(String playerName);

    void updateUserFromDatabase(User newUser);

    User getUserFromDatabase(String playerName);

    User getUserFromDatabase(UUID uuid);

    User getUserFromDatabase(Player player);
}
