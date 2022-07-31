import java.util.Scanner;
class ArrayDemo{
    private int arr[];
    ArrayDemo(int size){
        arr = new int[size];
    }
    public void setArray(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*10;
        }
    }
    public void printArray(){
        System.out.println("Element of array are.....");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public int[] getArray(){
        return arr;
    }
}
final class vishal{

}
public class expr {
    public static void main(String[] args) {
        ArrayDemo arrayDemo = new ArrayDemo(4);
        arrayDemo.setArray();
        // arrayDemo.printArray();
        int arr[] = arrayDemo.getArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}