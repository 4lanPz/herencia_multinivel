public class Precio5 extends Estreno4{
    double precio;

    public Precio5(String nombre, int anio, String equipo, String motor, int salida, double precio ) {
        super(nombre, anio, equipo, motor, salida);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
