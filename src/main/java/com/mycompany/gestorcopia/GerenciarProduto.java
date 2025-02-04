package com.mycompany.gestorcopia;

import java.util.ArrayList;

public class GerenciarProduto {

    ArrayList<Produto> produtos;

    public GerenciarProduto(ArrayList<Produto> p) {
        produtos = p;
    }

    public String excluirProduto(int row) {
        String log = "";
        if (row < 0 || row >= produtos.size())
            log = "Intervalo inválido.";
        else
            produtos.remove(row);

        return log;
    }

    public String inserirProduto(int id, String nome, float preco, String medida) {
        String log = "";
        if (nome.isEmpty()) {
            return log = "Nome não pode ser vazio.";
        } else if (preco <= 0) {
            return log = "Preço não pode ser vazio";
        } else if (medida.isEmpty()) {
            return log = "Medida não pode estar vazia";
        } else {
            Produto produto = new Produto(id, nome, preco, medida);
            produtos.add(produto);
        }
        return log;
    }

    public String alterarProduto(int row, int id, String nome, float preco, String medida) {
        String log = verificarEntrada(row, id, nome, preco, medida);
        if (log.isEmpty()) {
            if (row >= 0 && row < produtos.size()) {
                Produto p = produtos.get(row);
                p.setId(id);
                p.setNome(nome);
                p.setPreco(preco);
                p.setMedida(medida);
            } else {
                log = "Índice inválido.";
            }
        }
        return log;
    }

    public String verificarEntrada(int row, int id, String nome, float preco, String medida) {
        String log = "";
        if (nome.isEmpty()) {
            return log = "Nome não pode ser vazio.";
        } else if (id < 0) {
            return log = "Id não pode ser vazio";
        } else if (preco <= 0) {
            return log = "Preço não pode ser vazio";
        } else if (medida.isEmpty()) {
            return log = "Medida não pode estar vazia";
        }
        return log;
    }

    public ArrayList<Produto> relatorio() {
        if (produtos != null)
            return produtos;
        return null;
    }

    public Produto buscarProduto(int row) {
        Produto pro = null;
        for (int i = 0; i < produtos.size(); i++) {
            if (i == row) {
                pro = produtos.get(i);
            }
        }

        return pro;
    }
}
