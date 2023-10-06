import pokemony.*;

import java.util.Scanner;

public class Oponent extends Pokemon{

    static Scanner input = new Scanner(System.in);

    public static void chooseYourPokemon(Trener trener){
        System.out.println("Wybierz pokemona którym chcesz walczyć: ");
        System.out.println();
        System.out.println("1 - Normal");
        System.out.println("2 - Ground");
        System.out.println("3 - Flying");

        System.out.print("> ");
        String fromUser = input.next();

        switch (fromUser){
            case "1":
                if (normalNumber>0){
                    Pokemon normal = new Normal();
                    normal.fight(trener);
                    normalNumber -= 1;
                } else {
                    System.out.println("Nie masz wystarczająco pokemonów");
                }
                break;
            case "2":
                if (groundNumber>0){
                    Pokemon ground = new Ground();
                    ground.fight(trener);
                    groundNumber -= 1;
                } else {
                    System.out.println("Nie masz wystarczająco pokemonów");
                }
                break;
            case "3":
                if (flyingNumber>0){
                    Pokemon flying = new Flying();
                    flying.fight(trener);
                    flyingNumber -= 1;
                } else {
                    System.out.println("Nie masz wystarczająco pokemonów");
                }
                break;
        }


    }
}
