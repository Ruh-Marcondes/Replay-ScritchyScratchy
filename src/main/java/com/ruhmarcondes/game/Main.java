package com.ruhmarcondes.game;

import java.util.Scanner;


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
                System.out.println("VAMOS UPGRADAR:==========");
                System.out.println("10. LUCK");
                System.out.println("11. COIN");
                if (Integer.parseInt(sc.nextLine()) == 10) {
                    //Upgrade luck
                    if(upgrade.getLevelLuckcost()<p1.getMoney()) {
                        p1.setMoney(p1.getMoney()-upgrade.getLevelLuckcost());
                        p1.setLuck(p1.getLuck()+1);

                    }else{
                        System.out.println("Você não pode sar upgrade yeat! ");
                    }
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