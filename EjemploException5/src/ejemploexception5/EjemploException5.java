package ejemploexception5;

import javax.swing.JOptionPane;

public class EjemploException5 {
    public static void main(String[] args) {
        
        boolean condicion = true;
        int numero = 0;
        String cadena;
        
       while(condicion){
         
           try {
               cadena=JOptionPane.showInputDialog(null,"Ingrese un numero");
               numero=Integer.parseInt(cadena);
               JOptionPane.showMessageDialog(null,numero+"Si es un numero");
               condicion=false;
           } catch (Exception e) {
              JOptionPane.showMessageDialog(null,"El dato ingresado no es un numero");
           }
       }
    }
    
}
