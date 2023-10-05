package pokemony;
import pokeball.GreenBall;
import pokeball.Pokeball;
import pokeball.StandardBall;

import java.util.Scanner;
public class Pokemon{

    double HP = 100;
    double attack = 10;
    static int normalNumber = 0;
    static int groundNumber = 0;
    static int flyingNumber = 0;
    static Scanner input = new Scanner(System.in);

    static public void getPokemon(){
        System.out.println("Łapanie pokemonów");
        System.out.println();

        System.out.println("Wybierz typ:");
        System.out.println("1 - Normal");
        System.out.println("2 - Ground");
        System.out.println("3 - Flying");

        String pokemonType = input.next();

        if(pokemonType.equals("1")){

            normalNumber = CatchPokemon(normalNumber);

        } else if (pokemonType.equals("2")) {

//            Pokemon ground = new Ground();
//            groundNumber += 1;
//            CatchPokemon(groundNumber);
            groundNumber = CatchPokemon(groundNumber);

        } else if (pokemonType.equals("3")) {

//            Pokemon flying = new Flying();
//            flyingNumber += 1;
//            CatchPokemon(flyingNumber);
            flyingNumber = CatchPokemon(flyingNumber);

        }
    }
    static public void showPokemons(){
        System.out.println("Twoje pokemony:");
        System.out.println();

        System.out.println("Normal: " + normalNumber);
        System.out.println("Ground: " + groundNumber);
        System.out.println("Flying: " + flyingNumber);
    }
    static int CatchPokemon(int pokemonType){

        System.out.println("Którym pokeballem?");
        System.out.println();

        System.out.println("1 - Standard (" + Pokeball.standardBallNumber + ")");
        System.out.println("2 - Greenball (" + Pokeball.greenBallNumber + ")");

        String whichPokeball = input.next();

        switch (whichPokeball){
            case "1":
                if(Pokeball.isEnough(Pokeball.standardBallNumber)){
                    System.out.println("Próba złapania standardowym pokeballem");
                    if (StandardBall.tryFatch()){

                        System.out.println("Udało się złapać pokemona");
                        Pokeball.removePokeball("standard");
                        pokemonType += 1;
                        return pokemonType;
                    } else {
                        System.out.println("Nie udało się złapać pokemona");
                        Pokeball.removePokeball("standard");
                    }

                } else {
                    System.out.println("Nie masz wystarczająco Standardowych pokeballi");
                }
                break;

            case "2":
                if(Pokeball.isEnough(Pokeball.greenBallNumber)){
                    System.out.println("Próba złapania Greenballem");
                    if (GreenBall.tryFatch()){

                        System.out.println("Udało się złapać pokemona");
                        Pokeball.removePokeball("greenball");
                        pokemonType += 1;
                        return pokemonType;
                    } else {
                        System.out.println("Nie udało się złapać pokemona");
                        Pokeball.removePokeball("greenball");
                    }

                } else {
                    System.out.println("Nie masz wystarczająco Greenballi");
                }
                break;

        }
        return pokemonType;
    }
}
