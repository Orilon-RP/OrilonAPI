package fr.orilon.api.users.ranks;

import fr.orilon.api.users.Rank;

import java.util.HashMap;
import java.util.Map;

public enum Ranks {
    PLAYER(new PlayerRank()),
    VIP(new VIPRank()),
    HELPER(new HelperRank()),
    MODERATOR(new ModeratorRank()),
    DEVELOPER(new DeveloperRank()),
    ADMINISTRATOR(new AdministratorRank())
    ;

    private static final Map<String, Ranks> GET_BY_NAME = new HashMap<>();

    static {
        for (Ranks rank : values()) {
            GET_BY_NAME.put(rank.getRank().getName(), rank);
        }
    }

    private final Rank rank;

    Ranks(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    public static Ranks getByName(String name) {
        return GET_BY_NAME.get(name);
    }

}
