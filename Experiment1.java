import java.util.Scanner;

public class Experiment1{
    Calculator cal=new Calculator();
    @Test
    public void assertEqualsTest(){
      Assertions.assertEquals(4,cal.add(2,2));
    }
}