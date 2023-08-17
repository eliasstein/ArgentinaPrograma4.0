package Ejercicio1;


public class Tarea implements Comparable<Tarea> {
    private int ID;
    private String descripcion;
    private Estado estado;

    public Tarea(int ID, String descripcion, Estado estado) {
        this.ID = ID;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    

    @Override
    public int compareTo(Tarea t) {
        if(ID==t.ID)
            return 0;
        else if(ID<t.ID)
            return -1;
        else
            return 1;
    }
    
    
    
}
