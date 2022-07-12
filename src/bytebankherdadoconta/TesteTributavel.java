package bytebankherdadoconta;

public class TesteTributavel {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.Regista(cc);
        calc.Regista(seguro);
        System.out.println(calc.getTotalImposto());
    }

}
