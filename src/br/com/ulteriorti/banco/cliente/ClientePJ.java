package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;

public class ClientePJ extends Cliente{


    public ClientePJ(String nome, String documento) {
        super(nome);
        super.documento = documento;
        super.carteira = new Carteira(this);

    }

    @Override
    public void getDocumento() {
        System.out.println(this.documento);
    }

    @Override
    public void getNome() {
        System.out.println(this.nome);
    }
}
