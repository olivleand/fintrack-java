package model;

import java.time.LocalDate;

public class Transaction {

    private String description;
    private double valor;
    private boolean ehReceita;
    private LocalDate data;

    public Transaction(String description, double valor, boolean ehReceita, LocalDate data) {
        this.description = description;
        this.valor = valor;
        this.ehReceita = ehReceita;
        this.data = data;
    }

    public String getDescricao() {
        return description;
    }

    public double getValor() {
        return valor;
    }

    public boolean isEhReceita() {
        return ehReceita;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        String tipo = ehReceita ? "Receita" : "Despesa";
        return tipo + " | " + description + " | R$ " + valor + " | " + data;
    }
}
