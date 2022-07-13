package br.com.ulteriorti.banco.conta;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIA = 1;
    private int senha;
    public ContaPoupanca(int senha, Double depositoInical) {
        super.conta = SEQUENCIA;
        SEQUENCIA++;
        super.saldo = depositoInical;
        super.tipo = "cp";
        this.senha = senha;
    }
}
