package laboratorio5_gabrielvasquez;

public class Epica extends Carta {

    public Epica() {
        super();
    }

    public Epica(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Epica{" + '}';
    }
    
}