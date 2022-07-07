package bytebankherdado;

public class TestaSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(3333);

        Cliente cl = new Cliente();
        cl.setSenha(4444);

        SistemaIterno si = new SistemaIterno();
        si.autentica(g);
        si.autentica(adm);
        si.autentica(cl);

    }
}
