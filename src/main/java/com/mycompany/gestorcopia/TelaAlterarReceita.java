package com.mycompany.gestorcopia;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaAlterarReceita extends javax.swing.JInternalFrame {

        private JTable tabelaIngredientes;
        private Receita receitaSelecionada;
        private ArrayList<Produto> produtos;
        private ArrayList<Receita> receitas;
        private DefaultTableModel modeloTabela;
        private TelaReceita telaReceita;
        private GerenciarReceita gerRec;

        public TelaAlterarReceita(Receita receita, ArrayList<Produto> produtos, ArrayList<Receita> r,
                        DefaultTableModel modelo, int linhaSelecionada, TelaReceita telaReceita,
                        GerenciarReceita gerRec) {
                super("Alterar Receita", true, true, true, true);
                this.receitaSelecionada = receita;
                this.produtos = produtos;
                this.receitas = r;
                this.modeloTabela = modelo;
                this.telaReceita = telaReceita;
                this.gerRec = gerRec;

                initComponents();
                criarTabela();
                preencherCampos(linhaSelecionada);
                pack();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                tfPercapta = new javax.swing.JTextField();
                cbIngredientes = new javax.swing.JComboBox<>();
                lblPercapta = new javax.swing.JLabel();
                lblIngredientes = new javax.swing.JLabel();
                btnSalvar = new javax.swing.JButton();
                btnCancelar = new javax.swing.JButton();
                lblNome = new javax.swing.JLabel();
                tfNome = new javax.swing.JTextField();
                lblModoDePreparo = new javax.swing.JLabel();
                tfModoDePreparo = new javax.swing.JTextField();

                cbIngredientes.setModel(
                                new javax.swing.DefaultComboBoxModel<>(
                                                new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                lblPercapta.setText("Per capta:");

                lblIngredientes.setText("Ingredientes:");

                btnSalvar.setText("Salvar");
                btnSalvar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSalvarActionPerformed(evt);
                        }
                });

                btnCancelar.setText("Cancelar");

                lblNome.setText("Nome da receita:");

                lblModoDePreparo.setText("Modo de preparo:");

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
                                                                                                                .addComponent(lblPercapta)
                                                                                                                .addComponent(lblIngredientes))
                                                                                                .addGap(47, 47, 47)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(btnSalvar)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(btnCancelar))
                                                                                                                .addComponent(cbIngredientes,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                135,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(tfPercapta,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                135,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                false)
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(lblModoDePreparo)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(tfModoDePreparo))
                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                layout.createSequentialGroup()
                                                                                                                                .addComponent(lblNome)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(tfNome,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                137,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(92, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(lblNome,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(tfNome,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblModoDePreparo)
                                                                                .addComponent(tfModoDePreparo,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                19,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(lblPercapta)
                                                                                .addComponent(tfPercapta,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(lblIngredientes)
                                                                                .addComponent(cbIngredientes,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(38, 38, 38)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btnSalvar)
                                                                                .addComponent(btnCancelar))
                                                                .addGap(55, 55, 55)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void preencherCampos(int linhaSelecionada) {
                tfNome.setText(receitaSelecionada.getNome());
                tfModoDePreparo.setText(receitaSelecionada.getModoDePreparo());
                carregarIngredientes();
                atualizarTabelaIngredientes();

                if (modeloTabela.getRowCount() > 0 && linhaSelecionada >= 0
                                && linhaSelecionada < modeloTabela.getRowCount()) {
                        String nomeIngrediente = modeloTabela.getValueAt(linhaSelecionada, 0).toString();

                        for (Ingrediente ingrediente : receitaSelecionada.getIngredientes()) {
                                if (ingrediente.getProduto().getNome().equals(nomeIngrediente)) {
                                        tfPercapta.setText(String.valueOf(ingrediente.getPercapta()));
                                        cbIngredientes.setSelectedItem(ingrediente.getProduto().getNome());
                                        break;
                                }
                        }
                } else {
                        JOptionPane.showMessageDialog(this, "Selecione um ingrediente válido!", "Erro",
                                        JOptionPane.WARNING_MESSAGE);
                }
        }

        private void criarTabela() {
                modeloTabela = new DefaultTableModel(new Object[][] {},
                                new String[] { "Nome do Ingrediente", "Percapta", "Custo" }) {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };

                tabelaIngredientes = new JTable(modeloTabela);

                JScrollPane scrollPane = new JScrollPane(tabelaIngredientes);

                getContentPane().add(scrollPane);
        }

        private void carregarIngredientes() {
                cbIngredientes.removeAllItems();
                for (Produto produto : produtos) {
                        cbIngredientes.addItem(produto.getNome());
                }
        }

        private void atualizarTabelaIngredientes() {
                modeloTabela.setRowCount(0);

                for (Ingrediente ingrediente : receitaSelecionada.getIngredientes()) {
                        float custoIngrediente = ingrediente.getProduto().getPreco()
                                        * (ingrediente.getPercapta() / 1000);

                        modeloTabela.addRow(new Object[] {
                                        ingrediente.getProduto().getNome(),
                                        ingrediente.getPercapta(),
                                        custoIngrediente
                        });
                }
        }

        private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSalvarActionPerformed
                String novoNome = tfNome.getText().trim();
                String novoModoDePreparo = tfModoDePreparo.getText().trim();

                if (novoNome.isEmpty() || novoModoDePreparo.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Nome e Modo de Preparo são obrigatórios!", "Erro",
                                        JOptionPane.WARNING_MESSAGE);
                        return;
                }
                ArrayList<Ingrediente> novosIngredientes = new ArrayList<>();
                for (Ingrediente ingrediente : receitaSelecionada.getIngredientes()) {
                        String nomeIngredienteSelecionado = cbIngredientes.getSelectedItem().toString();
                        float novoPercapta;
                        try {
                                novoPercapta = Float.parseFloat(tfPercapta.getText().trim());
                                if (novoPercapta <= 0) {
                                        JOptionPane.showMessageDialog(this, "Percapta deve ser maior que zero!", "Erro",
                                                        JOptionPane.WARNING_MESSAGE);
                                        return;
                                }
                        } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(this, "Digite um valor válido para percapta!", "Erro",
                                                JOptionPane.WARNING_MESSAGE);
                                return;
                        }
                        if (ingrediente.getProduto().getNome().equals(nomeIngredienteSelecionado)) {
                                ingrediente.setPercapta(novoPercapta);
                        }
                        novosIngredientes.add(ingrediente);
                }

                gerRec.alterarReceita(receitaSelecionada, novoNome, novoModoDePreparo, novosIngredientes);

                atualizarTabelaIngredientes();
                telaReceita.atualizarTabelaReceitas();
                JOptionPane.showMessageDialog(this, "Receita alterada com sucesso!");
                dispose();
        }// GEN-LAST:event_btnSalvarActionPerformed

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCancelar;
        private javax.swing.JButton btnSalvar;
        private javax.swing.JComboBox<String> cbIngredientes;
        private javax.swing.JLabel lblIngredientes;
        private javax.swing.JLabel lblModoDePreparo;
        private javax.swing.JLabel lblNome;
        private javax.swing.JLabel lblPercapta;
        private javax.swing.JTextField tfModoDePreparo;
        private javax.swing.JTextField tfNome;
        private javax.swing.JTextField tfPercapta;
        // End of variables declaration//GEN-END:variables
}
