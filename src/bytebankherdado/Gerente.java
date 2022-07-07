package bytebankherdado;
//Gerente herda da class Funcionario
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    public double getBonificacao() {
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha){
            return true;
        }else {
            return false;
        }
    }
}

