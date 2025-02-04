package com.mycompany.gestorcopia;

import java.util.ArrayList;

public class Receita {
    private int id;
    private String nome;
    private String modoDePreparo;
    private ArrayList<Ingrediente> ingredientes;
    private float custoDaReceita;

    public Receita(int id, String nome, String modoDePreparo, ArrayList<Ingrediente> ingredientes,
            float custoDaReceita) {
        this.id = id;
        this.nome = nome;
        this.modoDePreparo = modoDePreparo;
        this.ingredientes = ingredientes;
        this.custoDaReceita = custoDaReceita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    public float getCustoDaReceita() {
        return custoDaReceita;
    }

    public void setCustoDaReceita(float custoDaReceita) {
        this.custoDaReceita = custoDaReceita;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
