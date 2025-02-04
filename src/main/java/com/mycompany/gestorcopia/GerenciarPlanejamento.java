package com.mycompany.gestorcopia;

import java.time.LocalDate;
import java.util.ArrayList;

public class GerenciarPlanejamento {
    private ArrayList<Receita> receitas;
    private ArrayList<Planejamento> planejamentos;

    public GerenciarPlanejamento(ArrayList<Receita> r, ArrayList<Planejamento> p) {
        receitas = r;
        planejamentos = p;
    }

    public String inserirPlanejamento(int id, LocalDate data, String servico, int idReceita, float custoDoDia,
            int quantitativo) {

        String log = "";

        if (idReceita < 0 || idReceita >= receitas.size()) {
            return "Receita não encontrada!";
        } else if (data.isAfter(LocalDate.now())) {
            return "Data inválida!";
        } else if (custoDoDia < 0) {
            return "Custo do dia inválido!";
        } else if (quantitativo <= 0) {
            return "Quantitativo inválido!";
        }

        Planejamento planejamento = new Planejamento(id, data, servico, receitas.get(idReceita),
                custoDoDia, quantitativo);
        planejamentos.add(planejamento);
        return log;
    }

    public ArrayList<Planejamento> getPlanejamentos() {
        return planejamentos;
    }

    public String excluirPlanejamento(Planejamento p) {
        String log = "";
        if (planejamentos.remove(p)) {
            log = "Planejamento excluído com sucesso!";
        } else {
            log = "Erro ao excluir o planejamento.";
        }

        return log;
    }

    public String alterarPlanejamento(int id, LocalDate data, String servico, Receita receita,
            float custoDoDia, int quantitativo) {

        boolean planejamentoEncontrado = false;
        String log = "";

        for (Planejamento p : planejamentos) {
            if (p.getId() == id) {
                planejamentoEncontrado = true;
                p.setData(data);
                p.setServico(servico);
                p.setReceita(receita);
                p.setCustoDoDia(custoDoDia);
                p.setQuantitativo(quantitativo);
                break;
            }
        }

        if (!planejamentoEncontrado) {
            log = "Planejamento não encontrado!";
        }

        return log;
    }

    public Planejamento buscarPlanejamento(int id) {
        for (Planejamento p : planejamentos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Planejamento> relatorio() {
        if (planejamentos != null)
            return planejamentos;
        else
            return null;
    }

    public ArrayList<Receita> getReceitas() {
        return receitas;
    }

    public Receita getReceita(int id) {
        if (id < 0 || id >= receitas.size()) {
            return null;
        }
        return receitas.get(id);
    }

}
