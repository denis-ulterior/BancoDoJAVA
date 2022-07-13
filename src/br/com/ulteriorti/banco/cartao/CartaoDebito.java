package br.com.ulteriorti.banco.cartao;

import br.com.ulteriorti.banco.conta.Conta;

public class CartaoDebito extends Cartao{
    Conta contaDoCartao;
    public CartaoDebito(Conta conta){
        this.contaDoCartao = conta;
    }

    @Override
    public boolean pagarCompra(Double valor) {
        if(this.contaDoCartao.getSaldo() > valor)
            return true;
        return false;
    }
}
