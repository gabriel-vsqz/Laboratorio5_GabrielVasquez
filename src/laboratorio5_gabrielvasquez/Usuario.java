package laboratorio5_gabrielvasquez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private String nombre;
    private String apellido;
    private String user;
    private String password;
    private Date nacimiento;
    private int edad;
    private Color color;
    private ArrayList<Mazo> mazos = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String user, String password) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
    }

    public Usuario(String nombre, String apellido, String user, String password, Date nacimiento, int edad, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.password = password;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Mazo> getMazos() {
        return mazos;
    }

    public void setMazos(ArrayList<Mazo> mazos) {
        this.mazos = mazos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", user=" + user + ", password=" + password + ", nacimiento=" + nacimiento + ", edad=" + edad + ", color=" + color + ", mazos=" + mazos + '}';
    }
    
}