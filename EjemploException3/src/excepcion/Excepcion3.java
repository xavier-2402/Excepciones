package excepcion;
public class Excepcion3 {
    public static void main(String[] args) {
        Array a = new Array();
        try {
            a.getValor(6);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array fuera de limites  ☺  "  + e.getMessage()+"  ☺");
        }
    }    
}
