package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.conta.Conta;

public interface ICliente {
    void encerrarConta();

    //void cadastrarConta(int senha, Conta conta, Double depositoInicial);

    void cadastrarConta(int senha, Conta conta);

    void bloquearContas();

    void getDocumento();

    void getNome();

    void detalhesCarteira();
}
