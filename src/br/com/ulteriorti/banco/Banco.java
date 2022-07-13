package br.com.ulteriorti.banco;

import br.com.ulteriorti.banco.cliente.ClientePF;
import br.com.ulteriorti.banco.conta.Conta;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

public class Banco {
    public static void main(String[] args) {
//        Conta cc = new ContaCorrente();
//        Conta cp = new ContaPoupanca(100);
//
//        System.out.println(cc.getSaldo());
//        System.out.println(cp.getSaldo());
//
//        System.out.println(cc);
//        System.out.println(cp);
//        cp.transferir(100,cc);
//        cc.imprimirExtrato();
//        cp.imprimirExtrato();
//
        ClientePF cliente1 = new ClientePF("Denis", "000.000.000-00");
        cliente1.cadastrarConta(1234, new ContaCorrente());
        cliente1.cadastrarConta(132,new ContaPoupanca(300.00));
        Conta contaADepositar = cliente1.getCarteira().getContaCorrente();
        cliente1.depositar(100.00,contaADepositar);
        contaADepositar = cliente1.getCarteira().getContaPoupanca();
        cliente1.depositar(500.00,contaADepositar);

        cliente1.detalhesCarteira();

        cliente1.getCarteira().getCartaoDebitoCC().pagarCompra(80.00);

        cliente1.detalhesCarteira();



        //implementar classes
    }

}
