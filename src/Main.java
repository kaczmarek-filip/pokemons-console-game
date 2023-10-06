import java.util.Scanner;

import pokemony.Pokemon;
import pokemony.Trener;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Witaj trenerze!");
        System.out.println();

        Trener trener = new Trener(0, 0);


        while (true){
            System.out.println();

            System.out.println("Wybierz działanie:");
            System.out.println("1 - Sprawdź pokeballe");
            System.out.println("2 - Sprawdź pokemony");
            System.out.println("3 - Zbierz pokeballa");
            System.out.println("4 - Złap pokemona");
            System.out.println("5 - Walcz");
            System.out.println("6 - Sprawdź statystyki");
            System.out.println("7 - Wyjdź");

            System.out.print("> ");
            String fromUser = input.next();

            switch (fromUser){
                case "1":
                    trener.showPokeballs();
                    break;
                case "2":
                    Pokemon.showPokemons();
                    break;
                case "3":
                    trener.addPokeball();
                    break;
                case "4":
                    Pokemon.getPokemon();
                    break;
                case "5":
                    Oponent.chooseYourPokemon(trener);
                    break;
                case "6":
                    System.out.println("Wygranych: " + trener.getWins());
                    System.out.println("Przegranych: " + trener.getLost());
                    break;
                case "7":
                    System.exit(0);
            }
        }

    }
}