package week07_guessnumber;

import java.util.Scanner;

public class GuessNumber {
    static Scanner sc = new Scanner(System.in);
    static int minValue = 1;
    static int maxValue = 100;
    
    public static void main(String[] args) {
        int choice;
        boolean end = false;
        
        do{
            displayMenu();
            choice = sc.nextInt();

            switch (choice){
                case 1: computerGuesses(); break;
                case 2: userGuesses(); break;
                case 0: end = true; break;
                default: System.out.println("Neplatna volba");
            }
        } while(!end); //end == false
    }
    
    private static void displayMenu(){
        System.out.println("Vitej ve hre!");
        System.out.println("Zadej volbu:");
        System.out.println("1. Hada pocitac");
        System.out.println("2. Hada uzivatel");
        System.out.println("0. Konec hry");
    }

    private static void computerGuesses() {
        int guess;
        int answer;
        int min, max;
        boolean end = false;
        System.out.println("Uzivateli, mysli si cislo "
                + "v rozsahu od " + minValue + " do " + maxValue);
        
        min = minValue;
        max = maxValue;
        do{
            guess = (min + max)/2;
            System.out.println("Uzivateli, myslis si cislo " + guess + "?");
            System.out.println("Odpovez: -1 pro mensi, 1 pro vetsi, 0 trefa");
            answer = sc.nextInt();
            if (answer == -1){
                max = guess - 1;
            } else if (answer == 1){
                min = guess + 1;
            } else {
                System.out.println("Trefa");
                end = true; 
            }
        } while(!end);
    }

    private static void userGuesses() {
        int randomInt = (int) Math.floor(Math.random() * (maxValue - minValue + 1) + minValue);
        int guess;
        boolean end = false;
        int pocetPokusu = 0;

        System.out.println("Uživateli, hádej číslo v rozsahu od " + minValue + " do " + maxValue + ".");
        guess = sc.nextInt();

        do {
            pocetPokusu += 1;
            if (guess < randomInt) {
                System.out.println("Hádej větší číslo.");
                guess = sc.nextInt();
            } else if (guess > randomInt) {
                System.out.println("Hádej menší číslo.");
                guess = sc.nextInt();
            } else {
                System.out.println("Trefa");
                System.out.println("Počet pokusů: " + pocetPokusu);
                end = true;
            }
        } while (!end);
    }
}
