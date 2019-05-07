package SRC;

public class Profesor extends Personal {
    private String titulo;
    private String departamento;
    private int horas;

    public Profesor(int clave, String nombre, int añoIngreso, String titulo, String departamento, int horas) {
        super(clave, nombre, añoIngreso);
        this.titulo = titulo;
        this.departamento = departamento;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public void calcularUtilidad(){
        int añosAntiguedad = Principal.añoActual - getAñoIngreso();
        float utilidad = (añosAntiguedad * 1500) - 0.07f *(añosAntiguedad * 1500);
        return utilidad;
    }
}
