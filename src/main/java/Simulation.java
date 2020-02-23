import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Simulation {

    Integer numberOfDies;

    Integer numberOfTosses;

    Bins newBin;


    private static final Logger LOGGER = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer numberOfDies, Integer numberOfTosses, Integer lowBin, Integer highBin){

        this.numberOfDies = numberOfDies;

        this.numberOfTosses = numberOfTosses;

        this.newBin= new Bins(lowBin,highBin);




    }

    public void runSimulation(){

        for (int i = 0; i < numberOfTosses; i++) {


            Dice newDice = new Dice(numberOfDies);

            Integer result = newDice.tossAndSum();

            newBin.incrementBin(result);
        }

    }

    public void printResults() {

        HashMap<Integer, Integer> resultBin = newBin.getHashmap();


        System.out.println("***");
        System.out.println("Simulation of" +" "+ numberOfDies +" "+ "dice tossed for"+" "+ numberOfTosses+" "+"times");
        System.out.println("***");
        System.out.println(" ");
                for(Map.Entry<Integer, Integer> entry : resultBin.entrySet()){
                    System.out.println(entry.getKey() + " " + ":"+ entry.getValue() + " " + ":" + (float)(entry.getValue()/ numberOfTosses));
                }





    }



    public static void main(String[] args) {

        Simulation sim = new Simulation(2, 1000000, 2, 12);

        sim.runSimulation();

        sim.printResults();

    }


}
