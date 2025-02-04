package com.mycompany.gestorcopia;

import java.time.LocalDate;

public class Planejamento {
    private int id;
    private LocalDate data;
    private String servico;
    private Receita receita;
    private float custoDoDia;
    private int quantitativo;

    public Planejamento(int id, LocalDate data, String servico, Receita receita, float custoDoDia,
            int quantitativo) {
        this.id = id;
        this.data = data;
        this.servico = servico;
        this.receita = receita;
        this.custoDoDia = custoDoDia;
        this.quantitativo = quantitativo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public float getCustoDoDia() {
        return custoDoDia;
    }

    public void setCustoDoDia(float custoDoDia) {
        this.custoDoDia = custoDoDia;
    }

    public int getQuantitativo() {
        return quantitativo;
    }

    public void setQuantitativo(int quantitativo) {
        this.quantitativo = quantitativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

}
