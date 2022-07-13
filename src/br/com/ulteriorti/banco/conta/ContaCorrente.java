package br.com.ulteriorti.banco.conta;

public class ContaCorrente extends Conta {
    private static int SEQUENCIA = 1;

    public ContaCorrente() {
        super.conta = SEQUENCIA;
        SEQUENCIA++;
        super.saldo = 0d;
        super.tipo = "cc";
    }
}
