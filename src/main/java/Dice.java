import java.util.Random;
import java.util.logging.Logger;

public class Dice implements Throw {

    Integer toss = 0;

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());

    public Dice(){

    }


    public int tossAndSum(int numberOfDice, Long seed) {


        Random random = new Random(seed);

        for (int i = 1; i <=numberOfDice ; i++) {


            toss += random.nextInt(6) + 1;
        }

        LOGGER.info( " Tossed value is" + " " + toss);

        return toss;
    }

}