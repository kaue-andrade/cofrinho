public class Real extends MoedaClasseAbstrata { // A classe Real é uma extensão da MoedaClasseAbstrata

    public Real(double valor){
        super(valor, "Brasil");
    }

    //Override signifca que o método está sobreescrevendo outro

    @Override
    public double converterReais(){
        return valor * 1.0; // Retorna o valor multiplicado por 1, pois o 1 real = 1 real
    }

    @Override
    public String info(){
        return "Real: " + valor;
    }
}