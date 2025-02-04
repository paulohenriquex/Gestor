package com.mycompany.gestorcopia;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class TelaAlterarPlanejamento extends javax.swing.JInternalFrame {

        private Planejamento planejamento;
        private GerenciarPlanejamento gerPla;
        private TelaPlanejamento telaPlanejamento;

        public TelaAlterarPlanejamento(Planejamento planejamento, GerenciarPlanejamento gerPla,
                        TelaPlanejamento telaPlanejamento) {
                super("Alterar Planejamento", true, true, true, true);
                this.planejamento = planejamento;
                this.gerPla = gerPla;
                this.telaPlanejamento = telaPlanejamento;
                initComponents();
                carregarDadosPlanejamento();
                carregarReceitas();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tfData = new javax.swing.JTextField();
                tfServico = new javax.swing.JTextField();
                tfQuantitativo = new javax.swing.JTextField();
                cbReceitas = new javax.swing.JComboBox<>();
                lblData = new javax.swing.JLabel();
                lblServico = new javax.swing.JLabel();
                lblQuantitativo = new javax.swing.JLabel();
                lblReceitas = new javax.swing.JLabel();
                btnSalvar = new javax.swing.JButton();
                btnCancelar = new javax.swing.JButton();

                cbReceitas.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                lblData.setText("Data:");

                lblServico.setText("Serviço:");

                lblQuantitativo.setText("Quantitativo:");

                lblReceitas.setText("Receitas:");

                btnSalvar.setText("Salvar");
                btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalvarActionPerformed(evt);
                        }
                });

                btnCancelar.setText("Cancelar");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblData)
                                                                                .addComponent(lblServico)
                                                                                .addComponent(lblQuantitativo)
                                                                                .addComponent(lblReceitas))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(btnSalvar)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(btnCancelar))
                                                                                .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addComponent(tfServico)
                                                                                                .addComponent(tfQuantitativo)
                                                                                                .addComponent(tfData)
                                                                                                .addComponent(cbReceitas,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                0,
                                                                                                                162,
                                                                                                                Short.MAX_VALUE)))
                                                                .addGap(0, 109, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lblData)
                                                                                .addComponent(tfData,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lblServico)
                                                                                .addComponent(tfServico,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(6, 6, 6)
                                                                                                .addComponent(lblQuantitativo))
                                                                                .addComponent(tfQuantitativo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblReceitas)
                                                                                .addComponent(cbReceitas,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnSalvar)
                                                                                .addComponent(btnCancelar))
                                                                .addContainerGap(66, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void carregarDadosPlanejamento() {
                tfData.setText(planejamento.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                tfServico.setText(planejamento.getServico());
                cbReceitas.setSelectedItem(planejamento.getReceita().getNome());
                tfQuantitativo.setText(String.valueOf(planejamento.getQuantitativo()));
        }

        private void carregarReceitas() {
                cbReceitas.removeAllItems();
                for (Receita r : gerPla.getReceitas()) {
                        cbReceitas.addItem(r.getNome());
                }
        }

        private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
                try {
                        LocalDate novaData = LocalDate.parse(tfData.getText(),
                                        DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                        String novoServico = tfServico.getText();
                        String nomeReceitaSelecionada = (String) cbReceitas.getSelectedItem();
                        Receita novaReceita = null;
                        for (Receita r : gerPla.getReceitas()) {
                                if (r.getNome().equals(nomeReceitaSelecionada)) {
                                        novaReceita = r;
                                        break;
                                }
                        }
                        if (novaReceita == null) {
                                JOptionPane.showMessageDialog(this, "Erro: Receita não encontrada.", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                                return;
                        }
                        int novoQuantitativo;
                        try {
                                novoQuantitativo = Integer.parseInt(tfQuantitativo.getText());
                                if (novoQuantitativo <= 0) {
                                        JOptionPane.showMessageDialog(this, "Quantitativo deve ser maior que zero.",
                                                        "Erro",
                                                        JOptionPane.ERROR_MESSAGE);
                                        return;
                                }
                        } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Quantitativo deve ser um número válido.", "Erro",
                                                JOptionPane.ERROR_MESSAGE);
                                return;
                        }
                        planejamento.setData(novaData);
                        planejamento.setServico(novoServico);
                        planejamento.setReceita(novaReceita);
                        planejamento.setQuantitativo(novoQuantitativo);
                        planejamento.setCustoDoDia(novaReceita.getCustoDaReceita() * novoQuantitativo);
                        telaPlanejamento.atualizarTabela();
                        JOptionPane.showMessageDialog(this, "Planejamento alterado com sucesso!");
                        this.dispose();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Erro ao alterar planejamento: " + e.getMessage(), "Erro",
                                        JOptionPane.ERROR_MESSAGE);
                }
        }// GEN-LAST:event_btnSalvarActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelar;
        private javax.swing.JButton btnSalvar;
        private javax.swing.JComboBox<String> cbReceitas;
        private javax.swing.JLabel lblData;
        private javax.swing.JLabel lblQuantitativo;
        private javax.swing.JLabel lblReceitas;
        private javax.swing.JLabel lblServico;
        private javax.swing.JTextField tfData;
        private javax.swing.JTextField tfQuantitativo;
        private javax.swing.JTextField tfServico;
        // End of variables declaration//GEN-END:variables
}
