/*
 * There are 3 types of erros in java
 * a- syntax Error
 * b- Logical Error
 * c- Runtime Error - Exception
 * 
 * Exception are run time erros\
 * 2 types of exception
 * a- Checked Exception - compile time excpetion (handled by compiler)
 *      #this excpetion don't even let program run without handling them
 * b- Unchcked exception - runtime exception
*/
public class Erros_Exception {
    public static void main(String[] args) {
        //int a=3           //syntax error because semicolon is missing


        //logical error : not behaving as we wanted it to bahave
        //we wanted prime numbers but ........
        for(int i=1;i<10;i++)
        {
            System.out.println(i);
        }

        //run time error
        System.out.println(10/0); //arithmentic exception which is run time error
        
    }
}
