package main;

import exceptions.SaldoInsufficienteException;
import metodiDiPagamento.*;

public class Main {
    public static void main(String[] args) {
        MetodoPagamento carta = new CartaDiCredito("1234-5678-9012-3456", 1000);
        MetodoPagamento paypal = new PayPal("email@example.com", 500);

        try {
            carta.processaPagamento(200);
            System.out.println("Saldo carta di credito: " + carta.getSaldo());
        } catch (SaldoInsufficienteException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        try {
            paypal.processaPagamento(300);
            System.out.println("Saldo PayPal: " + paypal.getSaldo());
        } catch (SaldoInsufficienteException e) {
            System.err.println("Errore: " + e.getMessage());
        }

        try {
            paypal.processaPagamento(300);
        } catch (SaldoInsufficienteException e) {
            System.err.println("Errore: " + e.getMessage());
        }
    }
}
