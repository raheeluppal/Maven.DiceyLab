import com.sun.media.jfxmedia.logging.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class DiceTest {


    @Test
    public void ThrowDiceTest() {
        //Given
        Dice dice1 = new Dice(1);

        //When
        Integer actual = dice1.tossAndSum();

        Boolean result = actual <= 6 && actual >= 1;

        Boolean expected = true;

        //Then

        Assert.assertEquals(expected, result);
    }

    @Test
    public void incrementBinTest(){
        Bins newBin = new Bins(2,12);


        Integer expected = 5;

        for (int i = 0; i <5 ; i++) {
            newBin.incrementBin(3);

        }



        Integer actual = newBin.getBin(3);


        Assert.assertEquals(expected,actual);
    }
}