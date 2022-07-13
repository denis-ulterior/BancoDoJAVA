package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;
import br.com.ulteriorti.banco.conta.Conta;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

 public abstract class Cliente implements ICliente {
    protected boolean clienteAtivo = true;
    protected String documento;
    protected String nome;
    protected Carteira carteira;

    public Cliente(String nome){
        this.nome = nome;
    }
    @Override
    public void encerrarConta() {

    }

     public Carteira getCarteira() {
         return this.carteira;
     }

//     @Override
//    public void cadastrarConta(int senha, Conta conta, Double depositoInical) {
//        if(conta instanceof ContaPoupanca){
//            this.carteira.criarContaPoupanca(senha,depositoInical);
//        }
//    }
     @Override
     public void cadastrarConta(int senha, Conta conta) {
         if(conta instanceof ContaCorrente){
             this.carteira.criarContaCorrente(senha);
         }
         if(conta instanceof ContaPoupanca){
             this.carteira.criarContaPoupanca(senha,conta.getSaldo());
         }
     }

    @Override
    public void bloquearContas() {

    }

     @Override
     public void getDocumento() {

     }

     @Override
     public void getNome() {

     }

     @Override
     public void detalhesCarteira() {
         System.out.println(this.carteira);
     }
    public void depositar(Double valor, Conta conta){
        if(valor > 0) {
            if (conta instanceof ContaCorrente)
                this.carteira.getContaCorrente().depositar(valor);
            if (conta instanceof ContaPoupanca)
                this.carteira.getContaPoupanca().depositar(valor);
        }
    }
 }
