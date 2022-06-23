package bytebankencapsulado;

public class TestaGetSet {

    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getNumero());

        Cliente matheus = new Cliente();

        matheus.setNome("Matheus Felipe");

        conta.setTitular(matheus);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        // em duas linhas:
        // Cliente contaDaTitular = conta.getTitular();
        //contaDaTitular.setProfissao("Programador");



    }
}



