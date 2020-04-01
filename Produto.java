package servidor;

import java.rmi.RemoteException;

public class Produto {
    public String descricao;
    public double preco;
    public int quantidade;

    public Produto() throws RemoteException {
        System.out.println("A classe prodduto está disponivel remotamente.");
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}

