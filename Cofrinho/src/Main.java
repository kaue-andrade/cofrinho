// Faz as importações necessárias para que o algoritmo funcione normalmente

import java.util.ArrayList;
import java.util.Scanner;

public class Main { // Classe principal
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Mensagem decorativa do sistema cofrinho

        System.out.println("=-=-=-==-=-=-=-=");
        System.out.println(" $ Cofrinho $ ");
        System.out.println("=-=-=-==-=-=-=-=");

        Cofrinho cofrinho = new Cofrinho(); // Cria uma instância associada a classe Cofrinho

        // Cria as variáveis necessárias para a execução do programa
        // Dependendo da variável, alguns não recebem, inicialmente, nenhum valor. Porém, outras variáveis recebem

        int removermoeda;
        int escolha = 0;
        String opcao = "n";
        MoedaClasseAbstrata indice;
        int validacao = 1;

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

            // Múltiplos algoritmos de acordo com a escolha do usuário

            switch (escolha) {


                // Se for, vai adicionar moeda
                case 1:
                    System.out.println("\nA opção adicionar moeda foi selecionada.");

                    System.out.println("\nEscolha a moeda: 1 - Dólar, 2 - Euro, 3 - Real");
                    System.out.print("\nOpção >> ");
                    int tipoMoeda = scanner.nextInt(); // Solicita o tipo para o usuário

                    // Se for 1, o dólar com o respectivo valor será adicionado
                    if (tipoMoeda == 1) {

                        System.out.println("\nOpção DÓLAR selecionada.\n");
                        System.out.print("Informe o valor: "); // Solicita o valor

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Dolar(valor)); // O método adiciona criando uma instância da classe Dolar passando valor como parâmetro
                    } else if (tipoMoeda == 2) {
                        System.out.println("\nOpção EURO selecionada.\n");
                        System.out.print("Informe o valor: ");

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Euro(valor)); // O método adiciona criando uma instância da classe Euro passando valor como parâmetro
                    } else if(tipoMoeda == 3) {

                        System.out.println("\nOpção REAL selecionada.\n");
                        System.out.print("Informe o valor: ");

                        double valor = scanner.nextDouble();

                        cofrinho.adicionarMoeda(new Real(valor)); // O método adiciona criando uma instância da classe Real passando valor como parâmetro
                    } else System.out.println("Tipo de moeda inválido!");
                    break;
                case 2: // No caso 2, implementa a remoção da moeda do ArrayList

                    System.out.println("\n=-=-=-= Remoção da moeda =-=-=-=");
                    System.out.print("\nTipo da moeda > ");
                    String tipo = scanner.next();

                    while (!tipo.equals("euro") && !tipo.equals("real") && !tipo.equals("dolar")){
                        System.out.println("\nMoeda inválida.");
                        System.out.print("\nTipo da moeda > ");
                        tipo = scanner.next();
                    }

                    System.out.print("\nValor da moeda > ");
                    double valor = scanner.nextDouble();

                    MoedaClasseAbstrata moedaRemover = null; //Não atribui, inicialmente, a nenhum método

                    switch (tipo.toLowerCase()){
                        case "real":
                            moedaRemover = new Real(valor); // Remove o real com o respectivo valor
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
                    }

                    if (moedaRemover != null){ // Se não estiver vazio

                        boolean removido = cofrinho.removerMoeda(moedaRemover);

                        if (removido) { // Se for true
                            System.out.println("Moeda removida");
                        } else { // Se for falso mostra a mensagem e dá um break (volta para o menu)
                        System.out.println("Moeda não encontrada.");
                        }
                    }
                    break;
                case 3: // No caso 3, lista todas as moedas
                    System.out.println("\nA opção listar moedas foi selecionada.\n");

                    do {
                        cofrinho.chamarListarMoedas(); // Chama o método para listar moedas


                        System.out.println("\n's' -> Voltar ao menu principal | Qualquer outra tecla -> Listar moedas novamente");
                        System.out.print("\nOpção >> ");
                        opcao = scanner.next();

                    } while (!opcao.equalsIgnoreCase("s")); // Estabelece uma condição para sair do while || Só sai quando for s ou S

                    break;
                case 4: // Caso seja 4, será calculado o total em rR$
                    System.out.println("\nA opção calcular total em reais foi selecionada.");

                    opcao = "n";

                    do {
                        System.out.println("\nTotal em reais: " + cofrinho.calcularTotalReais()); // Calcula o total em reias fazendo a multiplicação de cada
                        //moeda por sua respectiva cotação e soma elas

                        System.out.println("\n's' -> Voltar ao menu principal | Qualquer outra tecla -> Calcular total em reais novamente");
                        System.out.print("\nOpção >> ");
                        opcao = scanner.next();

                    } while (!opcao.equalsIgnoreCase("s")); // Estabelece uma condição para sair do while || Só sai quando for s ou S

                    break;
                case 5: // Se for 5, o programa irá mostrar uma saída e encerrar o algoritmo
                    System.out.println("\nSaindo...");
                    break;
                default: // Saída do caso padrão (Quando não corresponde a nenhum dos casos )
                    System.out.println("\nOpção não correspondente! Tente novamente!");
            }
        }
    }
}