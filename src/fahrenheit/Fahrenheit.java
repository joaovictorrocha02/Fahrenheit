package fahrenheit;

import java.util.Scanner;

public class Fahrenheit {

    
    public static void main(String[] args) {
       
        //Convertendo fahrenheit para Celsius
        
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Me informe um valor de Fahrenheit: ");
        double f = sc.nextInt();
        
        double celsius;
        celsius = 5.0/9 * (f-32);
        System.out.println(celsius);
       
       
    }
    
}
