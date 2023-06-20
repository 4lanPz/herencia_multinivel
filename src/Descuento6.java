public class Descuento6 extends Estreno4{
    double descuento;

    public Descuento6(String nombre, int anio, String equipo, String motor, int salida, double descuento) {
        super(nombre, anio, equipo, motor, salida);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
