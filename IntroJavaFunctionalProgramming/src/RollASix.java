package com.udacity;
/* credit goes to Michalicious https://discussions.udacity.com/t/l4-loops-topic-16-break-i-thinks-this-code-is-not-correct/288495 */
import java.util.Random;

public class RollASix {
    private static final Random generator = new Random();

    public static int rollDice() {
        return generator.nextInt(6) + 1;
    }

    public boolean rollASix() {
        int dice;
        do {
            dice = rollDice();
            System.out.printf("Rolling %d...%n", dice);
        } while (dice != 6 && dice != 3);
        return dice == 6;
    }

    public static void main(String[] args) {
        RollASix instance = new RollASix();
        for (int i = 0; i < 3; i++)
            System.out.println(instance.rollASix() ? "You win!\n" : "You lose!\n");
    }
}