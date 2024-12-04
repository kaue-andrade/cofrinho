import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=-=-=-==-=-=-=-=");
        System.out.println(" $ Cofrinho $ ");
        System.out.println("=-=-=-==-=-=-=-=");

        Cofrinho cofrinho = new Cofrinho();

        int removermoeda;
        int escolha = 0;
        String opcao = "n";
        MoedaClasseAbstrata indice;

        while (escolha != 5){
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em reais (R$)");
            System.out.println("5 - Sair");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");


            System.out.print("\nDigite sua escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {

                case 1:
                    System.out.println("\nA opção adicionar moeda foi selecionada.");

                    System.out.println("\nEscolha a moeda: 1 - Dólar, 2 - Euro, 3 - Real");
                    System.out.print("\nOpção >> ");
                    int tipoMoeda = scanner.nextInt();

                    if (tipoMoeda == 1) {

                        System.out.println("\nOpção dólar selecionada.\n");
                        System.out.print("Informe o valor: ");

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Dolar(valor));
                    } else if (tipoMoeda == 2) {
                        System.out.println("\nOpção euro selecionada.\n");
                        System.out.print("Informe o valor: ");

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Euro(valor));
                    } else if(tipoMoeda == 3) {

                        System.out.println("\nOpção real selecionada.\n");
                        System.out.print("Informe o valor: ");

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Real(valor));
                    } else System.out.println("Tipo de moeda inválido!");
                    break;
                case 2:

                    

                    cofrinho.mostrarMoeda();
                    break;
                case 3:
                    System.out.println("\nA opção listar moedas foi selecionada.\n");

                    do {
                        cofrinho.listarMoedas();


                        System.out.println("\n's' -> Voltar ao menu principal | Qualquer outra tecla -> Listar moedas novamente");
                        System.out.print("\nOpção >> ");
                        opcao = scanner.next();

                    } while (!opcao.equalsIgnoreCase("s"));

                    break;
                case 4:
                    System.out.println("\nA opção calcular total em reais foi selecionada.");

                    opcao = "n";

                    do {
                        System.out.println("\nTotal em reais: " + cofrinho.calcularTotalReais());

                        System.out.println("\n's' -> Voltar ao menu principal | Qualquer outra tecla -> Calcular total em reais novamente");
                        System.out.print("\nOpção >> ");
                        opcao = scanner.next();

                    } while (!opcao.equalsIgnoreCase("s"));

                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    break;
                default:
                    System.out.println("\nOpção não correspondente! Tente novamente!");
            }
        }
    }
}