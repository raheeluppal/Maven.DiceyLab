import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void ThrowDiceTest(){
        //Given
        Dice dice1 = new Dice();
        Long seed = 85L;

        //When
        Integer actual = dice1.tossAndSum(2, seed);

        Integer expected = 5;

        //Then

        Assert.assertEquals(expected, actual);
    }

}