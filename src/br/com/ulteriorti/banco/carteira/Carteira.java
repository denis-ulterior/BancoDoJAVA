package br.com.ulteriorti.banco.carteira;

import br.com.ulteriorti.banco.cliente.ClientePF;
import br.com.ulteriorti.banco.cliente.ClientePJ;
import br.com.ulteriorti.banco.cliente.ICliente;

public class Carteira {
    protected static int contadorCarteiras = 1;
    ICliente cliente;
    int idCarteiraCliente;



    Carteira(ClientePJ cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }

    Carteira(ClientePF cliente) {
        this.cliente = cliente;
        this.idCarteiraCliente = contadorCarteiras;
        contadorCarteiras++;
    }
}
