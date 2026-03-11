package utils;

public class Formatter {

    public static String formatarValor(double valor) {
        return String.format("R$ %.2f", valor);
    }
}
