import java.util.Scanner;
import java.util.Random;

class game{
    static int number,userNumber;
    game(){
        Random rndm=new Random();
        number=rndm.nextInt(10);
    }
    static boolean isCorrectNumber(int n){
        if(n<0 || n>9)
        {
            return true;
        }
        else{
            return false;
        }
    }
    static void setN()
    {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter number");
        userNumber=sc.nextInt();
        if(isCorrectNumber(userNumber))
        {
            System.out.println("Please number between 0 to 9 (including them) ");
        
        }
        else{
            break;
        }
        }    
    }
}

public class GuessTheNumber extends game{
    public static void main(String[] args) {
        game g=new game();
        System.out.println("Welcome to the game");
        int no_of_guessses=0;
        System.out.println("Please enter number from 0 to 9");
        while(true)
        {
            setN();
            no_of_guessses++;
            if(number==userNumber)
            {
                System.out.println("Yep thats right");
                break;
            }
            else if(number<userNumber)
            {
                System.out.println("Enter a smaller number");
            }
            else{
                System.out.println("Enter a bigger number");
            }
        }

        System.out.println("Your score is "+no_of_guessses);

        if(no_of_guessses<=3)
        {
            System.out.println("You are winner bcoz your scoer is less or equal to 3");
        }
        else
        {
            System.out.println("Better luck next time");
        }
    }
    
}
