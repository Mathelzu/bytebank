package bytebankencapsulado;

public class Cliente{
    String nome;
    String cpf;
    String Profissao;

    public void setNome( String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setProfissao(String profissao) {
        Profissao = profissao;
    }

    public String getProfissao() {
        return Profissao;
    }
}

