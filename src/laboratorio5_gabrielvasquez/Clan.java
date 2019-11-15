package laboratorio5_gabrielvasquez;

import java.util.ArrayList;
import java.util.Date;

public class Clan {
 
    private String nombre;
    private ArrayList<Usuario> miembros = new ArrayList();
    private Date creacion;
    private Usuario lider;
    private String tipo;

    public Clan() {
    }

    public Clan(String nombre, Date creacion, Usuario lider, String tipo) {
        this.nombre = nombre;
        this.creacion = creacion;
        this.lider = lider;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Clan{" + "nombre=" + nombre + ", miembros=" + miembros + ", creacion=" + creacion + ", lider=" + lider + ", tipo=" + tipo + '}';
    }
    
}