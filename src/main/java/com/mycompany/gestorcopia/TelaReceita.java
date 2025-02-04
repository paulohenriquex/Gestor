package com.mycompany.gestorcopia;

import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class TelaReceita extends javax.swing.JInternalFrame {
    private ArrayList<Produto> produtos;
    private GerenciarReceita gerRec;
    private ArrayList<Ingrediente> ingredientesTemp = new ArrayList<>();
    private DefaultTableModel modeloTabela;

    public TelaReceita(ArrayList<Produto> p, ArrayList<Receita> r, GerenciarReceita gerReceita) {
        super("Cadastrar Receita", true, true, true, true);
        produtos = p;
        gerRec = gerReceita;
        ingredientesTemp = new ArrayList<>();
        initComponents();
        criarTabela();
        carregarIngredientes();
        carregarReceitasNaTabela();
        setSize(600, 400);
        setLocation(50, 50);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfNome = new javax.swing.JTextField();
        tfModoDePreparo = new javax.swing.JTextField();
        cbIngrediente = new javax.swing.JComboBox<>();
        lblNome = new javax.swing.JLabel();
        lblModoDePreparo = new javax.swing.JLabel();
        tabelaReceitas = new javax.swing.JScrollPane();
        tabelaReceitas1 = new javax.swing.JTable();
        btnInserirReceita = new javax.swing.JButton();
        btnAlterarReceita = new javax.swing.JButton();
        btnExcluirReceita = new javax.swing.JButton();
        btnAdicionarIngrediente = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        lblNome.setText("Nome:");

        lblModoDePreparo.setText("Modo de preparo:");

        tabelaReceitas1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        tabelaReceitas.setViewportView(tabelaReceitas1);

        btnInserirReceita.setText("Salvar");
        btnInserirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirReceitaActionPerformed(evt);
            }
        });

        btnAlterarReceita.setText("Alterar");
        btnAlterarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarReceitaActionPerformed(evt);
            }
        });

        btnExcluirReceita.setText("Excluir");
        btnExcluirReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirReceitaActionPerformed(evt);
            }
        });

        btnAdicionarIngrediente.setText("Adicionar");
        btnAdicionarIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarIngredienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tabelaReceitas, javax.swing.GroupLayout.DEFAULT_SIZE, 477,
                                                Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblNome)
                                                                        .addComponent(lblModoDePreparo)
                                                                        .addComponent(btnAdicionarIngrediente))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(tfNome)
                                                                        .addComponent(tfModoDePreparo)
                                                                        .addComponent(cbIngrediente, 0, 147,
                                                                                Short.MAX_VALUE)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnInserirReceita)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnAlterarReceita)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(btnExcluirReceita)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNome)
                                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblModoDePreparo)
                                        .addComponent(tfModoDePreparo, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbIngrediente, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAdicionarIngrediente))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnInserirReceita)
                                        .addComponent(btnAlterarReceita)
                                        .addComponent(btnExcluirReceita))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tabelaReceitas, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizarTabelaReceitas() {
        modeloTabela.setRowCount(0);
        for (Receita r : gerRec.relatorio()) {
            inserirReceitaNaTabela(r);
        }
    }

    private void btnAdicionarIngredienteActionPerformed(java.awt.event.ActionEvent evt) {
        if (cbIngrediente.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um ingrediente!", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String percaptaStr = JOptionPane.showInputDialog(this,
                "Digite o percapta (em gramas) para o ingrediente selecionado:");
        if (percaptaStr == null || percaptaStr.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Você precisa informar o percapta!", "Erro",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            float percapta = Float.parseFloat(percaptaStr);
            if (percapta <= 0) {
                JOptionPane.showMessageDialog(this, "Percapta deve ser maior que zero!", "Erro",
                        JOptionPane.WARNING_MESSAGE);
                return;
            }

            Produto produto = produtos.get(cbIngrediente.getSelectedIndex());
            ingredientesTemp.add(new Ingrediente(produto, percapta));
            JOptionPane.showMessageDialog(this, "Ingrediente adicionado!");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Digite um valor válido para percapta!", "Erro",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limparTabela() {
        modeloTabela.setRowCount(0);
    }

    public void carregarReceitasNaTabela() {
        limparTabela();
        for (Receita receita : gerRec.relatorio()) {
            inserirReceitaNaTabela(receita);
        }
    }

    public void carregarIngredientes() {
        for (Produto produto : produtos) {
            cbIngrediente.addItem(produto.getNome());
        }
    }

    private void inserirReceitaNaTabela(Receita receita) {
        for (Ingrediente ing : receita.getIngredientes()) {
            modeloTabela.addRow(new Object[] {
                    receita.getId(),
                    receita.getNome(),
                    ing.getProduto().getNome() + " (" + ing.getPercapta() + "g)",
                    String.format("%.2f", ing.getProduto().getPreco() * (ing.getPercapta() / 1000))
            });
        }
    }

    private void btnInserirReceitaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInserirReceitaActionPerformed
        String nome = tfNome.getText().trim();
        String modoDePreparo = tfModoDePreparo.getText().trim();

        if (nome.isEmpty() || modoDePreparo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nome e Modo de Preparo são obrigatórios!", "Erro",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        Receita receita = gerRec.inserirReceita(nome, modoDePreparo, new ArrayList<>(ingredientesTemp));
        if (receita != null) {
            JOptionPane.showMessageDialog(this, "Receita salva com sucesso!");
            atualizarTabela();
            limparCampos();
        }
    }// GEN-LAST:event_btnInserirReceitaActionPerformed

    private void btnAlterarReceitaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAlterarReceitaActionPerformed
        int row = tabelaReceitas1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma receita para alterar!", "Erro",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idReceita = (int) modeloTabela.getValueAt(row, 0);
        Receita receitaSelecionada = null;
        for (Receita r : gerRec.relatorio()) {
            if (r.getId() == idReceita) {
                receitaSelecionada = r;
                break;
            }
        }

        if (receitaSelecionada != null) {
            TelaAlterarReceita telaAlterar = new TelaAlterarReceita(receitaSelecionada, produtos, gerRec.relatorio(),
                    modeloTabela, row, this, gerRec);
            JDesktopPane desktopPane = getDesktopPane();
            desktopPane.add(telaAlterar);
            telaAlterar.setVisible(true);
        }
    }// GEN-LAST:event_btnAlterarReceitaActionPerformed

    private void btnExcluirReceitaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExcluirReceitaActionPerformed
        int row = tabelaReceitas1.getSelectedRow();
        if (row != -1) {
            gerRec.excluirReceita((int) modeloTabela.getValueAt(row, 0));
            JOptionPane.showMessageDialog(this, "Receita excluída com sucesso!");
            atualizarTabela();
        }
    }// GEN-LAST:event_btnExcluirReceitaActionPerformed

    private void atualizarTabela() {
        modeloTabela.setRowCount(0);
        for (Receita r : gerRec.relatorio()) {
            inserirReceitaNaTabela(r);
        }
    }

    public void criarTabela() {
        modeloTabela = new DefaultTableModel(new Object[][] {},
                new String[] { "ID", "Nome da receita", "Ingredientes", "Custo (R$)" }) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelaReceitas1.setModel(modeloTabela);
    }

    private void limparCampos() {
        tfNome.setText("");
        tfModoDePreparo.setText("");
        ingredientesTemp.clear();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarIngrediente;
    private javax.swing.JButton btnAlterarReceita;
    private javax.swing.JButton btnExcluirReceita;
    private javax.swing.JButton btnInserirReceita;
    private javax.swing.JComboBox<String> cbIngrediente;
    private javax.swing.JLabel lblModoDePreparo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JScrollPane tabelaReceitas;
    private javax.swing.JTable tabelaReceitas1;
    private javax.swing.JTextField tfModoDePreparo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
