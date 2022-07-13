package br.com.ulteriorti.banco.carteira;

import br.com.ulteriorti.banco.cartao.CartaoCredito;
import br.com.ulteriorti.banco.cartao.CartaoDebito;
import br.com.ulteriorti.banco.cliente.ClientePF;
import br.com.ulteriorti.banco.cliente.ClientePJ;
import br.com.ulteriorti.banco.cliente.ICliente;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

public class Carteira implements ICarteira{
    protected static int contadorCarteiras = 1;
    ICliente cliente;
    int idCarteiraCliente;
    CartaoCredito cartaoCredito;
    CartaoDebito cartaoDebito;
    ContaCorrente contaCorrente;
    ContaPoupanca contaPoupanca;

    public Carteira(ClientePJ cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }

    public Carteira(ClientePF cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }


    @Override
    public void criarContaCorrente(int senha) {
    this.contaCorrente = new ContaCorrente();
    if(cartaoDebito == null)
        this.cartaoDebito = new CartaoDebito(this.contaCorrente);
    }

    @Override
    public void criarContaPoupanca(int senha, Double depositoInical) {
        this.contaPoupanca = new ContaPoupanca(senha, depositoInical);
    }

    @Override
    public void gerarCartaoCredito(int senha, Double limite) {

    }
}
