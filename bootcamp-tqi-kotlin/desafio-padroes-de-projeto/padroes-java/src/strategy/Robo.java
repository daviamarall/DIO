package strategy;

public class Robo {

    private Comportamento Comportamento;

    public void setComportamento(strategy.Comportamento comportamento) {
        Comportamento = comportamento;
    }

    public void mover() {
        Comportamento.mover();
    }

}

