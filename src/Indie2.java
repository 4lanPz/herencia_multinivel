public class Indie2 extends Juegos1{
    String equipo;
    String motor;

    public Indie2(String nombre, int anio, String equipo, String motor) {
        super(nombre, anio);
        this.equipo = equipo;
        this.motor = motor;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        motor = motor;
    }
}
