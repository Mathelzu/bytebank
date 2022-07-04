package bytebankherdado;

public class ControleBonificacao {
    double soma;

    public void registra (Funcionario f){
        double boni = f.getBonificacao();
        this.soma += boni;
    }

    public double getSoma() {
        return soma;
    }
}