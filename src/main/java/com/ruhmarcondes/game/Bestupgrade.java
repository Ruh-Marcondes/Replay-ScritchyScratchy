package com.ruhmarcondes.game;

import static java.lang.Math.*;

public class Bestupgrade {

    static final int MAX_LUCK = 10;
    static final int MAX_STRENGTH = 10;

    int luck;
    int coinStrength;

      public Bestupgrade() {
        this.luck = 1;
        this.coinStrength = 1;
    }


    public int getLuck() {
        return this.luck;
    }

    public void setLuck(int luck) {
        this.luck = Math.min(luck, MAX_LUCK);
    }

    public int getCoinStrength() {
        return this.coinStrength;
    }

    public void setCoinStrength(int coinStrength) {
        this.coinStrength = Math.min(coinStrength, MAX_STRENGTH);
    }
}