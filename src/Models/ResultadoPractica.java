package Models;

public class ResultadoPractica {
    private Practica practica;
    private int valor;

    public Practica getPractica() {
        return practica;
    }

    public int getValor() {
        return valor;
    }

    public void setPractica(Practica practica) {
        this.practica = practica;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
