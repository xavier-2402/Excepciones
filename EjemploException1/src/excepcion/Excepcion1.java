package excepcion;
public class Excepcion1 {
    public static void main(String[] args) {
        try { throw new Exception("\n••Esto es una Excepción••");
            } catch(Exception e) {
                System.out.println("Se produjo un excepción: " + e.getMessage());
            } finally {
                System.out.println("Esto se ejecuta sin importar si se presentan errores");
            }
    }
    
}
