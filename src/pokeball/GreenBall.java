package pokeball;

import java.util.Random;

public class GreenBall extends Pokeball{
    public GreenBall(){
        fortune = 80;
    }

    public static boolean tryFatch(){

        Random random = new Random();
        double isCotch = random.nextDouble() * 100.0;
        return isCotch <= fortune;
    }
}
