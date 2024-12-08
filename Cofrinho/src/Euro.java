public class Euro extends MoedaClasseAbstrata { // A classe Euro é uma extensão da MoedaClasseAbstrata
    public Euro(double valor){

        super(valor, "Europa");
    }

    //Override signifca que o método está sobreescrevendo outro

    @Override
    public double converterReais(){
        return valor * 6.30; // Retorna o valor multiplicado pela cotação "fictícia" do Euro em relação ao real
    }

    @Override
    public String info(){
        return "Euro: " + valor;
    }
}
