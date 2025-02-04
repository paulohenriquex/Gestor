package com.mycompany.gestorcopia;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.swing.JDesktopPane;

public class TelaPrincipal extends javax.swing.JFrame {

    private JDesktopPane telas;
    ArrayList<Produto> produtos;
    ArrayList<Receita> receitas;
    ArrayList<Ingrediente> ingredientes;
    ArrayList<Planejamento> planejamentos;
    TelaProduto telaProduto;
    TelaReceita telaReceita;
    TelaPlanejamento telaPlanejamento;
    GerenciarProduto gerPro;
    GerenciarReceita gerRec;
    GerenciarPlanejamento gerPla;

    public TelaPrincipal() {
        produtos = new ArrayList<>();
        receitas = new ArrayList<>();
        planejamentos = new ArrayList<>();
        ingredientes = new ArrayList<>();
        gerPro = new GerenciarProduto(produtos);
        gerRec = new GerenciarReceita(receitas);
        gerPla = new GerenciarPlanejamento(receitas, planejamentos);
        telas = new JDesktopPane();
        initComponents();
        // inserirDados();
        setContentPane(telas);
        setSize(800, 600);
        setLocation(50, 50);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jmProduto = new javax.swing.JMenu();
        jmGerenciarProduto = new javax.swing.JMenuItem();
        jmReceita = new javax.swing.JMenu();
        jmGerenciarReceita = new javax.swing.JMenuItem();
        jmPlanejamento = new javax.swing.JMenu();
        jmGerenciarPlanejamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 255));

        jmProduto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmProduto.setText(" Produto ");
        jmProduto.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jmGerenciarProduto.setText("Gerenciar Produto");
        jmGerenciarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGerenciarProdutoActionPerformed(evt);
            }
        });
        jmProduto.add(jmGerenciarProduto);

        jMenuBar1.add(jmProduto);

        jmReceita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmReceita.setText("Receita");
        jmReceita.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jmGerenciarReceita.setText("Gerenciar receita");
        jmGerenciarReceita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGerenciarReceitaActionPerformed(evt);
            }
        });
        jmReceita.add(jmGerenciarReceita);

        jMenuBar1.add(jmReceita);

        jmPlanejamento.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jmPlanejamento.setText(" Planejamento ");
        jmPlanejamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jmGerenciarPlanejamento.setText("Gerenciar Planejamento");
        jmGerenciarPlanejamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGerenciarPlanejamentoActionPerformed(evt);
            }
        });
        jmPlanejamento.add(jmGerenciarPlanejamento);

        jMenuBar1.add(jmPlanejamento);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 368, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 270, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmGerenciarPlanejamentoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmGerenciarPlanejamentoActionPerformed
        if (telaPlanejamento != null && telaPlanejamento.isVisible()) {
            telaPlanejamento.toFront();
        } else {
            telaPlanejamento = new TelaPlanejamento(receitas, gerPla);
            telas.add(telaPlanejamento);
            telaPlanejamento.setVisible(true);
        }

    }// GEN-LAST:event_jmGerenciarPlanejamentoActionPerformed

    private void jmGerenciarProdutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmGerenciarProdutoActionPerformed
        // Verifica se a telaProduto já está visível
        if (telaProduto != null && telaProduto.isVisible()) {
            telaProduto.toFront();
        } else {
            telaProduto = new TelaProduto(produtos, gerPro);
            telas.add(telaProduto);
            telaProduto.setVisible(true);
        }
    }// GEN-LAST:event_jmGerenciarProdutoActionPerformed

    private void jmGerenciarReceitaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jmGerenciarReceitaActionPerformed
        if (telaReceita != null && telaReceita.isVisible()) {
            telaReceita.toFront();
        } else {
            telaReceita = new TelaReceita(produtos, receitas, gerRec);
            telas.add(telaReceita);
            telaReceita.setVisible(true);
        }
    }// GEN-LAST:event_jmGerenciarReceitaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // public void inserirDados() {
    // produtos.add(new Produto(0, "Farinha de Trigo", 5.50f, "kg"));
    // produtos.add(new Produto(1, "Açúcar", 4.20f, "kg"));
    // produtos.add(new Produto(2, "Leite", 3.80f, "litro"));

    // ingredientes.add(new Ingrediente(produtos.get(0), 0.250f)); // 250g de
    // Farinha de Trigo
    // ingredientes.add(new Ingrediente(produtos.get(1), 0.100f)); // 100g de Açúcar
    // ingredientes.add(new Ingrediente(produtos.get(2), 0.200f)); // 200ml de Leite

    // receitas.add(new Receita(0, "Bolo Simples", "Misturar tudo e assar.",
    // ingredientes, 12.50f));
    // receitas.add(new Receita(1, "Pudim", "Bater no liquidificador e assar em
    // banho-maria.", ingredientes, 15.30f));
    // receitas.add(new Receita(2, "Panqueca", "Misturar, fritar em frigideira e
    // rechear.", ingredientes, 10.80f));

    // planejamentos.add(new Planejamento(0, LocalDate.of(2025, 2, 5), "Café da
    // Manhã", receitas.get(0), 50.00f, 10));
    // planejamentos.add(new Planejamento(1, LocalDate.of(2025, 2, 6), "Sobremesa",
    // receitas.get(1), 60.00f, 15));
    // planejamentos.add(new Planejamento(2, LocalDate.of(2025, 2, 7), "Lanche da
    // Tarde", receitas.get(2), 40.00f, 8));

    // }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmGerenciarPlanejamento;
    private javax.swing.JMenuItem jmGerenciarProduto;
    private javax.swing.JMenuItem jmGerenciarReceita;
    private javax.swing.JMenu jmPlanejamento;
    private javax.swing.JMenu jmProduto;
    private javax.swing.JMenu jmReceita;
    // End of variables declaration//GEN-END:variables
}
