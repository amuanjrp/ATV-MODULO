import java.util.Scanner;

public class ModuloUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorTotal = 0.0;
        char continuar = 'S';

        System.out.println("===========================================");
        System.out.println("          CARDÁPIO SABOR & ARTE            ");
        System.out.println("===========================================");
        System.out.println(" Código | Prato           | Valor          ");
        System.out.println("    1   | Pão com ovo     | R$ 5,00        ");
        System.out.println("    2   | Bife acebolado  | R$ 15,00       ");
        System.out.println("    3   | Strogonoff      | R$ 18,00       ");
        System.out.println("    4   | Lasanha         | R$ 20,00       ");
        System.out.println("    5   | Picanha         | R$ 25,00       ");
        System.out.println("===========================================");

        do {
            System.out.print("Selecione um Prato: ");
            int codigo = scanner.nextInt();

            switch (codigo) {
                case 1:
                    valorTotal += 5.00;
                    System.out.println("-> Pão com ovo adicionado!");
                    break;
                case 2:
                    valorTotal += 15.00;
                    System.out.println("-> Bife acebolado adicionado!");
                    break;
                case 3:
                    valorTotal += 18.00;
                    System.out.println("-> Strogonoff adicionado!");
                    break;
                case 4:
                    valorTotal += 20.00;
                    System.out.println("-> Lasanha adicionada!");
                    break;
                case 5:
                    valorTotal += 25.00;
                    System.out.println("-> Picanha adicionada!");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha um código de 1 a 5.");
                    continue;
            }

            System.out.print("Deseja adicionar outro prato? (S/N): ");
            continuar = scanner.next().toUpperCase().charAt(0);
            System.out.println();

        } while (continuar == 'S');

        System.out.println("==========================================");
        System.out.printf("Seu pedido foi finalizado, Total da sua compra : R$ " + valorTotal);
        System.out.println("==========================================");

        scanner.close();
    }
}