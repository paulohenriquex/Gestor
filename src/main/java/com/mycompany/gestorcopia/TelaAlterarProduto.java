package com.mycompany.gestorcopia;

import javax.swing.JOptionPane;

public class TelaAlterarProduto extends javax.swing.JInternalFrame {
        private Produto produtoSelecionado;
        private GerenciarProduto gerPro;
        private TelaProduto telaProduto;

        public TelaAlterarProduto(Produto produto, GerenciarProduto gerPro, TelaProduto telaProduto) {
                super("Alterar Produto", true, true, true, true);
                this.produtoSelecionado = produto;
                this.gerPro = gerPro;
                this.telaProduto = telaProduto;
                initComponents();
                preencherCampos();
                setSize(400, 300);
                setLocation(100, 100);
                setVisible(true);
        }

        private void preencherCampos() {
                tfNome.setText(produtoSelecionado.getNome());
                tfPreco.setText(String.valueOf(produtoSelecionado.getPreco()));
                tfMedida.setText(produtoSelecionado.getMedida());
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tfNome = new javax.swing.JTextField();
                tfPreco = new javax.swing.JTextField();
                tfMedida = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                btnSalvar = new javax.swing.JButton();
                btnCancelar = new javax.swing.JButton();

                jLabel1.setText("Nome:");

                jLabel2.setText("Preço:");

                jLabel3.setText("Medida:");

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
                                                                                .addComponent(jLabel1)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3))
                                                                .addGap(44, 44, 44)
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
                                                                                                .addComponent(tfMedida,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                120,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(tfPreco,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(tfNome,
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)))
                                                                .addContainerGap(127, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(20, 20, 20)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel1)
                                                                                                                .addComponent(tfNome,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(tfPreco,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jLabel2))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(tfMedida,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnSalvar)
                                                                                .addComponent(btnCancelar))
                                                                .addContainerGap(104, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
                String nome = tfNome.getText();
                float preco = 0;

                try {
                        preco = Float.parseFloat(tfPreco.getText());
                } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Preço inválido, digite um número válido.");
                        return;
                }

                String medida = tfMedida.getText();
                int row = telaProduto.getTabelaDeProdutos().getSelectedRow();

                if (row == -1) {
                        JOptionPane.showMessageDialog(this, "Erro ao alterar produto: Nenhum produto selecionado.");
                        return;
                }

                String log = gerPro.alterarProduto(row, produtoSelecionado.getId(), nome, preco, medida);

                if (log.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Produto alterado com sucesso.");
                        telaProduto.atualizarProdutos();
                        dispose();
                } else {
                        JOptionPane.showMessageDialog(this, "Erro ao alterar produto: " + log);
                }

        }// GEN-LAST:event_btnSalvarActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelar;
        private javax.swing.JButton btnSalvar;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JTextField tfMedida;
        private javax.swing.JTextField tfNome;
        private javax.swing.JTextField tfPreco;
        // End of variables declaration//GEN-END:variables
}
