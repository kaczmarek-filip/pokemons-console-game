package pokeball;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Pokeball {
    static double fortune;
    public static int standardBallNumber = 0;
    public static int greenBallNumber = 0;
    static Scanner input = new Scanner(System.in);

    public Pokeball(){
        fortune = 50;
    }
    public static void addPokeball(){
        System.out.println("Zyskiwanie pokeballi");
        System.out.println();
        System.out.println("Jakiego pokeballa chcesz wybrać?");
        System.out.println("1 - Standard (50)");
        System.out.println("2 - GreenBall (80)");

        String pokeballType = input.next();

        if(pokeballType.equals("1")){

            StandardBall standardBall = new StandardBall();
            standardBallNumber += 1;

        } else if (pokeballType.equals("2")) {

            GreenBall greenBall = new GreenBall();
            greenBallNumber += 1;

        }
    }
    public void showPokeballs(){
        System.out.println("Twoje pokeballe:");
        System.out.println();
        System.out.println("Standard: " + standardBallNumber);
        System.out.println("Greenball: " + greenBallNumber);
    }
    public static void removePokeball(String type){
        if(type.equals("standard")){
            standardBallNumber -= 1;
        } else if (type.equals("greenball")) {
            greenBallNumber -= 1;
        }
    }
    public static boolean isEnough(int type){
        if (type == 0){
            return false;
        } else{
            return true;
        }
    }
}
