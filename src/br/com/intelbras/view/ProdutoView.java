/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.intelbras.view;

import br.com.intelbras.controler.ProdutosControler;
import java.util.HashMap;

/**
 *
 * @author aluno
 */
public class ProdutoView extends javax.swing.JFrame {

    ProdutosControler produtoControler;
    HashMap<String, Object> mapaComponentes;

    /**
     * Creates new form ClienteView
     */
    public ProdutoView() {
        initComponents();

        mapaComponentes = new HashMap<>();
        this.inseriMapa();
        this.produtoControler = new ProdutosControler(mapaComponentes);

        produtoControler.preencherTabela(tbl_listagem);     // busca os elementos do banco e insere na tabela
        produtoControler.estadoBotoes(0);   //modifica estado dos botoes 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel9 = new javax.swing.JPanel();
        tbd_abas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txt_descricao = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        txt_observacao = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        txt_marca = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        txt_valor = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        txt_modelo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_listagem = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btn_cadastrar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_atualizar = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbd_abas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbd_abas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbd_abasMouseClicked(evt);
            }
        });

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Descrição"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Observação"));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_observacao)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_observacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_valor, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_valor)
                .addContainerGap())
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo do Produto"));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(260, Short.MAX_VALUE))
        );

        tbd_abas.addTab("Cadastro", jPanel1);

        tbl_listagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descrição", "Marca", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_listagem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );

        tbd_abas.addTab("Listagem", jPanel2);

        getContentPane().add(tbd_abas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 91, 52));

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 91, 52));

        btn_editar.setText("Editar");
        btn_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 91, 52));

        btn_atualizar.setText("Atualizar");
        btn_atualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_atualizarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_atualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 91, 52));

        btn_finalizar.setText("Finalizar");
        btn_finalizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_finalizarMouseClicked(evt);
            }
        });
        jPanel3.add(btn_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 91, 52));

        btn_excluir.setText("Excluir");
        btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_excluirMouseClicked(evt);
            }
        });
        jPanel3.add(btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 91, 52));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 140, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editarMouseClicked
        if (btn_editar.isEnabled()) {
            produtoControler.edicao(this.tbl_listagem.getSelectedRow());
        }
    }//GEN-LAST:event_btn_editarMouseClicked

    private void btn_excluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_excluirMouseClicked
        if (btn_excluir.isEnabled()) {
            produtoControler.excluir(this.tbl_listagem.getSelectedRow());
        }
    }//GEN-LAST:event_btn_excluirMouseClicked

    private void btn_atualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_atualizarMouseClicked
        if (btn_atualizar.isEnabled()) {
            produtoControler.atualizar(tbl_listagem);
        }
    }//GEN-LAST:event_btn_atualizarMouseClicked

    private void btn_cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelarMouseClicked
        if (btn_cancelar.isEnabled()) {
            produtoControler.cancelar();
        }
    }//GEN-LAST:event_btn_cancelarMouseClicked

    private void btn_finalizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_finalizarMouseClicked
        if (btn_finalizar.isEnabled()) {
            produtoControler.finalizar();
            produtoControler.atualizar(tbl_listagem);
        }
    }//GEN-LAST:event_btn_finalizarMouseClicked

    private void btn_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarMouseClicked
        if (btn_cadastrar.isEnabled()) {
            produtoControler.cadastrar();
            produtoControler.atualizar(tbl_listagem);
        }
    }//GEN-LAST:event_btn_cadastrarMouseClicked

    private void tbd_abasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbd_abasMouseClicked
        produtoControler.verificaAba(this.tbd_abas.getSelectedIndex());
    }//GEN-LAST:event_tbd_abasMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tbd_abas;
    private javax.swing.JTable tbl_listagem;
    private javax.swing.JTextField txt_descricao;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_observacao;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables

    public void inseriMapa() {
        this.mapaComponentes.put("tela", this);
        this.mapaComponentes.put("btn_atualizar", this.btn_atualizar);
        this.mapaComponentes.put("btn_cadastrar", this.btn_cadastrar);
        this.mapaComponentes.put("btn_editar", this.btn_editar);
        this.mapaComponentes.put("btn_excluir", this.btn_excluir);
        this.mapaComponentes.put("btn_finalizar", this.btn_finalizar);
        this.mapaComponentes.put("btn_cancelar", this.btn_cancelar);

        this.mapaComponentes.put("txt_descricao", this.txt_descricao);
        this.mapaComponentes.put("txt_marca", this.txt_marca);
        this.mapaComponentes.put("txt_modelo", this.txt_modelo);
        this.mapaComponentes.put("txt_observacao", this.txt_observacao);
        this.mapaComponentes.put("txt_valor", this.txt_valor);

        this.mapaComponentes.put("tbl_listagem", this.tbl_listagem);
        this.mapaComponentes.put("tbd_abas", this.tbd_abas);
    }
}
