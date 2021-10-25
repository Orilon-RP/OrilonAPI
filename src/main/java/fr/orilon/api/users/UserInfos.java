package fr.orilon.api.users;

public class UserInfos {
    private Rank userRank;
    private int money;

    public UserInfos() {
        userRank = null;
        money = 0;
    }

    public Rank getUserRank() {
        return userRank;
    }

    public void setUserRank(Rank userRank) {
        this.userRank = userRank;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}