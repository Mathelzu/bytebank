package bytebankherdadoconta;

public class ContaCorrente extends Conta{

    ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public boolean saca(double valor) {
        double valorTaxa = valor + 0.2;
        return super.saca(valorTaxa);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

}
