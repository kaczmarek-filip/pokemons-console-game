package pokemony;
import com.sun.tools.javac.Main;
import pokeball.GreenBall;
import pokeball.Pokeball;
import pokeball.StandardBall;

import java.util.Random;
import java.util.Scanner;
public class Pokemon{

    public double HP = 100;
    public double attack = 10;
    public static int normalNumber = 0;
    public static int groundNumber = 0;
    public static int flyingNumber = 0;
    static Scanner input = new Scanner(System.in);

    public Pokemon(){
        this.HP = HP;
        this.attack = attack;
    }

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

            groundNumber = CatchPokemon(groundNumber);

        } else if (pokemonType.equals("3")) {

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

    public void fight(Trener trener) {
        Random rand = new Random();

        int oponentHP = rand.nextInt(300);
        int oponentAttack = rand.nextInt(10, 30);

        System.out.println("Twój pokemon ma: ");
        System.out.println("HP: " + this.HP);
        System.out.println("Atak: " + this.attack);
        System.out.println();
        System.out.println("Przeciwnik ma: ");
        System.out.println("HP: " + oponentHP);
        System.out.println("Atak: " + oponentAttack);
        System.out.println();
        System.out.println("Wpisz dowolny znak by rozpocząć walkę ");
        String enterBattle = input.next();

        while (oponentHP > 0 && this.HP > 0){

            int myAttackOnce = rand.nextInt((int) this.attack);
            System.out.println("[ Atakujesz ] + " + myAttackOnce);
            oponentHP -= myAttackOnce;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int oponentAttackOnce = rand.nextInt(oponentAttack);
            System.out.println("[ Otrzymujesz ] - " + oponentAttackOnce);
            this.HP -= oponentAttackOnce;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (oponentHP <= 0){
                System.out.println();
                System.out.println("! Wygrałeś !");
                System.out.println();

                trener.setWins(1);

            } else if (this.HP <= 0) {
                System.out.println();
                System.out.println("! Przegrałeś !");
                System.out.println();

                trener.setLost(1);
            }

            System.out.println(" - Życie: " + this.HP);

        }
    }
}
