package pl.sda;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sda.junit.Calculator;

public class FirstTest {
    @Test
    public void shouldTwoEqualTwo() {
        Assertions.assertEquals(2, 2);
    }

    @Test
    public void should5Multiple9() {
        //given
        int a = 5;
        int b = 9;

        //when
        int result = Calculator.multiply(a, b);

        //then
        Assertions.assertEquals(45, result);

    }



    @Test
     public void should10Divide2(){

     //given
     int a=10;
     int b=2;

     // when
//     int result2 = Calculator.divide(a,b); // metody divide jeszcze nie ma,
                                           // ale z tego poziomu można ją utworzyć

     // then
//        Assertions.assertEquals(5,result2);
    }

}
