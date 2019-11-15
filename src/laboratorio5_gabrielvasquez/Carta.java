package laboratorio5_gabrielvasquez;

public class Carta {
 
    private String nombre;
    private int damage;
    private int hp;
    private String objetivo;
    private String velocidad;
    private int elixir;
    private String rango;

    public Carta() {
    }

    public Carta(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        this.nombre = nombre;
        this.damage = damage;
        this.hp = hp;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.elixir = elixir;
        this.rango = rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}