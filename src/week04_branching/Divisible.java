package week04_branching;

public class Divisible {

    public static void main(String[] args) {
        int a;
        int b;
        a = 10;
        b = 5;
        
        boolean divisible;
        divisible = a % b == 0;
        
        System.out.println(a + " " + ((divisible)?"je":"neni") + " delitelne " + b);
                
    }
    
}
