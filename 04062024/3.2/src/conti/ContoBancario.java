package conti;

public class ContoBancario {
    private double saldo;

    public ContoBancario() {
        this.saldo = 0;
    }

    public void deposita(double importo) {
        saldo += importo;
    }

    public void preleva(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
        } else {
            System.out.println("Saldo insufficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}