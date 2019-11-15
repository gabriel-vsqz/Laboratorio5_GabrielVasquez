package laboratorio5_gabrielvasquez;

public class Golem extends Carta {

    public Golem() {
        super();
    }

    public Golem(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Golem - " + super.toString();
    }
    
}