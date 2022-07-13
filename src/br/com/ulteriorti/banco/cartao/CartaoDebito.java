package br.com.ulteriorti.banco.cartao;

import br.com.ulteriorti.banco.conta.Conta;

public class CartaoDebito extends Cartao{
    Conta contaDoCartao;
    public CartaoDebito(Conta conta){
        this.contaDoCartao = conta;
    }

    @Override
    public boolean pagarCompra(Double valor) {
        if(this.contaDoCartao.getSaldo() > valor) {
            this.contaDoCartao.sacar(valor);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "\nCartaoDebito{\n" +
                "contaDoCartao=" + contaDoCartao +
                ", numeroDoCartao=" + numeroDoCartao +
                ", codigoSeguranca=" + codigoSeguranca +
                ", bloqueio=" + bloqueio +
                "\n}\n";
    }
}
