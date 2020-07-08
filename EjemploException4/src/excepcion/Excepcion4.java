package excepcion;
public class Excepcion4 {
    public static void main(String[] args) {
        try {
            throw new Excepcion("♠♠Excepción Propia♠♠");
        } catch(Excepcion e) {
            System.out.println("Excepción: " + e.getMensaje());
        }        
    }
}
    

