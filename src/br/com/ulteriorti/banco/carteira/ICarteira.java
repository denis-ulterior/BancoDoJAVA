package br.com.ulteriorti.banco.carteira;

public interface ICarteira {
    void criarContaCorrente(int senha);
    void criarContaPoupanca(int senha, Double depositoInical);
    void gerarCartaoCredito(int senha, Double limite);

}
