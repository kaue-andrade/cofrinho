public class Dolar extends MoedaClasseAbstrata { // A classe Dolar é uma extensão da MoedaClasseAbstrata
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
    }
}
