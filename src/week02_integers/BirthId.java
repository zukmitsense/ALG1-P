package week02_integers;

import java.util.Scanner;

/*
* Test case
* in: 1555271005
* expected out: 27. 5. 2015
*/
public class BirthId {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej cele rodne cislo");
        long rodneCislo = sc.nextLong();
        //long rodneCislo = 1555271005L;
        
        //calc
        long minus4 = rodneCislo/10000;
        long year = minus4/10000;
        long day = minus4%100;
        long month = minus4%10000/100;
        month  = (month>12)? month-50:month; //month = month%50
        year  = (year>54)? year+1900:year+2000;
        
        //out
        System.out.println(day + ". " + month + ". " + year);    
    }
}
