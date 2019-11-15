package laboratorio5_gabrielvasquez;

public class Gigante_Noble extends Carta {

    public Gigante_Noble() {
        super();
    }

    public Gigante_Noble(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Gigante_Noble - " + super.toString();
    }
    
}