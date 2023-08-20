package Ejercicio2;


public class Contacto implements Comparable<Contacto> {
    private String nombre;
    private String mail;
    private long telefono;

    public Contacto(long telefono,String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public int compareTo(Contacto t) {
        if(telefono==t.telefono)
            return 0;
        else if(telefono<t.telefono)
            return -1;
        else
            return 1;
    }
    
    
    
}
