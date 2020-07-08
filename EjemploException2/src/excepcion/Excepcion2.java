package excepcion;
public class Excepcion2 {
    public static void main(String[] args) {
        Null en = null;
        try {
            en.getString();
        } catch (Exception e){
            System.out.println("Se produjo una excepcion. " + e.getMessage());
        }
    }  
}
