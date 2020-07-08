package excepcion;
public class Excepcion extends Exception{
    String mensaje;
    public Excepcion(String mensaje) {
        this.mensaje = mensaje;
    }
    public String getMensaje() {
        return mensaje;
    }
}
