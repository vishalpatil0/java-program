import java.sql.Struct;
import java.util.Scanner;
public class EnumDemo{
  enum color{
    green,yellow(45),red;

    int depthLevel;

    color(){
      depthLevel = 100;
    }

    color(int value){
      depthLevel = value;
    }

    int getdepthLevel(){
      return depthLevel;
    }
  }

  //background implementation of enum
  /*
   * class color{
   *      static final color green = new color();
   *      static final color yellow = new color();
   *      static final color red = new color();
   * }
   */
  public static void main(String[] args) {
    color c = color.red;

    switch(c){
      case green:
                System.out.println("it is green");
                break;
      case yellow:
                System.out.println("it is yellow");
                break;
      case red:
                System.out.println("it is red");
                break;
      default:
                System.out.println("defualt case");
    }

    System.out.println("Yellow color depth level = "+color.yellow.getdepthLevel());

    System.out.println("red order number in enum -> "+color.red.ordinal());

    color[] C = color.values();
    for(color co:C){
      System.out.println(co);
    }
  }
}