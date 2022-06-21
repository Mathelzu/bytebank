package bytebankcomposto;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente matheus = new Cliente();
        matheus.nome = "Matheus Felipe";
        matheus.cpf = "222.222.222-22";
        matheus.Profissao = "Programador";

        Conta contaDoMatheus = new Conta();

        // assossia o cliente com a conta contaDoMatheus
        contaDoMatheus.titular = matheus;

        System.out.println(contaDoMatheus.titular.nome);
        System.out.println(contaDoMatheus.titular);
    }
}
