
/*package SRC;

public class AdmonPersonal {
    private Personal personal[];
    private int cont;
    
    public AdmonPersonal(){
        personal  = new Personal[99];
        cont = 0;
    }
    
    public int getCont(){
        return cont;
    }
    
}
*/
//Grillo
package SRC;

public class AdmonPersonal {
    Personal personal[] = new Personal[99];
    private int cont;
    
    public void setCont(int cont){
        this.cont = cont;
    }
    
    public int getCont(){
        return cont;
    }
    
    public int getCelda(int clave){
        for(int x = 0; x < getCont(); x++)
            if(clave == personal[x].getClave())
                return x;
        return -1;
    }
    
    public void agregar(Personal per)
    {
        personal[cont] = per;
        cont++;
    }
    
}
