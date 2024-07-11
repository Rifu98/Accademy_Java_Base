package metodiDiPagamento;

public class PayPal extends MetodoPagamento {

    public PayPal(String numeroAccount, double saldo) {
        super(numeroAccount, saldo);
    }

    @Override
    public void processaPagamento(double importo) {
        if (saldo >= importo) {
            saldo -= importo;
        } else {
            System.out.println("Saldo insufficiente");
        }
    }
}