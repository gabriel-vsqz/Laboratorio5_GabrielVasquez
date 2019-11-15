package laboratorio5_gabrielvasquez;

public class Leñador extends Carta {

    public Leñador() {
        super();
    }

    public Leñador(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Leñador - " + super.toString();
    }
    
}