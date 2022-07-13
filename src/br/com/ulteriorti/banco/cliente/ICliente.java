package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;

public interface ICliente {
    void encerrarConta();

    void cadatrarConta();

    void bloquearContas();

    void getDocumento();

    void getNome();

    void detalhesCarteira();
}
