public class Calculo {

    public static double buscarJuros(int quantidadeParcelas) {
        double juros = 0;

        if (quantidadeParcelas == 12) {
            juros = 0.05;
        } else if (quantidadeParcelas == 24) {
            juros = 0.10;
        } else if (quantidadeParcelas == 36) {
            juros = 0.15;
        } else if (quantidadeParcelas == 48) {
            juros = 0.20;
        } else if (quantidadeParcelas == 60) {
            juros = 0.30;
        }

        return juros;
    }

    public static double calcularValorComJuros(
            double valorVeiculo,
            double juros) {

        return valorVeiculo + (valorVeiculo * juros);
    }

    public static double calcularValorParcela(
            double valorComJuros,
            int quantidadeParcelas) {

        return valorComJuros / quantidadeParcelas;
    }

    public static double calcularLimiteParcela(double salarioMensal) {
        return salarioMensal * 0.30;
    }

    public static boolean verificarAprovacao(
            double valorParcela,
            double limiteParcela) {

        return valorParcela <= limiteParcela;
    }
}