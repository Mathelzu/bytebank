package bytebankencapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    //Cliente titular = new Cliente();
    private static int total;
    // contrutores
    public Conta(int numero , int agencia){
        Conta.total++;
        System.out.println("O total de contas é "+ Conta.total);
        this.numero = numero;
        this.agencia = agencia;
        System.out.println("Estou criando uma conta " + this.numero);


    }
    public void deposita(double valor){
        
        this.saldo += valor;
    }
    
    
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        }else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;

    }
    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não é permitido valor negativo!");
            return;
        }

        this.numero = numero;
    }

    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0){
            System.out.println("Não é permitido valor negativo!");
            return;
        }

        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

}
