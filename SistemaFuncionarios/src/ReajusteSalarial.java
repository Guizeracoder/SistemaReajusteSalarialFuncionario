import java.util.Scanner;
public class ReajusteSalarial {
        public static void main(String[] args) {
            // Criação de scanner para receber o salário do colaborador
            Scanner scanner = new Scanner(System.in);

            // Solicita o salário atual do colaborador
            System.out.print("Digite o salário atual do colaborador: R$ ");
            double salario = scanner.nextDouble();

            // Variáveis para calcular o aumento e o novo salário
            double aumentoPercentual = 0;
            double aumento = 0;
            double novoSalario = 0;

            // Determina o percentual de aumento com base no salário
            if (salario <= 280) {
                aumentoPercentual = 20; // Aumento de 20% para salários até R$ 280,00
            } else if (salario > 280 && salario <= 700) {
                aumentoPercentual = 15; // Aumento de 15% para salários entre R$ 280,01 e R$ 700,00
            } else if (salario > 700 && salario <= 1500) {
                aumentoPercentual = 10; // Aumento de 10% para salários entre R$ 700,01 e R$ 1500,00
            } else {
                aumentoPercentual = 5; // Aumento de 5% para salários acima de R$ 1500,00
            }

            // Calcula o valor do aumento
            aumento = salario * aumentoPercentual / 100;

            // Calcula o novo salário após o aumento
            novoSalario = salario + aumento;

            // Inflação do período
            double inflacao = 3.8;

            // Calcula o aumento real, descontando a inflação
            double aumentoReal = aumento - (aumento * inflacao / 100);

            // Exibe as informações solicitadas
            System.out.println("\n--- Informações sobre o reajuste salarial ---");
            System.out.printf("1. Salário antes do reajuste: R$ %.2f\n", salario);
            System.out.printf("2. Percentual de aumento aplicado: %.2f%%\n", aumentoPercentual);
            System.out.printf("3. Valor do aumento: R$ %.2f\n", aumento);
            System.out.printf("4. Novo salário após o aumento: R$ %.2f\n", novoSalario);
            System.out.printf("5. Aumento real (descontando a inflação de %.2f%%): R$ %.2f\n", inflacao, aumentoReal);

            // Fecha o scanner
            scanner.close();
        }
    }


