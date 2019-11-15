package laboratorio5_gabrielvasquez;

public class Dragon extends Carta {

    public Dragon() {
        super();
    }

    public Dragon(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Dragon - " + super.toString();
    }
    
}