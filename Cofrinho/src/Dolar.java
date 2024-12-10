public class Dolar extends MoedaClasseAbstrata { // A classe Dolar é uma extensão da MoedaClasseAbstrata
    // Faz a configuração dos atributos herdados da superclasse
    // Passa o valor passado pelo usuário e define que o real é um moeda dos EUA
    public Dolar(double valor){
        super(valor, "EUA");
    }

    //Override signifca que o método está sobreescrevendo outro

    @Override
    public double converterReais(){
        return valor * 5.00; // Retorna o valor multiplicado pela cotação "fictícia" do Dólar em relação ao real
    }

    @Override
    public String info(){
        return "Dólar: " + valor;
    } // Faz o retorno de dólar com seu valor específico
}
