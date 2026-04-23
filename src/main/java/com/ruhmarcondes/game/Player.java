package com.ruhmarcondes.game;

public class Player {
    
    int money;
    int luck;

    public int getLuck() {
        return this.luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    Player(int money){
        this.money = money;
    }

}
