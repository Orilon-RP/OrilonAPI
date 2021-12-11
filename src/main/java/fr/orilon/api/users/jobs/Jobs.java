package fr.orilon.api.users.jobs;

import org.bukkit.ChatColor;

import java.util.HashMap;
import java.util.Map;

public enum Jobs {
    CITIZEN(new Job("Citoyen", ChatColor.GRAY, null)),
    MINER(new Job("Mineur", ChatColor.GRAY, null)),
    FARMER(new Job("Fermier", ChatColor.GREEN, null)),
    TAXI(new Job("Taxi", ChatColor.YELLOW, null)),
    CLEANER(new Job("Nettoyeur", ChatColor.DARK_GREEN, null)),
    COOKER(new Job("Cuisinier", ChatColor.GOLD, null)),
    DOCTOR(new Job("Médecin", ChatColor.RED, null)),
    POLICE(new Job("Police", ChatColor.AQUA, null)),
    DELIVERY_MAN(new Job("Livreur", ChatColor.GOLD, null)),
    JEWELER(new Job("Bijoutier", ChatColor.LIGHT_PURPLE, null)),
    MECHANIC(new Job("Garagiste", ChatColor.GRAY, null)),
    GUNSMITH(new Job("Armurier", ChatColor.BLUE, null)),
    ;

    private static final Map<String, Jobs> GET_BY_NAME = new HashMap<>();

    static {
        for (Jobs job : values()) {
            GET_BY_NAME.put(job.getJob().getName(), job);
        }
    }

    private final Job job;

    Jobs(Job job) {
        this.job = job;
    }

    public Job getJob() {
        return job;
    }

    public static Jobs getByName(String name) {
        return GET_BY_NAME.get(name);
    }
}
