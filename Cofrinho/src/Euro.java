public class Euro extends MoedaClasseAbstrata {
    public Euro(double valor){

        super(valor, "Europa");
    }

    @Override
    public double converterReais(){
        return valor * 6.30;
    }

    @Override
    public String info(){
        return "Euro: " + valor;
    }
}
