public class Real extends MoedaClasseAbstrata { // A classe Real é uma extensão da MoedaClasseAbstrata

    // Faz a configuração dos atributos herdados da superclasse
    // Passa o valor passado pelo usuário e define que o real é um moeda do Brasil

    public Real(double valor){
        super(valor, "Brasil");
    }

    //Override signifca que o método está sobreescrevendo outro


    @Override
    public String info(){
        return "Real: " + valor;
    } // Faz o retorno de real com seu valor específico


    @Override
    public double converterReais(){
        return valor * 1.0; // Retorna o valor multiplicado por 1, pois o 1 real = 1 real
    }
}