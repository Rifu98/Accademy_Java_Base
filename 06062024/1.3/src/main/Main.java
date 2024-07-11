package main;

import metodiDiPagamento.*;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento carta = new CartaDiCredito("1234-5678-9012-3456", 1000);
        MetodoPagamento paypal = new PayPal("email@example.com", 500);

        carta.processaPagamento(200);
        System.out.println("Saldo carta di credito: " + carta.getSaldo());

        paypal.processaPagamento(300);
        System.out.println("Saldo PayPal: " + paypal.getSaldo());

        paypal.processaPagamento(300);
    }

}
