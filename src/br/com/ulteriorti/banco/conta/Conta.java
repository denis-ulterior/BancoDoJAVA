package br.com.ulteriorti.banco.conta;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int conta;
    protected Double saldo;
    protected String tipo;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    protected int senha;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        if (valor > 0 && (this.saldo - valor >= 0))
            this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        if (valor > 0)
            this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor > 0 && this.saldo - valor >= 0) {
            contaDestino.depositar(valor);
            this.saldo -= valor;
        }


    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                ", tipo=" + tipo +
                '}';
    }

    public void imprimirExtrato() {
        System.out.print("#### Extrato de conta ");
        if (this.tipo == "cc") {
            System.out.print("Conta corrente");
        } else {
            System.out.print("Conta poupança");
        }
        System.out.print(" ####");
        System.out.println("");
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println("Conta: " + this.getConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("");

    }
}
