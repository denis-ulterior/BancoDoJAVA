package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

 abstract class Cliente implements ICliente {
    boolean clienteAtivo = true;
    String documento;
    String nome;
    Carteira carteira;

    public Cliente(String nome){
        this.nome = nome;
    }
    @Override
    public void encerrarConta() {

    }

    @Override
    public void cadatrarConta() {

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
         System.out.println(carteira);
     }

 }
