package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;
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
         System.out.println(this.carteira);
     }

 }
