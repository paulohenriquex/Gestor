package com.mycompany.gestorcopia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaProduto extends javax.swing.JInternalFrame {

    ArrayList<Produto> produtos;
    GerenciarProduto gerPro;
    int id = 0;

    public TelaProduto(ArrayList<Produto> p, GerenciarProduto gerProduto) {
        super("Gerenciar produto", true, true, true, true);
        produtos = p;
        gerPro = gerProduto;
        initComponents();
        configurarTabela();
        atualizarProdutos();
        setSize(600, 400);
        setLocation(50, 50);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNome = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        tfMedida = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblPreco = new javax.swing.JLabel();
        lblMedida = new javax.swing.JLabel();
        btnInserirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        lblNome.setText("Nome:");

        lblPreco.setText("Preço:");

        lblMedida.setText("Medida:");

        btnInserirProduto.setText("Inserir");
        btnInserirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirProdutoActionPerformed(evt);
            }
        });

        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(tabelaDeProdutos);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMedida)
                                        .addComponent(lblNome)
                                        .addComponent(lblPreco))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnInserirProduto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnAlterar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnExcluir))
                                        .addGroup(layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(tfNome)
                                                .addComponent(tfPreco)
                                                .addComponent(tfMedida, javax.swing.GroupLayout.DEFAULT_SIZE, 172,
                                                        Short.MAX_VALUE)))
                                .addContainerGap(90, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblNome)
                                                                .addGap(42, 42, 42))
                                                        .addComponent(lblPreco))
                                                .addGap(24, 24, 24)
                                                .addComponent(lblMedida))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(tfMedida, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnInserirProduto)
                                        .addComponent(btnAlterar)
                                        .addComponent(btnExcluir))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void atualizarProdutos() {
        DefaultTableModel tabProdutos = (DefaultTableModel) tabelaDeProdutos.getModel();
        tabProdutos.setRowCount(0);

        for (Produto p : gerPro.relatorio()) {
            tabProdutos.insertRow(0, new Object[] { p.getNome(), p.getPreco(), p.getMedida() });
        }
    }

    public void configurarTabela() {
        String[] colunas = { "Nome", "Preço", "Medida" };
        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, colunas));
    }

    private void btnInserirProdutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInserirProdutoActionPerformed
        String log = "";
        String nome = tfNome.getText();
        float preco = 0;

        try {
            preco = Float.parseFloat(tfPreco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Preço inválido. Digite um número válido.");
            return;
        }

        String medida = tfMedida.getText();
        log = gerPro.inserirProduto(id, nome, preco, medida);

        if (log.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso.");
            atualizarProdutos();
            limparCampos();
            id++;
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar produto: " + log);
        }
    }// GEN-LAST:event_btnInserirProdutoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarActionPerformed
        int row = tabelaDeProdutos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para alterar.");
            return;
        }

        Produto produtoSelecionado = gerPro.buscarProduto(row);
        TelaAlterarProduto telaAlterarProduto = new TelaAlterarProduto(produtoSelecionado, gerPro, this);
        this.getParent().add(telaAlterarProduto);
        telaAlterarProduto.toFront();
    }// GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirActionPerformed
        String log = "";
        int row = tabelaDeProdutos.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um produto para alterar.");
            return;
        }

        log = gerPro.excluirProduto(row);
        if (log.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso.");
            atualizarProdutos();
            limparCampos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao alterar produto: " + log);
        }

    }// GEN-LAST:event_btnExcluirActionPerformed

    private void limparCampos() {
        tfNome.setText("");
        tfPreco.setText("");
        tfMedida.setText("");
    }

    public javax.swing.JTable getTabelaDeProdutos() {
        return tabelaDeProdutos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserirProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JTable tabelaDeProdutos;
    private javax.swing.JTextField tfMedida;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
