package br.com.ulteriorti.banco.cartao;

abstract class Cartao implements ICartao {

    protected int numeroDoCartao;
    protected int codigoSeguranca;
    private int senha;
    protected boolean bloqueio;
    @Override
    public void bloquear(int senha) {
        if(this.senha ==  senha)
        this.bloqueio = true;
    }
}
