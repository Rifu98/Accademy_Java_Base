package metodiDiPagamento;

public class CartaDiCredito extends MetodoPagamento {

    public CartaDiCredito(String numeroAccount, double saldo) {
        super(numeroAccount, saldo);
    }

    @Override
    public void processaPagamento(double importo) {
        saldo -= importo;
    }
}
