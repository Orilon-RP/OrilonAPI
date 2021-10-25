package fr.orilon.api.managers;

import fr.orilon.api.users.User;
import org.bukkit.entity.Player;

import java.util.UUID;
import java.util.function.Consumer;

public interface UserManager {
    void createUser(Player player);

    void createUser(User user);

    void deleteUser(User user);

    void deleteUser(UUID uuid);

    void deleteUser(String playerName);

    void updateUser(User newUser);

    User getUser(String playerName);

    User getUser(UUID uuid);

    User getUser(Player player);
}
