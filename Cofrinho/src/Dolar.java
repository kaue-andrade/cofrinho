public class Dolar extends MoedaClasseAbstrata {
    public Dolar(double valor){
        super(valor, "EUA");
    }

    @Override
    public double converterReais(){
        return valor * 5.00;
    }

    @Override
    public String info(){
        return "Dólar: " + valor;
    }
}
