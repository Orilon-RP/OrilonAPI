package fr.orilon.api.users;

import org.bukkit.entity.Player;

import java.util.UUID;

public class User {
    private final Player player;
    private UserInfos infos;

    public User(Player player, UserInfos infos) {
        this.player = player;
        this.infos = infos;
    }

    public Player getPlayer() {
        return player;
    }

    public String getName() {
        return player.getName();
    }

    public UUID getUniqueId() {
        return player.getUniqueId();
    }

    public UserInfos getInfos() {
        return infos;
    }

    public void setInfos(UserInfos infos) {
        this.infos = infos;
    }
}