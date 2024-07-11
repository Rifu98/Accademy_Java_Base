package metodiDiPagamento;

import exceptions.SaldoInsufficienteException;

public class CartaDiCredito extends MetodoPagamento {

    public CartaDiCredito(String numeroAccount, double saldo) {
        super(numeroAccount, saldo);
    }

    @Override
    public void processaPagamento(double importo) throws SaldoInsufficienteException {
        if (saldo >= importo) {
            saldo -= importo;
        } else {
            throw new SaldoInsufficienteException("Saldo insufficiente sulla carta di credito");
        }
    }
}
