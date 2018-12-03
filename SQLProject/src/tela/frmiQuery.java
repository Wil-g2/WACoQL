/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tela;

import conexoes.ConexaoSQLLite;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Willian
 */
public class frmiQuery extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmiQuery
     */
    public frmiQuery() {
        initComponents();
    }
    private DefaultListModel modelHistorico = new DefaultListModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuery = new javax.swing.JTextArea();
        btnExecutar = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listHistorico = new javax.swing.JList<>();
        cbBrowse = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Query");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Query:");

        txtQuery.setColumns(20);
        txtQuery.setRows(5);
        txtQuery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtQueryKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtQuery);

        btnExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/run16x16.png"))); // NOI18N
        btnExecutar.setText("Executar (F5)");
        btnExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecutarActionPerformed(evt);
            }
        });
        btnExecutar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnExecutarKeyPressed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Executar", jPanel1);

        listHistorico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listHistoricoKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(listHistorico);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Histórico", jPanel2);

        cbBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBrowseActionPerformed(evt);
            }
        });
        cbBrowse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbBrowseKeyPressed(evt);
            }
        });

        jLabel2.setText("Browse Data:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExecutar))
                            .addComponent(cbBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnExecutar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecutarActionPerformed
        String result = new String();
        ConexaoSQLLite connection = new ConexaoSQLLite();
        if (connection.conectar()) {
            try {
                PreparedStatement prepareStatement = null;
                prepareStatement = connection.preparesStatement(txtQuery.getText());
                ResultSet rs = prepareStatement.executeQuery();
                DefaultTableModel tableModel = new DefaultTableModel();
                jTable1.setAutoCreateRowSorter(true);
                for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                    tableModel.addColumn(rs.getMetaData().getColumnName(i));
                }
                result = "";
                while (rs.next()) {
                    Object[] objetos = new Object[rs.getMetaData().getColumnCount() + 1];
                    for (int i = 1; i <= rs.getMetaData().getColumnCount(); i++) {
                        objetos[i - 1] = rs.getString(i);
                    }
                    tableModel.addRow(objetos);
                }
                jTable1.setModel(tableModel);
                modelHistorico.addElement(txtQuery.getText());
                listHistorico.setModel(modelHistorico);
            } catch (SQLException e) {

            } finally {
                connection.desconectar();
            }
        }
    }//GEN-LAST:event_btnExecutarActionPerformed

    private void listHistoricoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listHistoricoKeyPressed
        int index = listHistorico.getSelectedIndex();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtQuery.setText("");
            txtQuery.setText(listHistorico.getSelectedValue());
            btnExecutar.doClick();
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_listHistoricoKeyPressed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        String query = "select name from sqlite_master where type in ('table' ,'view') and name <> 'sqlite_sequence'";
        ConexaoSQLLite connection = new ConexaoSQLLite();
        if (connection.conectar()) {
            try {
                PreparedStatement prepareStatement = null;
                prepareStatement = connection.preparesStatement(query);
                ResultSet rs = prepareStatement.executeQuery();
                while (rs.next()) {
                    cbBrowse.addItem(rs.getString(1));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar dados do Banco." + e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
            } finally {
                carregarHistorico();
                connection.desconectar();
            }
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void cbBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBrowseActionPerformed
        String option = cbBrowse.getSelectedItem().toString();
        txtQuery.setText("");
        txtQuery.setText("select * from " + option);
        btnExecutar.doClick();
    }//GEN-LAST:event_cbBrowseActionPerformed

    private void cbBrowseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbBrowseKeyPressed
        atalhoExecutar(evt);
    }//GEN-LAST:event_cbBrowseKeyPressed

    private void txtQueryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQueryKeyPressed
        atalhoExecutar(evt);
    }//GEN-LAST:event_txtQueryKeyPressed

    private void btnExecutarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnExecutarKeyPressed
        atalhoExecutar(evt);
    }//GEN-LAST:event_btnExecutarKeyPressed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        salvarHistorico();
    }//GEN-LAST:event_formInternalFrameClosing

    private void atalhoExecutar(java.awt.event.KeyEvent evt) {
        if (txtQuery.getText() != "" & !txtQuery.getText().isEmpty()) {
            if (evt.getKeyCode() == KeyEvent.VK_F5) {
                btnExecutar.doClick();
            }
        }
    }

    private void carregarHistorico() {
        String query = "select historico from historico";
        ConexaoSQLLite connection = new ConexaoSQLLite();
        if (connection.conectar()) {
            try {
                modelHistorico.clear();
                PreparedStatement prepareStatement = null;
                prepareStatement = connection.preparesStatement(query);
                ResultSet rs = prepareStatement.executeQuery();
                while (rs.next()) {
                    modelHistorico.addElement(rs.getString(1));
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar dados do Banco." + e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
            } finally {
                connection.desconectar();
            }
        }
    }

    private void salvarHistorico() {
        String delete = "delete from historico";
        String query = "insert into historico values (?)";
        ConexaoSQLLite connection = new ConexaoSQLLite();

        if (connection.conectar()) {
            try {
                PreparedStatement prepareStatement = null;
                prepareStatement = connection.preparesStatement(delete);
                prepareStatement.execute();
                for (int i = 0; i < modelHistorico.getSize(); i++) {
                    prepareStatement = null;
                    prepareStatement = connection.preparesStatement(query);
                    prepareStatement.setString(1, (String) modelHistorico.getElementAt(i));
                    prepareStatement.execute();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao carregar dados do Banco." + e.getMessage(), "Atenção", JOptionPane.ERROR_MESSAGE);
            } finally {
                connection.desconectar();
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExecutar;
    private javax.swing.JComboBox<String> cbBrowse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listHistorico;
    private javax.swing.JTextArea txtQuery;
    // End of variables declaration//GEN-END:variables
}
