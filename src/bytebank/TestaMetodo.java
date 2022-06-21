package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoMatheus = new Conta();
        contaDoMatheus.saldo = 300;
        contaDoMatheus.deposita(50);
        System.out.println(contaDoMatheus.saldo);
        contaDoMatheus.saca(20);
        System.out.println(contaDoMatheus.saldo);

        Conta contaDoJodecir = new Conta();
        contaDoJodecir.deposita(1000);

        boolean sucessoTranferencia = contaDoJodecir.transfere(300, contaDoMatheus);

        if(sucessoTranferencia){
            System.out.println("Tranferência feita com sucesso!");
        } else{
            System.out.println("Falha na tranferência.");
        }

        System.out.println(contaDoJodecir.saldo);

        System.out.println(contaDoMatheus.saldo);
    }

}
