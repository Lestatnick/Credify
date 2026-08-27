import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = Entrada.lerNome(scanner);
        double valorVeiculo = Entrada.lerValorVeiculo(scanner);
        double salarioMensal = Entrada.lerSalarioMensal(scanner);
        int quantidadeParcelas = Entrada.lerQuantidadeParcelas(scanner);

        double juros = Calculo.buscarJuros(quantidadeParcelas);
        double valorComJuros = Calculo.calcularValorComJuros(valorVeiculo, juros);
        double valorParcela = Calculo.calcularValorParcela(valorComJuros, quantidadeParcelas);
        double limiteParcela = Calculo.calcularLimiteParcela(salarioMensal);

        boolean aprovado = Calculo.verificarAprovacao(valorParcela, limiteParcela);

        Exibicao.exibirResumo(
                nome,
                valorVeiculo,
                quantidadeParcelas,
                juros,
                valorComJuros,
                valorParcela,
                salarioMensal,
                limiteParcela,
                aprovado
        );

        scanner.close();
    }
}