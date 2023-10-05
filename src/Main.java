import java.util.Scanner;

import pokemony.Pokemon;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witaj trenerze!");
        System.out.println();

        Trener trener = new Trener(0, 0);


        while (true){
//            System.out.println("Twoja liczba pokemonów: " + trener.getPokemonNumber());
//            System.out.println("Twoja liczba pokeballi: " + trener.getPokeballNumber());
            System.out.println();

            System.out.println("Wybierz działanie:");
            System.out.println("1 - Sprawdź pokeballe");
            System.out.println("2 - Sprawdź pokemony");
            System.out.println("3 - Zbierz pokeballa");
            System.out.println("4 - Złap pokemona");
            System.out.println("5 - Walcz");
            System.out.println("X - Wyjdź");

            String fromUser = input.next();

            switch (fromUser){
                case "1":
                    trener.showPokeballs();
                    break;
                case "2":
                    Pokemon.showPokemons();
                    break;
                case "3":
//                    Pokeball pokeball = new GreenBall();
//                    trener.addPokeballNumber(1);
                    trener.addPokeball();
                    break;
                case "4":
//                    Pokemon pokemon = new Pokemon();
                    Pokemon.getPokemon();
                    break;

            }
        }

    }
}