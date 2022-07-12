package br.com.ulteriorti.banco.conta;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIA = 1;

    public ContaPoupanca(int depositoInicial) {
        super.conta = SEQUENCIA;
        SEQUENCIA++;
        super.saldo = depositoInicial;
        super.tipo = "cp";
    }
}
