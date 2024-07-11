package main;

import conti.ContoBancario;

public class Main {
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario();
        conto.deposita(1000);
        conto.preleva(500);
        conto.preleva(400);
        System.out.println("Saldo rimanente: " + conto.getSaldo());
    }
}
