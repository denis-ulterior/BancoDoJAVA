package br.com.ulteriorti.banco.carteira;

import br.com.ulteriorti.banco.cartao.CartaoCredito;
import br.com.ulteriorti.banco.cartao.CartaoDebito;
import br.com.ulteriorti.banco.cliente.Cliente;
import br.com.ulteriorti.banco.cliente.ClientePF;
import br.com.ulteriorti.banco.cliente.ClientePJ;
import br.com.ulteriorti.banco.cliente.ICliente;
import br.com.ulteriorti.banco.conta.ContaCorrente;
import br.com.ulteriorti.banco.conta.ContaPoupanca;

public class Carteira implements ICarteira{
    protected static int contadorCarteiras = 1;
    Cliente cliente;
    protected int idCarteiraCliente;
    protected CartaoCredito cartaoCredito;
    protected CartaoDebito cartaoDebitoCC;
    protected CartaoDebito cartaoDebitoCP;
    protected ContaCorrente contaCorrente;
    protected ContaPoupanca contaPoupanca;

    public Carteira(ClientePJ cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public Carteira(ClientePF cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }


    @Override
    public void criarContaCorrente(int senha) {
    this.contaCorrente = new ContaCorrente();
    this.contaCorrente.setSenha(senha);
    if(cartaoDebitoCC == null)
        this.cartaoDebitoCC = new CartaoDebito(this.contaCorrente);
    }

    @Override
    public void criarContaPoupanca(int senha, Double depositoInical) {
        this.contaPoupanca = new ContaPoupanca(depositoInical);
        this.contaPoupanca.setSenha(senha);
        if(cartaoDebitoCP == null)
            this.cartaoDebitoCP = new CartaoDebito(this.contaCorrente);


    }

    @Override
    public void gerarCartaoCredito(int senha, Double limite) {

    }

    @Override
    public String toString() {
        return "Carteira{\n" +
                "cliente=" + cliente +
                "idCarteiraCliente=" + idCarteiraCliente +
                ", contaCorrente=" + contaCorrente +
                ", contaPoupanca=" + contaPoupanca +
                ", cartaoCredito=" + cartaoCredito +
                ", cartaoDebitoCC=" + cartaoDebitoCC +
                ", cartaoDebitoCP=" + cartaoDebitoCP +

                '}';
    }
}
