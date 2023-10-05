package pokeball;

import java.util.Random;

public class StandardBall extends Pokeball{

    public StandardBall(){
        fortune = 50;
    }

    public static boolean tryFatch(){
//        System.out.println(fortune);

        Random random = new Random();
        double isCotch = random.nextDouble() * 100.0;
        return isCotch <= fortune;
    }
}
