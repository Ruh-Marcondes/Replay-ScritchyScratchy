package com.ruhmarcondes.game;

import java.util.Scanner;

import com.ruhmarcondes.game.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        Bestupgrade upgrade = new Bestupgrade();
        Player p1 = new Player(3);

    do {
        //game logica
        switch (Integer.parseInt(sc.nextLine())) {
            case 1:
                    //raspar
                break;
            case 2:
                //upgradar 
                if (Integer.parseInt(sc.nextLine()) == 10) {
                    //Upgrade luck
                }
                break;
            default:
                break;
        }

    } while (Integer.parseInt(sc.nextLine())!= 0);
    sc.close();
    System.out.println("Saindo do game");

    }
}