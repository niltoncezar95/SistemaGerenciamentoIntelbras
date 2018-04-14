/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.intelbras.view;

import br.com.intelbras.controler.InicioControler;

/**
 *
 * @author aluno
 */
public class InicioView extends javax.swing.JFrame {

    InicioControler inicioControler;

    /**
     * Creates new form InicioView
     */
    public InicioView() {
        initComponents();
        this.inicioControler = new InicioControler();

        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_cliente = new javax.swing.JButton();
        btn_funcionario = new javax.swing.JButton();
        btn_pontos = new javax.swing.JButton();
        btn_vendas = new javax.swing.JButton();
        btn_produto = new javax.swing.JButton();
        lbl_fundo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        mnu_cliente = new javax.swing.JMenu();
        mnu_funcionario = new javax.swing.JMenu();
        mnu_vendas = new javax.swing.JMenu();
        mnu_pontos = new javax.swing.JMenu();
        mnu_produto = new javax.swing.JMenu();
        mnu_login = new javax.swing.JMenu();
        mnu_alterarFundo = new javax.swing.JMenu();
        mnu_sair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_login.setText("Login");
        btn_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_loginMouseDragged(evt);
            }
        });
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 110, 70));

        btn_cliente.setText("Cliente");
        btn_cliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_clienteMouseDragged(evt);
            }
        });
        btn_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clienteMouseClicked(evt);
            }
        });
        btn_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 70));

        btn_funcionario.setText("Funcionário");
        btn_funcionario.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_funcionarioMouseDragged(evt);
            }
        });
        btn_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_funcionarioMouseClicked(evt);
            }
        });
        btn_funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funcionarioActionPerformed(evt);
            }
        });
        jPanel1.add(btn_funcionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 110, 70));

        btn_pontos.setText("Pontos");
        btn_pontos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_pontosMouseDragged(evt);
            }
        });
        btn_pontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pontosMouseClicked(evt);
            }
        });
        jPanel1.add(btn_pontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, 70));

        btn_vendas.setText("Vendas");
        btn_vendas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_vendasMouseDragged(evt);
            }
        });
        btn_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_vendasMouseClicked(evt);
            }
        });
        jPanel1.add(btn_vendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 110, 70));

        btn_produto.setText("Produto");
        btn_produto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_produtoMouseDragged(evt);
            }
        });
        btn_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_produtoMouseClicked(evt);
            }
        });
        jPanel1.add(btn_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 110, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 420));
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 420));

        mnu_cliente.setText("Cliente");
        mnu_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_clienteMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_cliente);

        mnu_funcionario.setText("Funcionário");
        mnu_funcionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_funcionarioMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_funcionario);

        mnu_vendas.setText("Vendas");
        mnu_vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_vendasMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_vendas);

        mnu_pontos.setText("Pontos");
        mnu_pontos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_pontosMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_pontos);

        mnu_produto.setText("Produto");
        mnu_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_produtoMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_produto);

        mnu_login.setText("Login");
        mnu_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_loginMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_login);

        mnu_alterarFundo.setText("Plano de Fundo");
        mnu_alterarFundo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_alterarFundoMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_alterarFundo);

        mnu_sair.setText("Sair");
        mnu_sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnu_sairMouseClicked(evt);
            }
        });
        jMenuBar2.add(mnu_sair);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clienteActionPerformed

    private void btn_funcionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funcionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_funcionarioActionPerformed

    private void btn_clienteMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clienteMouseDragged
        inicioControler.arrastarBotao(this.btn_cliente, evt);
    }//GEN-LAST:event_btn_clienteMouseDragged

    private void btn_funcionarioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funcionarioMouseDragged
        inicioControler.arrastarBotao(this.btn_funcionario, evt);    }//GEN-LAST:event_btn_funcionarioMouseDragged

    private void btn_vendasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendasMouseDragged
        inicioControler.arrastarBotao(this.btn_vendas, evt);    }//GEN-LAST:event_btn_vendasMouseDragged

    private void btn_pontosMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pontosMouseDragged
        inicioControler.arrastarBotao(this.btn_pontos, evt);
    }//GEN-LAST:event_btn_pontosMouseDragged

    private void btn_produtoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtoMouseDragged
        inicioControler.arrastarBotao(this.btn_produto, evt);
    }//GEN-LAST:event_btn_produtoMouseDragged

    private void btn_loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseDragged
        inicioControler.arrastarBotao(this.btn_login, evt);
    }//GEN-LAST:event_btn_loginMouseDragged

    private void mnu_alterarFundoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_alterarFundoMouseClicked
        inicioControler.mudarPlanoFundo(lbl_fundo);
    }//GEN-LAST:event_mnu_alterarFundoMouseClicked

    private void mnu_sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_sairMouseClicked
        inicioControler.logout(this);
    }//GEN-LAST:event_mnu_sairMouseClicked

    private void btn_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clienteMouseClicked
        inicioControler.abrirCliente(this);
    }//GEN-LAST:event_btn_clienteMouseClicked

    private void btn_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_funcionarioMouseClicked
        inicioControler.abrirFuncionario(this);
    }//GEN-LAST:event_btn_funcionarioMouseClicked

    private void btn_vendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_vendasMouseClicked
        inicioControler.abrirVenda(this);
    }//GEN-LAST:event_btn_vendasMouseClicked

    private void btn_pontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pontosMouseClicked
        inicioControler.abrirPonto(this);
    }//GEN-LAST:event_btn_pontosMouseClicked

    private void btn_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_produtoMouseClicked
        inicioControler.abrirProduto(this);
    }//GEN-LAST:event_btn_produtoMouseClicked

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        inicioControler.abrirLogin(this);
    }//GEN-LAST:event_btn_loginMouseClicked

    private void mnu_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_clienteMouseClicked
        inicioControler.abrirCliente(this);
    }//GEN-LAST:event_mnu_clienteMouseClicked

    private void mnu_funcionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_funcionarioMouseClicked
        inicioControler.abrirFuncionario(this);
    }//GEN-LAST:event_mnu_funcionarioMouseClicked

    private void mnu_vendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_vendasMouseClicked
        inicioControler.abrirVenda(this);
    }//GEN-LAST:event_mnu_vendasMouseClicked

    private void mnu_pontosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_pontosMouseClicked
        inicioControler.abrirPonto(this);
    }//GEN-LAST:event_mnu_pontosMouseClicked

    private void mnu_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_produtoMouseClicked
        inicioControler.abrirProduto(this);
    }//GEN-LAST:event_mnu_produtoMouseClicked

    private void mnu_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnu_loginMouseClicked
        inicioControler.abrirLogin(this);
    }//GEN-LAST:event_mnu_loginMouseClicked

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
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cliente;
    private javax.swing.JButton btn_funcionario;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_pontos;
    private javax.swing.JButton btn_produto;
    private javax.swing.JButton btn_vendas;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JMenu mnu_alterarFundo;
    private javax.swing.JMenu mnu_cliente;
    private javax.swing.JMenu mnu_funcionario;
    private javax.swing.JMenu mnu_login;
    private javax.swing.JMenu mnu_pontos;
    private javax.swing.JMenu mnu_produto;
    private javax.swing.JMenu mnu_sair;
    private javax.swing.JMenu mnu_vendas;
    // End of variables declaration//GEN-END:variables
}
