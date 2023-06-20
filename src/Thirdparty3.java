public class Thirdparty3 extends Juegos1{
    String empresa;
    String director;

    public Thirdparty3(String nombre, int anio, String empresa, String director) {
        super(nombre, anio);
        this.empresa = empresa;
        this.director = director;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

