package com.ruhmarcondes.game;

public class Raspadinha {
    public int slotes;
    public int dureza;
    public int life;

    public int getSlotes() {
        return this.slotes;
    }

    public void setSlotes(int slotes) {
        this.slotes = slotes;
    }

    public int getDureza() {
        return this.dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getLife() {
        return this.life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int prizes[] = new int [slotes];


public Raspadinha( int slotes, int dureza,int life){
    this.slotes = slotes; 
    this.dureza = dureza;
    this.life = life;
    definySlots();
}
public void definySlots(){
    for (int i = 0; i < slotes; i++) {
        //defino qual é o premio
    }
}
}