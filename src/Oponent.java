import pokemony.Normal;
import pokemony.Pokemon;

import java.util.Scanner;
import java.util.Random;
public class Oponent extends Pokemon{

    static Scanner input = new Scanner(System.in);

//    public static void randomOponentProperties(){
//
//        Random rand = new Random();
//
//        int[] finalOponentProperties = new int[2];
//
////        finalOponentProperties[0] = rand.nextInt() * 300 + 1; // HP
////        finalOponentProperties[1] = rand.nextInt() * 30 + 1; // Attack
//
//        double oponentHP = rand.nextInt() * 300 + 1;
//        double oponentAttack = rand.nextInt() * 30 + 1;
//
//        Pokemon oponent = new Pokemon();
//
//    }
//    void fight(Pokemon yourPokemon){
//
//        Random rand = new Random();
//
//        int oponentHP = rand.nextInt(300);
//        int oponentAttack = rand.nextInt(30);
//
//        System.out.println("Twój pokemon ma: ");
//        System.out.println("HP: " + yourPokemon.HP);
//        System.out.println("Atak: " + yourPokemon.attack);
//        System.out.println();
//        System.out.println("Przeciwnik ma: ");
//        System.out.println("HP: " + oponentHP);
//        System.out.println("Atak: " + oponentAttack);
//
//        while (oponentHP < 0 || yourPokemon.HP < 0){
//
//            System.out.println("[ Oponent ] - " + yourPokemon.attack);
//            oponentHP -= (int) yourPokemon.attack;
//
//            System.out.println("[ Trener ] - " + oponentAttack);
//            yourPokemon.HP -= oponentAttack;
//
//        }
//    }

    public static void chooseYourPokemon(){
        System.out.println("Wybierz pokemona którym chcesz walczyć: ");
        System.out.println();
        System.out.println("1 - Normal");
        System.out.println("2 - Ground");
        System.out.println("3 - Flying");

        System.out.print("> ");
        String fromUser = input.next();

        switch (fromUser){
            case "1":
                Pokemon normal = new Normal();
                normal.fight();
        }


    }
}
