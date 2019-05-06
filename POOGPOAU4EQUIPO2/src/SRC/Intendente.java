package SRC;

public class Intendente extends Personal{
    private String area;
    private int nivel;

    public Intendente(int clave, String nombre, int añoIngreso, String area, int nivel) {
        super(clave, nombre, añoIngreso);
        this.area = area;
        this.nivel = nivel;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public void calcularUtilidad(){
        
    }
}
