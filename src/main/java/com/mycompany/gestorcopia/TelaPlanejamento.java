package com.mycompany.gestorcopia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaPlanejamento extends javax.swing.JInternalFrame {
        private ArrayList<Receita> receitas;
        private GerenciarPlanejamento gerPla;
        private int id = 0;
        private JDesktopPane telas;

        public TelaPlanejamento(ArrayList<Receita> r, GerenciarPlanejamento gp) {
                super("Planejamento", true, true, true, true);
                receitas = r;
                gerPla = gp;
                this.telas = telas;
                initComponents();
                criarTabela();
                carregarReceitas();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                lblData = new javax.swing.JLabel();
                lblServico = new javax.swing.JLabel();
                lblReceita = new javax.swing.JLabel();
                lblQuantitativo = new javax.swing.JLabel();
                tfData = new javax.swing.JTextField();
                tfServico = new javax.swing.JTextField();
                cbReceita = new javax.swing.JComboBox<>();
                tfQuantitativo = new javax.swing.JTextField();
                btnSalvarPlanejamento = new javax.swing.JButton();
                btnAlterarPlanejamento = new javax.swing.JButton();
                btnExcluirPlanejamento = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                tablePlanejamento = new javax.swing.JTable();

                lblData.setText("Data:");

                lblServico.setText("Serviço:");

                lblReceita.setText("Receita:");

                lblQuantitativo.setText("Quantitativo:");

                cbReceita.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                btnSalvarPlanejamento.setText("Salvar");
                btnSalvarPlanejamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalvarPlanejamentoActionPerformed(evt);
                        }
                });

                btnAlterarPlanejamento.setText("Alterar");
                btnAlterarPlanejamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAlterarPlanejamentoActionPerformed(evt);
                        }
                });

                btnExcluirPlanejamento.setText("Excluir");
                btnExcluirPlanejamento.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExcluirPlanejamentoActionPerformed(evt);
                        }
                });

                tablePlanejamento.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                jScrollPane1.setViewportView(tablePlanejamento);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                .addComponent(lblReceita)
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(lblData)
                                                                                                                                                .addComponent(lblServico)))
                                                                                                                .addComponent(lblQuantitativo))
                                                                                                .addGap(34, 34, 34)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(btnSalvarPlanejamento)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(btnAlterarPlanejamento)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(btnExcluirPlanejamento))
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(cbReceita,
                                                                                                                                                0,
                                                                                                                                                110,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(tfData)
                                                                                                                                .addComponent(tfServico)
                                                                                                                                .addComponent(tfQuantitativo))))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                381,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(7, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lblData)
                                                                                .addComponent(tfData,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblServico)
                                                                                .addComponent(tfServico,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblReceita)
                                                                                .addComponent(cbReceita,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblQuantitativo)
                                                                                .addComponent(tfQuantitativo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnSalvarPlanejamento)
                                                                                .addComponent(btnAlterarPlanejamento)
                                                                                .addComponent(btnExcluirPlanejamento))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                163,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        protected void atualizarTabela() {
                DefaultTableModel model = (DefaultTableModel) tablePlanejamento.getModel();

                model.setRowCount(0);

                for (Planejamento p : gerPla.getPlanejamentos()) {
                        model.addRow(new Object[] {
                                        p.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                                        p.getServico(),
                                        p.getReceita().getNome(),
                                        p.getQuantitativo(),
                                        p.getCustoDoDia()
                        });
                }
        }

        private void criarTabela() {
                tablePlanejamento.setModel(new DefaultTableModel(
                                new Object[][] {},
                                new String[] {
                                                "Data", "Serviço", "Receita", "Quantitativo", "Custo Total"
                                }));
        }

        private void carregarReceitas() {
                cbReceita.removeAllItems();

                for (Receita r : receitas) {
                        cbReceita.addItem(r.getNome());
                }
        }

        private void btnSalvarPlanejamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarPlanejamentoActionPerformed
                LocalDate data = LocalDate.parse(tfData.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String servico = tfServico.getText();
                String nomeReceitaSelecionada = (String) cbReceita.getSelectedItem();
                Receita receita = null;
                for (Receita r : receitas) {
                        if (r.getNome().equals(nomeReceitaSelecionada)) {
                                receita = r;
                                break;
                        }
                }

                if (receita == null) {
                        JOptionPane.showMessageDialog(this, "Erro: Receita não encontrada.", "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }

                int quantitativo;
                try {
                        quantitativo = Integer.parseInt(tfQuantitativo.getText());
                        if (quantitativo <= 0) {
                                JOptionPane.showMessageDialog(this, "Quantitativo deve ser maior que zero.", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                                return;
                        }
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Quantitativo deve ser um número válido.", "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }

                String log = gerPla.inserirPlanejamento(id, data, servico, receitas.indexOf(receita),
                                receita.getCustoDaReceita() * quantitativo, quantitativo);
                id++;

                if (log.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Planejamento salvo com sucesso!");
                        atualizarTabela();
                } else {
                        JOptionPane.showMessageDialog(this, log, "Erro", JOptionPane.ERROR_MESSAGE);
                }
                atualizarTabela();
        }// GEN-LAST:event_btnSalvarPlanejamentoActionPerformed

        private void btnAlterarPlanejamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarPlanejamentoActionPerformed
                int selectedRow = tablePlanejamento.getSelectedRow();
                if (selectedRow == -1) {
                        JOptionPane.showMessageDialog(this, "Por favor, selecione um planejamento para alterar.",
                                        "Erro",
                                        JOptionPane.WARNING_MESSAGE);
                        return;
                }

                String dataString = (String) tablePlanejamento.getValueAt(selectedRow, 0);
                LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String servico = (String) tablePlanejamento.getValueAt(selectedRow, 1);
                String receitaNome = (String) tablePlanejamento.getValueAt(selectedRow, 2);

                Receita receita = null;
                for (Receita r : receitas) {
                        if (r.getNome().equals(receitaNome)) {
                                receita = r;
                                break;
                        }
                }

                Planejamento planejamentoSelecionado = null;
                for (Planejamento p : gerPla.getPlanejamentos()) {
                        if (p.getData().equals(data) && p.getServico().equals(servico)
                                        && p.getReceita().equals(receita)) {
                                planejamentoSelecionado = p;
                                break;
                        }
                }

                if (planejamentoSelecionado == null) {
                        JOptionPane.showMessageDialog(this, "Planejamento não encontrado para alteração.", "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                        return;
                }

                TelaAlterarPlanejamento telaAlterar = new TelaAlterarPlanejamento(planejamentoSelecionado, gerPla,
                                this);
                telaAlterar.setVisible(true);
                getParent().add(telaAlterar);
                telaAlterar.toFront();
        }// GEN-LAST:event_btnAlterarPlanejamentoActionPerformed

        private void btnExcluirPlanejamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirPlanejamentoActionPerformed
                try {
                        int selectedRow = tablePlanejamento.getSelectedRow();
                        if (selectedRow == -1) {
                                JOptionPane.showMessageDialog(this,
                                                "Por favor, selecione um planejamento para excluir.", "Erro",
                                                JOptionPane.WARNING_MESSAGE);
                                return;
                        }

                        String dataString = (String) tablePlanejamento.getValueAt(selectedRow, 0);
                        LocalDate data = LocalDate.parse(dataString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        String servico = (String) tablePlanejamento.getValueAt(selectedRow, 1);
                        String receitaNome = (String) tablePlanejamento.getValueAt(selectedRow, 2);

                        Receita receita = null;
                        for (Receita r : receitas) {
                                if (r.getNome().equals(receitaNome)) {
                                        receita = r;
                                        break;
                                }
                        }

                        Planejamento planejamentoSelecionado = null;
                        for (Planejamento p : gerPla.getPlanejamentos()) {
                                if (p.getData().equals(data) && p.getServico().equals(servico)
                                                && p.getReceita().equals(receita)) {
                                        planejamentoSelecionado = p;
                                        break;
                                }
                        }

                        if (planejamentoSelecionado == null) {
                                JOptionPane.showMessageDialog(this, "Planejamento não encontrado para exclusão.",
                                                "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                                return;
                        }

                        String resultado = gerPla.excluirPlanejamento(planejamentoSelecionado);

                        JOptionPane.showMessageDialog(this, resultado);

                        atualizarTabela();

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Erro ao excluir o planejamento: " + e.getMessage(), "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }// GEN-LAST:event_btnExcluirPlanejamentoActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAlterarPlanejamento;
        private javax.swing.JButton btnExcluirPlanejamento;
        private javax.swing.JButton btnSalvarPlanejamento;
        private javax.swing.JComboBox<String> cbReceita;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel lblData;
        private javax.swing.JLabel lblQuantitativo;
        private javax.swing.JLabel lblReceita;
        private javax.swing.JLabel lblServico;
        private javax.swing.JTable tablePlanejamento;
        private javax.swing.JTextField tfData;
        private javax.swing.JTextField tfQuantitativo;
        private javax.swing.JTextField tfServico;
        // End of variables declaration//GEN-END:variables
}
