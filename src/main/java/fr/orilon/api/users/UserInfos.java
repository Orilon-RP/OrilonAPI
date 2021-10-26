package fr.orilon.api.users;

import fr.orilon.api.users.jobs.Job;
import fr.orilon.api.users.ranks.Rank;

public class UserInfos {
    private Rank rank;
    private Job job;
    private int money;

    public UserInfos() {
        this(null, null, 0);
    }

    public UserInfos(Rank rank, Job job, int money) {
        this.rank = rank;
        this.job = job;
        this.money = money;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}