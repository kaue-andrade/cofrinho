import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<MoedaClasseAbstrata> moedas;

    public Cofrinho(){
        this.moedas = new ArrayList<>();
    }

    public void adicionarMoeda(MoedaClasseAbstrata moeda){
        moedas.add(moeda);
    }

    public void removerMoeda(MoedaClasseAbstrata moeda){
        moedas.remove(moeda);
    }

    public void listarMoedas() {
        if (moedas.isEmpty()){
            System.out.println("O cofrinho está vazio. ");
            return;
        }

        for (MoedaClasseAbstrata moeda: moedas) {
            System.out.println(moeda.info());
        }
    }

    public double calcularTotalReais() {
        double total = 0;
        for (MoedaClasseAbstrata moeda: moedas) {
            total += moeda.converterReais();
        }

        return total;
    }
}
