package controller;

import model.Transaction;
import java.util.ArrayList;
import exceptions.EntradaInvalidaException;
import utils.Colors;

public class FinTracker {

    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void adicionarTransaction(Transaction t) throws EntradaInvalidaException {

        if (t.getValor() < 0) {
            throw new EntradaInvalidaException(Colors.RED + "O valor não pode ser negativo." + Colors.RESET);
        }

        transactions.add(t);
    }

    public void listarTransactions() {
        if (transactions.isEmpty()) {
            System.out.println("Nenhuma transação cadastrada.");
        } else {
            for (int i = 0; i <  transactions.size(); i++) {
                System.out.println("[" + i + "] " + transactions.get(i));
            }
        }
    }

    public void removerTransaction(int indice) {
        if (indice >= 0 && indice < transactions.size()) {
            transactions.remove(indice);

            System.out.println("Transação removida com sucesso! ");
        } else {
            System.out.println("Índice  inválido!");
        }
    }

    public double calcularSaldoTotal() {
        double saldo = 0;
        for (Transaction t : transactions) {
            if (t.isEhReceita()) {
                saldo += t.getValor();
            } else {
                saldo -= t.getValor();
            }
        }
        return saldo;
    }
}
