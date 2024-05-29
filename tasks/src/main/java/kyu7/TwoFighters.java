package kyu7;

public class TwoFighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        if (fighter1.name.equals(firstAttacker)) {
            return attack(fighter1, fighter2);
        } else {
            return attack(fighter2, fighter1);
        }
    }

    private static String attack(Fighter fighter1, Fighter fighter2) {
        int firstFighterHealth = fighter1.health;
        int secondFighterHealth = fighter2.health;
        boolean isFirst = true;

        while (firstFighterHealth >= 0 && secondFighterHealth >= 0) {
            if (isFirst) {
                secondFighterHealth -= fighter1.damagePerAttack;
                System.out.printf("%s attacks %s; %s now has %d health.\n",
                        fighter1.name, fighter2.name, fighter2.name, secondFighterHealth);
                isFirst = false;
            } else {
                firstFighterHealth -= fighter2.damagePerAttack;
                System.out.printf("%s attacks %s; %s now has %d health.\n",
                        fighter2.name, fighter1.name, fighter1.name, firstFighterHealth);
                isFirst = true;
            }
        }

        if (firstFighterHealth <= 0) {
            return fighter2.name;
        } else {
            return fighter1.name;
        }
    }
}

class Fighter {
    public final String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
}