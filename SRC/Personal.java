package SRC;

    public abstract class Personal {
    private int clave;
    private String nombre;
    private int añoIngreso;
    
    public Personal(){}
    
    public Personal(int clave, String nombre, int añoIngreso){
        this.clave = clave;
        this.nombre = nombre;
        this.añoIngreso = añoIngreso;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoIngreso() {
        return añoIngreso;
    }

    public void setAñoIngreso(int añoIngreso) {
        this.añoIngreso = añoIngreso;
    }
    
    abstract public float calcularUtilidad();
}
