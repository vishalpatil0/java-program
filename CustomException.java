/*
 * We can create custom exception with the help of CustomException
 * 
*/
class AgeLimit extends Exception{
    @Override
    public String toString(){
        return "Age is to0 small";
    }
    @Override
    public String getMessage(){
        return "Age is to0 small";
    }
}
public class CustomException {
    public static void main(String[] args) {
        int age;
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.print("Enter your age = ");
        age=sc.nextInt();
        if(age<18){
            try{
                throw new AgeLimit();
            }
            catch(AgeLimit al)
            {
                System.out.println(al.getMessage());
                al.printStackTrace(); //tells us which error happened at which line 
            }
        }
        System.out.println("Thank you!!!!");
    }
}
