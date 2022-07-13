package br.com.ulteriorti.banco.cliente;

import br.com.ulteriorti.banco.carteira.Carteira;

public class ClientePF extends Cliente {

    public ClientePF(String nome, String cpf) {
        super(nome);
        super.carteira = new Carteira(this);
        super.documento = cpf;

    }

    @Override
    public void getDocumento() {
        System.out.println(this.documento);
    }

    @Override
    public void getNome() {
        System.out.println(this.nome);
    }

    @Override
    public String toString() {
        return "ClientePF{\n" +
                "clienteAtivo=" + super.clienteAtivo +
                ", documento='" + super.documento + '\'' +
                ", nome='" + this.nome + '\'' +
                //", carteira=" + this.carteira +
                "\n}\n";
    }
}
