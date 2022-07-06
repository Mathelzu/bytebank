package bytebankherdado;
//Gerente herda da class Funcionario
public class Gerente extends Funcionario {

    public double getBonificacao() {
        return super.getSalario();
    }
}

