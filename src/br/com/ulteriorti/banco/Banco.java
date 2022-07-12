package br.com.ulteriorti.banco;

import br.com.ulteriorti.banco.conta.Conta;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca(100);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        System.out.println(cc);
        System.out.println(cp);
        cp.transferir(100,cc);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
