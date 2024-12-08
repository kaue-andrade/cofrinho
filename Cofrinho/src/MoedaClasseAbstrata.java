public abstract class MoedaClasseAbstrata {
    // Variáveis que somente as subclasses poderam usar devido ao protected
    // Valor = valor da moeda a ser implementada
    // País = País ao qual a moeda se refere

    protected double valor;
    protected String pais;

    public MoedaClasseAbstrata(double valor, String pais) { // Método construtor é responsável por inicializar os atrubytis do objeto
        this.valor = valor;
        this.pais = pais;
    }


    //Definem como as outras devem implementar concretamente e se comportar

    public abstract double converterReais(); //Método abstrato
    public abstract String info(); //NMétodo abstrato

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof MoedaClasseAbstrata)) return false;
        MoedaClasseAbstrata moeda = (MoedaClasseAbstrata) obj;
        return this.valor == moeda.valor && this.pais.equals(moeda.pais);
    }
}
