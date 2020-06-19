package codedifferently;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class fruittest {

    @Test

    public void constructortest(){
    //given
    String type = "apples";
    int energy = 100;


    //when
    fruit testfruit  = new fruit(type, energy);
    String actualtype = testfruit.gettype();
    int actualenergy = testfruit.getenergy();


    //then
        Assert.assertEquals(type, actualtype);
        Assert.assertEquals(energy,actualenergy);

    }
    
}