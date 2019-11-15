package laboratorio5_gabrielvasquez;

public class Minipekka extends Carta {

    public Minipekka() {
        super();
    }

    public Minipekka(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Minipekka - " + super.toString();
    }
    
}