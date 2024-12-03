public abstract class MoedaClasseAbstrata {
    protected double valor;
    protected String pais;

    public MoedaClasseAbstrata(double valor, String pais) {
        this.valor = valor;
        this.pais = pais;
    }

    public abstract double converterReais();
    public abstract String info();

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof MoedaClasseAbstrata)) return false;
        MoedaClasseAbstrata moeda = (MoedaClasseAbstrata) obj;
        return this.valor == moeda.valor && this.pais.equals(moeda.pais);
    }
}
