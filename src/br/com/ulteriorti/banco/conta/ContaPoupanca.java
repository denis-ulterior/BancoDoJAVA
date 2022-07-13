package br.com.ulteriorti.banco.conta;

public class ContaPoupanca extends Conta {
    private static int SEQUENCIA = 1;
    private int senha;
    public ContaPoupanca(Double depositoInical) {
        super.conta = SEQUENCIA;
        SEQUENCIA++;
        super.saldo = depositoInical;
        super.tipo = "cp";
    }
    //public ContaPoupanca() {
//        super.conta = SEQUENCIA;
//        SEQUENCIA++;
//        super.saldo = 0.0;
//        super.tipo = "cp";
//    }
//
}
