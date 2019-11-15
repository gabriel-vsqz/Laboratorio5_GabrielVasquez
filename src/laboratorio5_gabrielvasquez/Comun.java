package laboratorio5_gabrielvasquez;

public class Comun extends Carta {

    public Comun() {
        super();
    }

    public Comun(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Comun{" + '}';
    }
    
}