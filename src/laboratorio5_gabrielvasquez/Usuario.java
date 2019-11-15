package laboratorio5_gabrielvasquez;

import java.awt.Color;
import java.util.Date;

public class Usuario {

    private String nombre;
    private String apellido;
    private String user;
    private String password;
    private Date nacimiento;
    private int edad;
    private Color color;
    private Mazo m1;
    private Mazo m2;
    private Mazo m3;

    public Usuario() {
    }

    //BORRAR LATER
    public Usuario(String nombre, String user, String password) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
    }

    public Usuario(String nombre, String apellido, String user, String password, Date nacimiento, int edad, Color color, Mazo m1, Mazo m2, Mazo m3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.password = password;
        this.nacimiento = nacimiento;
        this.edad = edad;
        this.color = color;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
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

    public Mazo getM1() {
        return m1;
    }

    public void setM1(Mazo m1) {
        this.m1 = m1;
    }

    public Mazo getM2() {
        return m2;
    }

    public void setM2(Mazo m2) {
        this.m2 = m2;
    }

    public Mazo getM3() {
        return m3;
    }

    public void setM3(Mazo m3) {
        this.m3 = m3;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + '}';
    }
    
}