import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<MoedaClasseAbstrata> moedas; // Cria o ArrayList moedas

    public Cofrinho(){ // Método construtor
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(MoedaClasseAbstrata moeda){ //Método para adicionarMoeda
        moedas.add(moeda); // Adiciona moeda ao ArrayList
    }

    public boolean removerMoeda(MoedaClasseAbstrata moeda){ //Método para removerMoeda
        if (moedas.remove(moeda)){
            return true;
        } else {
            return false;
        }

        // Usa o método remove (padrão do ArrayList)

    }

    // O método listarMoedas é privado porque está especificado pelo diagrama no documento em PDF

    private void listarMoedas(){ // Mostra as moedas como saída para que o usuário (ao acionar) consiga visualizar os valores
        if (moedas.isEmpty()){ // Se "moedas estiver vazia, mostrará a mensagem que está vazia"
            System.out.println("O cofrinho está vazio. ");
            return;
        }

        for (MoedaClasseAbstrata moeda: moedas) { // Faz um for para listar todas as moedas
            System.out.println(moeda.info()); // Chama o método info estabelecido na MoedaClasseAbstrata e
        }
    }

    public void chamarListarMoedas() { // Mostra as moedas como saída para que o usuário (ao acionar) consiga visualizar os valores
        listarMoedas();
    }

    public double calcularTotalReais() { // Calcula o total em Reais de cada moeda adicionada a lista
        double total = 0; // Inicia a variável total como 0 para que não entre em looping
        for (MoedaClasseAbstrata moeda: moedas) {
            total += moeda.converterReais(); // Na variável total, será armazenada cada valor da moeda com sua respectiva conversão para real
        }

        return total; // Retorna a variável total
    }
}
