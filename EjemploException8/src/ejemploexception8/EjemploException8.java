package ejemploexception8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploException8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int array[]={2,4,5,3,6,7,10,45,9,1,8};
        try {
            int posicion;
            System.out.println("Ingrese la posicion que desea obtener ");
            posicion=sc.nextInt();
            System.out.println("El elemento en la posicion "+posicion+"es: "+array[posicion]);
            
            
        } catch (InputMismatchException e) {
            System.out.println("Tiene que ingresar un numero");
        }catch(ArrayIndexOutOfBoundsException e ){
            
            System.out.println("Posicion fuera del array");
        }
    }
    
}
