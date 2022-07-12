package bytebankherdadoconta;

public class CalculadorDeImposto {

    private double totalImposto;

    public void Regista(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto += valor;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
