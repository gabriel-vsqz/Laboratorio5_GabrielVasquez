package laboratorio5_gabrielvasquez;

public class Legendaria extends Carta {

    public Legendaria() {
        super();
    }

    public Legendaria(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Legendaria{" + '}';
    }
    
}