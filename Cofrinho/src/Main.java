import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Mensagem decorativa do sistema cofrinho

        System.out.println("=-=-=-==-=-=-=-=");
        System.out.println(" $ Cofrinho $ ");
        System.out.println("=-=-=-==-=-=-=-=");

        Cofrinho cofrinho = new Cofrinho(); // Cria uma instância associada a classe Cofrinho

        int removermoeda;
        int escolha = 0;
        String opcao = "n";
        MoedaClasseAbstrata indice;

        while (escolha != 5){ // Se for = 5, encerrará todo o algoritmo
            System.out.println();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("1 - Adicionar moeda");
            System.out.println("2 - Remover moeda");
            System.out.println("3 - Listar moedas");
            System.out.println("4 - Calcular total em reais (R$)");
            System.out.println("5 - Sair");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");

            // Implementação do scanner para solicitar o valor da variável "escolha"

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

                    System.out.println("=-=-=-= Remoção da moeda =-=-=-=");
                    System.out.print("\nTipo da moda > ");
                    String tipo = scanner.next();

                    System.out.print("\nValor da moeda > ");
                    double valor = scanner.nextDouble();

                    MoedaClasseAbstrata moedaRemover = null;

                    switch (tipo.toLowerCase()){
                        case "real":
                            moedaRemover = new Real(valor);
                            System.out.println(moedaRemover);
                            break;
                        case "dolar":
                            moedaRemover = new Dolar(valor);
                            System.out.println(moedaRemover);
                            break;
                        case "euro":
                            moedaRemover = new Euro(valor);
                            System.out.println(moedaRemover);
                            break;
                        default:
                            System.out.println("Moeda inválida");
                            break;
                    }

                    boolean removido = cofrinho.removerMoeda(moedaRemover);

                    if (removido) {
                        System.out.println("Moeda removida");
                    } else {
                        System.out.println("Moeda não encontrada");
                    }
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