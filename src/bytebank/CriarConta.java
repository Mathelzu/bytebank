package bytebank;

public class CriarConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        primeiraConta.saldo += 100;

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        segundaConta.agencia = 146;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        System.out.println(segundaConta.agencia);
        System.out.println(segundaConta.numero);

        System.out.println(primeiraConta);
        System.out.println(segundaConta);

    }
}
