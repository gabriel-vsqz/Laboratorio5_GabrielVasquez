package laboratorio5_gabrielvasquez;

public class Pandilla_Duendes extends Carta {

    public Pandilla_Duendes() {
        super();
    }

    public Pandilla_Duendes(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Pandilla_Duendes - " + super.toString();
    }
    
}