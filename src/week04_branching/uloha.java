/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week04_branching;
import java.util.Scanner;
        
/**
 *
 * @author jana.vitvarova
 */
public class uloha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Zadejte tri usecki ");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        boolean canMakeTriangle;
                
        //canMakeTriangle = (a + b > c) && (a + c > b) && (b + c > a);
        canMakeTriangle = (a + b > c) && (Math.abs(a - b) < c);
        
        System.out.println("Trojuhelnik " + ((canMakeTriangle)? "muzeme ": "nemuzeme") + "sestrojit s delkami stran " + a + " "+ b + " " +c );
          
    }
    
}
