package br.com.ulteriorti.banco.cartao;

public class CartaoCredito extends Cartao {
    private Double limiteDisponivel;
    private int diaFechamento;
    private Double saldoDevedor;

    public boolean pagarCompra(Double valor) {
        if (valor <= 0) return false;
        if (this.limiteDisponivel > valor) {
            this.saldoDevedor+=valor;
            this.limiteDisponivel-=valor;
            return true;
        } else {
            return false;
        }
    }


}
