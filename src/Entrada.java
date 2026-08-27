import java.util.Scanner;

public class Entrada {

    public static String lerNome(Scanner scanner) {
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Erro: o nome não pode ser vazio.");
            return lerNome(scanner);
        }

        if (!nome.matches("[a-zA-ZÀ-ÿ\\s]+")) {
            System.out.println("Erro: o nome deve conter apenas letras.");
            return lerNome(scanner);
        }

        return nome;
    }
    public static double lerValorVeiculo(Scanner scanner) {
        return lerValorPositivo(
                scanner,
                "Digite o valor do veículo: R$ ",
                "Erro: o valor do veículo deve ser um número maior que 0."
        );
    }

    public static double lerSalarioMensal(Scanner scanner) {
        return lerValorPositivo(
                scanner,
                "Digite o salário mensal: R$ ",
                "Erro: o salário deve ser um número maior que 0."
        );
    }

    private static double lerValorPositivo(
            Scanner scanner,
            String mensagem,
            String mensagemErro) {

        System.out.print(mensagem);

        String entrada = scanner.nextLine()
                .trim()
                .replace(",", ".");

        if (isNumeroValido(entrada)) {
            double valor = Double.parseDouble(entrada);

            if (valor > 0) {
                return valor;
            }

            System.out.println(mensagemErro);
        } else {
            System.out.println("Erro: digite um valor numérico válido.");
        }

        return lerValorPositivo(scanner, mensagem, mensagemErro);
    }

    public static int lerQuantidadeParcelas(Scanner scanner) {
        System.out.print(
                "Digite a quantidade de parcelas (12, 24, 36, 48 ou 60): "
        );

        String entrada = scanner.nextLine().trim();

        if (isNumeroInteiroValido(entrada)) {
            int quantidade = Integer.parseInt(entrada);

            if (quantidade == 12 || quantidade == 24 ||
                quantidade == 36 || quantidade == 48 ||
                quantidade == 60) {

                return quantidade;
            }

            System.out.println(
                    "Quantidade de parcela inválida. " +
                    "Escolha entre 12, 24, 36, 48 ou 60."
            );
        } else {
            System.out.println("Erro: digite um número inteiro válido.");
        }

        return lerQuantidadeParcelas(scanner);
    }

    private static boolean isNumeroValido(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isNumeroInteiroValido(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}