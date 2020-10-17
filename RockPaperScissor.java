package com.company;
import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        byte compScore = 0,humanScore = 0;
        System.out.println("1-Rock\n2-Paper\n3-Scissor");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your choice");
            byte my_choice=sc.nextByte();
            byte comp_choice=(byte)(rand.nextInt(3)+1);
            if(comp_choice==my_choice) {
                System.out.println("It is tie for this round");
            }
            else if(comp_choice==1 && my_choice==3) {
                System.out.println("Computer's choice is Rock");
                compScore++;
                System.out.println("Computer wins");
            }
            else if (comp_choice==3 && my_choice==1){
                System.out.println("Computer's choice is Scissor");
                humanScore++;
                System.out.println("Human wins");
            }
            else if(comp_choice==3 && my_choice==2){
                System.out.println("Computer's choice is Scissor");
                compScore++;
                System.out.println("Computer wins");
            }
            else if(comp_choice==2 && my_choice==3){
                System.out.println("Computer's choice is Paper");
                humanScore++;
                System.out.println("Human wins");
            }
            else if(comp_choice==2 && my_choice==1){
                System.out.println("Computer's choice is Paper");
                compScore++;
                System.out.println("Computer wins");
            }
            else if(comp_choice==1 && my_choice==2){
                System.out.println("Computer's choice is Rock");
                humanScore++;
                System.out.println("Human wins");
            }
        }
        if(humanScore==compScore){
            System.out.println("Tie");
        }
        else if(humanScore<compScore){
            System.out.println("Computer is the winner");
        }
        else {
            System.out.println("Human is the winner");
        }
    }
}