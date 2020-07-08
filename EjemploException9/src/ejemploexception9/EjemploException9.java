package ejemploexception9;

import java.io.*;

public class EjemploException9 {
    public static void main(String[] args) {
        
        File archivo = null;
        try {


           archivo = new File("Texto.txt");

           String linea;

           FileReader fr = new FileReader (archivo);
           BufferedReader br = new BufferedReader(fr);

           int a=0;

           while((linea=br.readLine())!=null) {

           for(int i=0;i<linea.length();i++)
           {if(i==0)
              {if(linea.charAt(i)!=' ')
                a++;
              }
              else
             {if(linea.charAt(i-1)==' ')
                 if(linea.charAt(i)!=' ')	
                  a++;
    
              }	
           }
        }

        System.out.println("Son "+a+" palabras");

        fr.close();
        }
         catch(IOException e){
        System.out.println("No se ha podido encontrar el archivo");
        }
        
    }
    
}
