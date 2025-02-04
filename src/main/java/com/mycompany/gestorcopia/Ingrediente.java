package com.mycompany.gestorcopia;

public class Ingrediente {
    private Produto produto;
    private float percapta;

    public Ingrediente(Produto produto, float percapta) {
        this.produto = produto;
        this.percapta = percapta;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public float getPercapta() {
        return percapta;
    }

    public void setPercapta(float percapta) {
        this.percapta = percapta;
    }
}
