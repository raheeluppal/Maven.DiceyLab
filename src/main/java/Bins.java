import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Bins {
    Integer lowBin;
    Integer highBin;

    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());

    private HashMap<Integer, Integer> resultBin = new HashMap<>();


    public Bins(Integer lowBin, Integer highBin) {
        this.lowBin = lowBin;
        this.highBin = highBin;


        for (int i = lowBin; i <= highBin; i++) {
            resultBin.put(i, 0);
        }
    }
    public Integer getBin(Integer binNumber) {

        LOGGER.info("get bin =" + " " + resultBin.get(binNumber));

        return resultBin.get(binNumber);

    }

    public void incrementBin(Integer binNumber) {

        resultBin.put(binNumber, resultBin.get(binNumber) + 1);

    }

    public HashMap<Integer, Integer> getHashmap(){

        return resultBin;
    }
}





