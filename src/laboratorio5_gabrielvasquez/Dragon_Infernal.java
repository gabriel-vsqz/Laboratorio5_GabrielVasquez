package laboratorio5_gabrielvasquez;

public class Dragon_Infernal extends Carta {

    public Dragon_Infernal() {
        super();
    }

    public Dragon_Infernal(String nombre, int damage, int hp, String objetivo, String velocidad, int elixir, String rango) {
        super(nombre, damage, hp, objetivo, velocidad, elixir, rango);
    }

    @Override
    public String toString() {
        return "Dragon_Infernal - " + super.toString();
    }
    
}