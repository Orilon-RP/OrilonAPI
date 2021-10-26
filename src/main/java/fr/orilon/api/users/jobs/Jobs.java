package fr.orilon.api.users.jobs;

import fr.orilon.api.users.Job;

import java.util.HashMap;
import java.util.Map;

public enum Jobs {
    CITIZEN(new CitizenJob()),
    MINER(new MinerJob()),
    FARMER(new FarmerJob()),
    TAXI(new TaxiJob()),
    CLEANER(new CleanerJob()),
    COOKER(new CookerJob()),
    DOCTOR(new DoctorJob()),
    POLICE(new PoliceJob()),
    DELIVERY_MAN(new DeliveryManJob()),
    JEWELER(new JewelerJob()),
    MECHANIC(new MechanicJob()),
    GUNSMITH(new GunsmithJob()),
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
