public class Atrasado8 extends Cancelado7{
    int nuevoanio;

    public Atrasado8(String nombre, int anio, String razon ,int nuevoanio) {
        super(nombre, anio, razon);
        this.nuevoanio = nuevoanio;
    }

    public int getNuevoanio() {
        return nuevoanio;
    }

    public void setNuevoanio(int nuevoanio) {
        this.nuevoanio = nuevoanio;
    }
}
