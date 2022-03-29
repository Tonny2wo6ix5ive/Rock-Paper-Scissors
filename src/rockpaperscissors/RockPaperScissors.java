/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class RockPaperScissors {

    public void computer(){
        Math.ceil(Math.random());
        System.out.println((Math.floor(Math.random() * 4)));
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RockPaperScissors rps = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        
        String[] array = {"Starter", "Rock", "Paper", "Scissors"};
        double random1 = Math.ceil(Math.random() * 3);
        int computer = (int)random1;
        
        System.out.println("Welcome, lets have fun!!");
        System.out.println("Choose any number between 1-3 for Rock, Paper, Scissors respectifully");
        System.out.print("Enter a number: ");
        int player = sc.nextInt();
        System.out.println("Computer choose: " + array[computer]);
        System.out.println("Player choose: " + array[player]);
        
        if(player == 1 && computer == 2){
            System.out.println("Computer won");
        }else if(player == 2 && computer == 3){
            System.out.println("Computer won");
        }else if(player == 3 && computer == 1){
            System.out.println("Computer won");
        }else if(computer == 1 && player == 2){
            System.out.println("You have won");
        }else if(computer == 2 && player == 3){
            System.out.println("You have won");
        }else if(computer == 3 && player == 1){
            System.out.println("You have won");
        }else if(computer == player){
            System.out.println("Draw");
        }else{
            System.out.println("Invalid input");
        }
    }
    
}
