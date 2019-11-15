package laboratorio5_gabrielvasquez;

public class Montapuerco extends Carta {

    public Montapuerco() {
        super();
    }

    public Montapuerco(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Montapuerco - " + super.toString();
    }
    
}