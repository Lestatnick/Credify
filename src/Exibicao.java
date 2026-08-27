import java.util.Locale;

public class Exibicao {

    public static void exibirResumo(
            String nome,
            double valorVeiculo,
            int quantidadeParcelas,
            double juros,
            double valorComJuros,
            double valorParcela,
            double salarioMensal,
            double limiteParcela,
            boolean aprovado) {

        String situacao = aprovado ? "APROVADO" : "REPROVADO";

        Locale locale = Locale.forLanguageTag("pt-BR");

        System.out.println();
        System.out.println("===== Resumo da Simulação =====");

        System.out.printf(locale, "Nome: %s%n", nome);
        System.out.printf(locale, "Valor do veículo: R$ %.2f%n", valorVeiculo);
        System.out.printf(locale, "Quantidade de parcelas: %dx%n", quantidadeParcelas);
        System.out.printf(locale, "Juros aplicado: %.0f%%%n", juros * 100);
        System.out.printf(locale, "Valor total com juros: R$ %.2f%n", valorComJuros);
        System.out.printf(locale, "Valor da parcela: R$ %.2f%n", valorParcela);
        System.out.printf(locale, "Salário informado: R$ %.2f%n", salarioMensal);
        System.out.printf(locale, "Limite de 30%%: R$ %.2f%n", limiteParcela);
        System.out.printf(locale, "Situação: %s%n", situacao);
    }
}