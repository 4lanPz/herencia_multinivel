public class Estreno4 extends Indie2{
    int salida;

    public Estreno4(String nombre, int anio, String equipo, String motor, int salida) {
        super(nombre, anio, equipo, motor);
        this.salida = salida;;
    }

    public int getSalida() {
        return salida;
    }

    public void setSalida(int salida) {
        this.salida = salida;
    }
}
