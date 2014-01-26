/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ehrickwilliam.gui;

import br.com.ehrickwilliam.bibliotecas.Leitor;
import br.com.ehrickwilliam.bibliotecas.Util;
import br.com.ehrickwilliam.conexao.Data;
import br.com.ehrickwilliam.conexao.HibernateConfiguration;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ehrick
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        initComponents();

        HibernateConfiguration.setBase("bicho");
        HibernateConfiguration.setHost("localhost");
        HibernateConfiguration.setUser("root");
        HibernateConfiguration.setPass("root");
        popularComboBox();
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jFormattedTextFieldInicial = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldFinal = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonGit = new javax.swing.JRadioButton();
        jRadioButtonMysql = new javax.swing.JRadioButton();
        jComboBoxComponente = new javax.swing.JComboBox();
        jRadioButtonNormal = new javax.swing.JRadioButton();
        jRadioButtonDecaimento = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSalvar = new javax.swing.JMenu();
        jMenuCriarBase = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Minerador de Dados");
        setMaximumSize(new java.awt.Dimension(655, 265));
        setMinimumSize(new java.awt.Dimension(655, 265));
        setPreferredSize(new java.awt.Dimension(655, 265));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("Data Inicíal (não informar utilizara a data da 1º interação) :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        try {
            jFormattedTextFieldInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jFormattedTextFieldInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Data Final (não informar utilizara a data da ultima interação):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        try {
            jFormattedTextFieldFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldFinal.setText("31/12/2012");
        getContentPane().add(jFormattedTextFieldFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 280, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("Informe o nome do componente:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 10));

        buttonGroup1.add(jRadioButtonGit);
        jRadioButtonGit.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButtonGit.setText("GitHub");
        jRadioButtonGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGitActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonGit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        buttonGroup1.add(jRadioButtonMysql);
        jRadioButtonMysql.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButtonMysql.setText("Mysql");
        jRadioButtonMysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMysqlActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButtonMysql, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jComboBoxComponente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxComponente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 260, -1));

        buttonGroup2.add(jRadioButtonNormal);
        jRadioButtonNormal.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButtonNormal.setSelected(true);
        jRadioButtonNormal.setText("Modo Normal");
        getContentPane().add(jRadioButtonNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        buttonGroup2.add(jRadioButtonDecaimento);
        jRadioButtonDecaimento.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jRadioButtonDecaimento.setText("Modo Decaimento");
        getContentPane().add(jRadioButtonDecaimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jMenuBar1.setMinimumSize(new java.awt.Dimension(56, 31));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(396, 31));

        jMenuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ehrickwilliam/icon/006.png"))); // NOI18N
        jMenuSalvar.setText("Iniciar");
        jMenuSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalvarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalvar);

        jMenuCriarBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ehrickwilliam/icon/008.png"))); // NOI18N
        jMenuCriarBase.setText("Criar Base De Dados");
        jMenuCriarBase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCriarBaseMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuCriarBase);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ehrickwilliam/icon/136.png"))); // NOI18N
        jMenu1.setText("Importar Usuários");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ehrickwilliam/icon/026.png"))); // NOI18N
        jMenu2.setText("Importar Issues");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ehrickwilliam/icon/042.png"))); // NOI18N
        jMenu3.setText("Importar Comments");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalvarMouseClicked
        if (jComboBoxComponente.getSelectedIndex() != -1) {
            Data.hash.put("componente", jComboBoxComponente.getSelectedItem());
            Data.hash.put("dataFinal", jFormattedTextFieldFinal.getText());
            Data.hash.put("dataInicial", jFormattedTextFieldInicial.getText());
            if (jRadioButtonNormal.isSelected()) {
                Data.hash.put("modo", 0);
            } else {
                Data.hash.put("modo", 1);
            }

            if (jRadioButtonGit.isSelected()) {
                Data.hash.put("local", 0);
            } else {
                Data.hash.put("local", 1);
            }
            Util.abrirDialogCentralizado(new JDialogLoading(this, true));
        } else {
            JOptionPane.showMessageDialog(this, "O campo Componente ou Usuário \nprecisa ser preenchido!");
        }
    }//GEN-LAST:event_jMenuSalvarMouseClicked

    private void jRadioButtonGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGitActionPerformed
        // TODO add your handling code here:
        jLabel2.setText("Informe o caminho do artefato:");
    }//GEN-LAST:event_jRadioButtonGitActionPerformed

    private void jRadioButtonMysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMysqlActionPerformed
        // TODO add your handling code here:
        jLabel2.setText("Informe o nome do componente:");
    }//GEN-LAST:event_jRadioButtonMysqlActionPerformed

    private void jMenuCriarBaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCriarBaseMouseClicked
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogCriacaoBase(this, rootPaneCheckingEnabled));
    }//GEN-LAST:event_jMenuCriarBaseMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogImportantoUsuarios(this, rootPaneCheckingEnabled));
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogImportantoIssues(this, rootPaneCheckingEnabled));
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        Util.abrirDialogCentralizado(new JDialogImportantoComments(this, rootPaneCheckingEnabled));
    }//GEN-LAST:event_jMenu3MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox jComboBoxComponente;
    private javax.swing.JFormattedTextField jFormattedTextFieldFinal;
    private javax.swing.JFormattedTextField jFormattedTextFieldInicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCriarBase;
    private javax.swing.JMenu jMenuSalvar;
    private javax.swing.JRadioButton jRadioButtonDecaimento;
    private javax.swing.JRadioButton jRadioButtonGit;
    private javax.swing.JRadioButton jRadioButtonMysql;
    private javax.swing.JRadioButton jRadioButtonNormal;
    // End of variables declaration//GEN-END:variables

    private void popularComboBox() {

        String consulta = "SELECT DISTINCT component FROM issues_ext_bugzilla ORDER BY component ASC";
        try {
            ResultSet componentes = new Leitor().retornoConsultas(consulta);
            jComboBoxComponente.removeAllItems();
            while (componentes.next()) {
                jComboBoxComponente.addItem(componentes.getString("component"));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}
