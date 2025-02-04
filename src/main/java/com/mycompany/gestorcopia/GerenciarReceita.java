package com.mycompany.gestorcopia;

import java.util.ArrayList;

public class GerenciarReceita {
    private ArrayList<Receita> receitas = new ArrayList<>();
    private int id = 1;

    public GerenciarReceita(ArrayList<Receita> r) {
        receitas = r;
    }

    public Receita inserirReceita(String nome, String modoDePreparo, ArrayList<Ingrediente> ingredientes) {
        for (Receita r : receitas) {
            if (r.getNome().equalsIgnoreCase(nome)) {
                r.getIngredientes().addAll(ingredientes);
                r.setCustoDaReceita(calcularCusto(r.getIngredientes()));
                return r;
            }
        }

        Receita novaReceita = new Receita(id++, nome, modoDePreparo, ingredientes, calcularCusto(ingredientes));
        receitas.add(novaReceita);
        return novaReceita;
    }

    public void excluirReceita(int idReceita) {
        for (int i = 0; i < receitas.size(); i++) {
            if (receitas.get(i).getId() == idReceita) {
                receitas.remove(i);
                break;
            }
        }
    }

    public ArrayList<Receita> relatorio() {
        return receitas;
    }

    private float calcularCusto(ArrayList<Ingrediente> ingredientes) {
        float total = 0;
        for (Ingrediente ing : ingredientes) {
            total += ing.getProduto().getPreco() * (ing.getPercapta() / 1000);
        }
        return total;
    }

    public void alterarReceita(Receita receita, String novoNome, String novoModoDePreparo,
            ArrayList<Ingrediente> novosIngredientes) {
        receita.setNome(novoNome);
        receita.setModoDePreparo(novoModoDePreparo);
        receita.setIngredientes(novosIngredientes);
        receita.setCustoDaReceita(calcularCusto(novosIngredientes));
    }
}