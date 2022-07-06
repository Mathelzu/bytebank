package bytebankherdado;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Nico Bolas");
        g1.setCpf("333.333.333-22");
        g1.setSalario(5000.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
//        g1.setSenha(2222);
//        boolean autentificou = g1.autentica(2222);
//        System.out.println(autentificou);
        System.out.println(g1.getBonificacao());
    }
}
