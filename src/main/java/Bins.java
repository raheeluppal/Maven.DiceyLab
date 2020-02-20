import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashMap;
import java.util.logging.Logger;

public class Bins  {

    private static final Logger LOGGER = Logger.getLogger(Bins.class.getName());
    private final Integer binLow;
    private final Integer binHigh;

    HashMap<Integer, Integer> resultBin = new HashMap<>();


    public Bins(Integer binLow, Integer binHigh){

        this.binLow = binLow;

        this.binHigh = binHigh;
    }

    public Integer getBin(Integer binNumber){

        return resultBin.get(binNumber);
    }

    public void incrementBin(Integer binNumber){

        if (resultBin.containsKey(binNumber)){
            resultBin.put(binNumber, resultBin.get(binNumber) + 1);
        }else {
            resultBin.put(binNumber, 1);
        }
    }
}



