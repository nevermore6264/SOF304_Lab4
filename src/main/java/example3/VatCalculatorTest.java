package example3;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class VatCalculatorTest {
    @Test
    public void testGetVatOnAmount(){
        VatCalculator vatCalculator = new VatCalculator();
        double expected = 10;
        Assert.assertEquals(vatCalculator.getVatOnAmount(100),expected);
        Assert.assertNotEquals(vatCalculator.getVatOnAmount(120),expected);
    }

}