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
    public float calcularUtilidad(){
        int añosAntiguedad = Principal.añoActual - getAñoIngreso();
        if(nivel < 3){
            return (añosAntiguedad * 500 + 2500) - 0.05f * (añosAntiguedad * 500 + 2500);
        } else {
            return (añosAntiguedad * 700 + 5000) - 0.05f * (añosAntiguedad * 700 + 5000); 
        }
    }
}
