package com.ruhmarcondes.game;

public class Bestupgrade {

    static final int MAX_LUCK_LEVEL = 10;
    static final int MAX_STRENGTH = 10;

    int levelLuck;
    int coinStrength;
    int levelLuckcost;

    public int getLevelLuck() {
        return this.levelLuck;
    }

    public void setLevelLuck(int levelLuck) {
        this.levelLuck = Math.min(levelLuck, MAX_LUCK_LEVEL);
    }

    public int getCoinStrength() {
        return this.coinStrength;
    }

    public void setCoinStrength(int coinStrength) {
    this.coinStrength = Math.min(coinStrength, MAX_STRENGTH);
    }

    public int getLevelLuckcost() {
        return this.levelLuckcost;
    }

    public void setLevelLuckcost(int levelLuckcost) {
        this.levelLuckcost = levelLuckcost;
    }
  

      public Bestupgrade() {
        this.levelLuck = 1;
        this.coinStrength = 1;
    }
}