import java.util.Scanner;
public class AulaPedro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // inputs e entrada de dados

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor do veículo: R$  ");
        Double valor_veiculo = scanner.nextDouble();
        System.out.println("Digite o salário mensal: ");
        Double salario_mensal = scanner.nextDouble();
        System.out.println("Digite a quantidade de parcelas: (12x a 60x )");
        int quantidade_parcelas = scanner.nextInt();

        Double limite_parcela = valor_veiculo * 0.30;

        // Condicionais  e validações/notificações de erro
        if (quantidade_parcelas != 60 && quantidade_parcelas != 12 && quantidade_parcelas != 24 && quantidade_parcelas != 36 &&
                quantidade_parcelas != 48) {
            System.out.println("Erro, Quantidade inválida ");
        } else if ( > limite_parcela);
        System.out.println("Valor acima do orçamento! ");
    }

}








