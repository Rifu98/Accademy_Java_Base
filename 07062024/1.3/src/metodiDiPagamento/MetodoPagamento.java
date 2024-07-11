package metodiDiPagamento;

import exceptions.SaldoInsufficienteException;

public abstract class MetodoPagamento {
    protected String numeroAccount;
    protected double saldo;

    public MetodoPagamento(String numeroAccount, double saldo) {
        this.numeroAccount = numeroAccount;
        this.saldo = saldo;
    }

    public abstract void processaPagamento(double importo) throws SaldoInsufficienteException;

    public String getNumeroAccount() {
        return numeroAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}