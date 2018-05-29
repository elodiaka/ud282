package com.udacity;

public class Martingale {

    public static boolean play(){
        return Math.random() < 0.5;
    }
    public static int L4_18() {
        int money = 1000;
        int target = 1200;
        int bet = 10;
        //System.out.println("play: "+play()+"\n");
        while (money > bet) {               // as long as I have more money than I want to bet
            boolean win = play();           // I play -> I might win or not
            if (win) {
                money += bet;               // If I win, I add my earnings to my money
                bet = 10;                   // And my betting money goes back to 10 again
                System.out.println("play: " + play() + ", money: " + money);
            } else {                        //
                money -= bet;               // If I loose, betting money get's subtracted from my money
                bet *= 2;                   // and my betting money gets doubled
                System.out.println("play: " + play() + ", money: " + money + ", bet: " + bet);
            }
            if (money>=target) {             // If my money equals or exceeds my set target, I quit playing
                System.out.println("reached target: " + money);
                break;
            }
        }
        return money;
    }
    public static void main(String[] args) {
        L4_18();
        System.out.println(L4_18());
    }







/*EOF*/
}
