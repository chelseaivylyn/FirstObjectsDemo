package codedifferently;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.junit.Test;

public class humantest {
    @Test
    public void constructortest(){
        //given
        String first = "Chelsea";
        String last ="Mensah";
        int energy = 50;

        //when
        human testhuman= new human(first,last);
        String actualFirst = testhuman.getfirstname();
        String actualLast = testhuman.getlastname();
        int actualenergy = testhuman.getEnergy();



        //Then
        Assert.assertEquals(first, actualFirst);
        Assert.assertEquals(last, actualLast);
        Assert.assertEquals(energy, actualenergy);
    }   

    @Test

    public void eattest(){
       //given
       fruit oranges = new fruit ("oranges", 10);
       int expectedenergy = 60;
       human testhuman = new human("thomas", "lovings");

       //when
       testhuman.eat(oranges);
       int Actualenergy=testhuman.getEnergy();


       //then
       Assert.assertEquals(expectedenergy, Actualenergy);
    }
    
    @Test

    public void worktest(){
        //given

         human testhuman = new human("Chelsea", "Mensah");
         int expectedEnergy = 30;

        //when

        testhuman.work(2);
        int actualenergy = testhuman.getEnergy();




        //then
        Assert.assertEquals(expectedEnergy, actualenergy);
    }

    @Test
     public void energymaxtest(){
         //given
        human testhuman = new human ("jenny","appiah");
        fruit testfruit1 = new fruit("grapes", 20);
        fruit testfruit2 = new fruit("apple", 20);
        fruit testFruit3= new fruit("strawberry", 20);
        human.maxenergy =100;
        //when
        testhuman.eat(testfruit1);
        testhuman.eat(testfruit2);
        testhuman.eat(testFruit3);
        int actualenergy = testhuman.getEnergy();

        //then

        Assert.assertEquals(100, actualenergy);
     }

         @Test
         public void workmin(){

            //given
            human testHuman= new human("jenny","appiah");


            //when
            testHuman.work(6);
            int actualenergy = testHuman.getEnergy();


            //then
            Assert.assertEquals(50, actualenergy);
         }

@Test
public void maxenergychangetest(){
//given
    human h1 = new human("john", "doe");
    fruit testfruit1 = new fruit("grapes", 20);
    fruit testfruit2 = new fruit("apple", 20);
    fruit testFruit3= new fruit("strawberry", 20);


    human.maxenergy = 150;

     h1.eat(testfruit1);
     h1.eat(testfruit2);
     h1.eat(testFruit3);

     int actual = h1.getEnergy();
     
     Assert.assertEquals(110, actual);
    
}
     

}