package ejemploexception6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploException6 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int a,b;
        try{
            System.out.println("Ingrese un numerador");
            a=sc.nextInt();
            System.out.println("Ingrese un denominador");
            b=sc.nextInt();
            double division = (a/b);
            System.out.println("El resultado de la division es: "+division);
            
        }catch(ArithmeticException ex) {
            System.out.println("No se puede dividir para cero");
              
        }catch(InputMismatchException ex){
            System.out.println("Debe digitar unicamente numeros enteros");
              
        }
       
    
    }
    
    }
