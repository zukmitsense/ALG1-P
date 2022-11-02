package week05_loopwhile;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //deklarace
        int num;
        boolean isPrimeNumber;
        char answer;
        int possibleDivisor;
        
        do {
            //inicializace 
            possibleDivisor = 2;
            isPrimeNumber = true;
            
            System.out.println("Zadej cislo:");
            num = scan.nextInt();
            if(num <= 1){
                isPrimeNumber = false;
            } else {
                while(possibleDivisor <= num/2 && isPrimeNumber){ //po odmocnina z num
                    if ((num % possibleDivisor) == 0) {
                        isPrimeNumber = false;
                        //break;
                    }
                    possibleDivisor++;
                }
            }
            
            System.out.println("Cislo " + ((isPrimeNumber)?"je":"neni") + " prvocislo."); 
            
            System.out.println("Chces pokracovat? a/n");
            answer = scan.next().toLowerCase().charAt(0);
        
        } while (answer == 'a');
    }
}