public class Juegos1 {
    String Nombre;
    int anio;

    public Juegos1(){
    }

    public Juegos1(String nombre, int anio) {
        Nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }


}
