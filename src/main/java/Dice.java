import java.util.Random;
import java.util.logging.Logger;

public class Dice {

    Integer numberOfDice;

    Long seed;

    Random random;

    private static final Logger LOGGER = Logger.getLogger(Dice.class.getName());


    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;


    }
    public void setSeed(Long seed){
         this.random = new Random(seed);

    }

    public int tossAndSum() {

        int toss = 0;



        for (int i = 1; i <=numberOfDice ; i++) {

            int random1 = new Random().nextInt(6);

          //  System.out.println(random1);

            toss += 1 + random1;

        }

      //  LOGGER.info( " Tossed value is" + " " + toss);

        return toss;
    }

}