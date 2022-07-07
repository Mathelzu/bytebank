package bytebankherdado;
//contrato Sutenticavel
    //quem assinar precissa implemantar
        // metodo setSenha
        //metodo autentica
public abstract interface Autenticavel {
    public abstract void setSenha(int senha);
    public abstract boolean autentica(int senha);

}
