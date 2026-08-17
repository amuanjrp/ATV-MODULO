package org.example;
import java.util.Scanner;

public class ModuloDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPessoas = 0;
        double somaSalarios = 0.0;
        int maiorIdade = Integer.MIN_VALUE;
        int menorIdade = Integer.MAX_VALUE;
        int mulheresSalarioAlto = 0;

        int opcao = 0;

        do {
            System.out.println("===============================");
            System.out.println("1 | Adicionar pessoa");
            System.out.println("2 | Exibir resultados");
            System.out.println("3 | Sair");
            System.out.println("===============================");
            System.out.print("> Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("> Idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("> Sexo (M/F): ");
                    char sexo = scanner.next().toUpperCase().charAt(0);

                    System.out.print("> Salário: ");
                    double salario = scanner.nextDouble();

                    somaSalarios += salario;
                    totalPessoas++;

                    if (idade > maiorIdade) {
                        maiorIdade = idade;
                    }
                    if (idade < menorIdade) {
                        menorIdade = idade;
                    }
                    if (sexo == 'F' && salario >= 5000.0) {
                        mulheresSalarioAlto++;
                    }

                    System.out.println("> Registro incluído. Retornando ao menu...");
                    break;

                case 2:
                    System.out.println("==========================================");
                    System.out.println("         RESULTADOS ESTATÍSTICOS          ");
                    System.out.println("==========================================");

                    if (totalPessoas == 0) {
                        System.out.println("Nenhum registro cadastrado até o momento.");
                    } else {
                        double mediaSalarial = somaSalarios / totalPessoas;

                        System.out.printf("• Média salarial do grupo: R$ %.2f%n", mediaSalarial);
                        System.out.println("• Maior idade registrada: " + maiorIdade + " anos");
                        System.out.println("• Menor idade registrada: " + menorIdade + " anos");
                        System.out.println("• Mulheres com salário >= R$ 5.000,00: " + mulheresSalarioAlto);
                    }
                    System.out.println("==========================================");
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                    break;
            }

        } while (opcao != 3);

        scanner.close();
    }
}
