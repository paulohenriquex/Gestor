package com.mycompany.gestorcopia;

public class Produto {
    private int id;
    private String nome;
    private float preco;
    private String medida;

    public Produto(int id, String nome, float preco, String medida) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.medida = medida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
