package laboratorio5_gabrielvasquez;


public class Mazo {
 
    private int coste;
    private Carta c1;
    private Carta c2;
    private Carta c3;

    public Mazo() {
    }

    public Mazo(int coste, Carta c1, Carta c2, Carta c3) {
        this.coste = coste;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public Carta getC1() {
        return c1;
    }

    public void setC1(Carta c1) {
        this.c1 = c1;
    }

    public Carta getC2() {
        return c2;
    }

    public void setC2(Carta c2) {
        this.c2 = c2;
    }

    public Carta getC3() {
        return c3;
    }

    public void setC3(Carta c3) {
        this.c3 = c3;
    }

    @Override
    public String toString() {
        return "Mazo{" + "coste=" + coste + ", c1=" + c1 + ", c2=" + c2 + ", c3=" + c3 + '}';
    }
    
}