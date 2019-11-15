package laboratorio5_gabrielvasquez;

public class Especial extends Carta {

    public Especial() {
        super();
    }

    public Especial(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Especial{" + '}';
    }
    
}