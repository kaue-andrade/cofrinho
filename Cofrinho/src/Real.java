public class Real extends MoedaClasseAbstrata {

    public Real(double valor){
        super(valor, "Brasil");
    }

    @Override
    public double converterReais(){
        return valor * 1.0;
    }

    @Override
    public String info(){
        return "Real: " + valor;
    }
}