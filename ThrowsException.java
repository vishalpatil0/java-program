/*
Function having throws keywrod in their definition is the indication that this function can throw a exception
so you should handle it properly.

*/

public class ThrowsException {
    private static int divide(int a,int b) throws ArithmeticException {
        return a/b;
    }
    public static void main(String[] args) {
        try{
            System.out.println(divide(6,0));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("hello vishal");
        System.out.println(divide(4, 0));
    }
}
