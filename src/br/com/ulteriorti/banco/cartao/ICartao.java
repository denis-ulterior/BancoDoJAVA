package br.com.ulteriorti.banco.cartao;

public interface ICartao {
    boolean pagarCompra(Double valor);

    void bloquear(int senha);


}
