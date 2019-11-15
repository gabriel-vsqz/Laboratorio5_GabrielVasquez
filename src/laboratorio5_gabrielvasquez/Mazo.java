package laboratorio5_gabrielvasquez;

import java.util.ArrayList;

public class Mazo {
 
    private int coste;
    private ArrayList<Carta> cartas = new ArrayList();

    public Mazo() {
    }

    public Mazo(int coste) {
        this.coste = coste;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazo - " + "Coste: " + coste + ", Cartas: " + cartas + '}';
    }

}