/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ClienteControle;
import controle.TabelaClienteControle;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Bruno
 */
public class FrmManipularCliente extends javax.swing.JDialog {

    int flag = 0;  //0- alterar / 1- excluir / 2- consultar(telas bloqueadas)
    String usuarioLogado;
    TabelaClienteControle tableControl = new TabelaClienteControle();

    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmManipularCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        jTable_Clientes.setModel(tableControl.inicializaTableModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Clientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Codigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton_Manipular = new javax.swing.JButton();
        jButton_Primeiro = new javax.swing.JButton();
        jButton_Anterior = new javax.swing.JButton();
        jButton_Proximo = new javax.swing.JButton();
        jButton_Ultimo = new javax.swing.JButton();
        jButton_Cancelar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField_Endereco = new javax.swing.JTextField();
        jTextField_Bairro = new javax.swing.JTextField();
        jTextField_Numero = new javax.swing.JTextField();
        jTextField_Complemento = new javax.swing.JTextField();
        jComboBox_Estado = new javax.swing.JComboBox();
        jComboBox_Cidades = new javax.swing.JComboBox();
        jFormattedTextField_Cpf = new javax.swing.JFormattedTextField();
        jFormattedTextField_Cep = new javax.swing.JFormattedTextField();
        jFormattedTextField_Celular = new javax.swing.JFormattedTextField();
        jFormattedTextField_Telefone = new javax.swing.JFormattedTextField();
        jLabel_Id_Usuario = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_dt_cadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jTable_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Clientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Clientes);

        jLabel1.setText("Código:");

        jTextField_Codigo.setText("0");

        jLabel2.setText("Nome:");

        jLabel3.setText("CPF:");

        jButton_Manipular.setText("Salvar");
        jButton_Manipular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ManipularActionPerformed(evt);
            }
        });

        jButton_Primeiro.setText("<<");
        jButton_Primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrimeiroActionPerformed(evt);
            }
        });

        jButton_Anterior.setText("<");
        jButton_Anterior.setEnabled(false);
        jButton_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrimeiroActionPerformed(evt);
            }
        });

        jButton_Proximo.setText(">");
        jButton_Proximo.setEnabled(false);
        jButton_Proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrimeiroActionPerformed(evt);
            }
        });

        jButton_Ultimo.setText(">>");
        jButton_Ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrimeiroActionPerformed(evt);
            }
        });

        jButton_Cancelar.setText("Cancelar");
        jButton_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Cep:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Bairro:");

        jLabel7.setText("Numero:");

        jLabel8.setText("Complemento:");

        jLabel9.setText("Telefone:");

        jLabel10.setText("Celular:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("Estado:");

        jLabel13.setText("Usuário:");

        jLabel14.setText("Animais:");

        jComboBox_Estado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox_Cidades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        try {
            jFormattedTextField_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Celular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #.####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField_Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel_Id_Usuario.setText("   ");

        jLabel15.setText("Dt Cadastro:");

        jLabel_dt_cadastro.setText("          ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField_Cpf))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(jTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(jTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel_Id_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton_Manipular, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_Cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton_Primeiro)
                                .addGap(10, 10, 10)
                                .addComponent(jButton_Anterior)
                                .addGap(6, 6, 6)
                                .addComponent(jButton_Proximo)
                                .addGap(6, 6, 6)
                                .addComponent(jButton_Ultimo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(4, 4, 4)
                                        .addComponent(jComboBox_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(10, 10, 10)
                                        .addComponent(jComboBox_Cidades, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel_dt_cadastro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(jTextField_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jFormattedTextField_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jFormattedTextField_Cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_Cidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jFormattedTextField_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFormattedTextField_Celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel_Id_Usuario))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel_dt_cadastro))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Manipular)
                    .addComponent(jButton_Cancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Primeiro)
                    .addComponent(jButton_Anterior)
                    .addComponent(jButton_Proximo)
                    .addComponent(jButton_Ultimo))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(542, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ManipularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ManipularActionPerformed

        ArrayList<String> Registro = new ArrayList<String>();
        Registro.add(jTextField_Codigo.getText());
        Registro.add(jTextField_Nome.getText());
        Registro.add(jFormattedTextField_Cpf.getText());

        ClienteControle ControleCliente = new ClienteControle();

        if (flag == 0) {
            ControleCliente.Atualizar(Registro);
            jTable_Clientes.setModel(tableControl.inicializaTableModel());

        } else if (flag == 1) {
            ControleCliente.Excluir(Registro);
            jTable_Clientes.setModel(tableControl.inicializaTableModel());

        } else if (flag == 2) {
            //BLOQUEAR CAMPOS
        }

    }//GEN-LAST:event_jButton_ManipularActionPerformed

    private void jButton_PrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrimeiroActionPerformed

        int iOpcao;
        int sizeTable;

        if ((!jButton_Anterior.isEnabled()) && (!jButton_Proximo.isEnabled())) {
            jButton_Anterior.setEnabled(true);
            jButton_Proximo.setEnabled(true);
        }

        if (evt.getSource() == jButton_Primeiro) {
            iOpcao = 0;
        } else if (evt.getSource() == jButton_Anterior) {
            iOpcao = 1;
        } else if (evt.getSource() == jButton_Proximo) {
            iOpcao = 2;
        } else if (evt.getSource() == jButton_Ultimo) {
            iOpcao = 3;
        } else {
            iOpcao = -1;
        }

        int CodAtual;
        try {
            CodAtual = Integer.parseInt(jTextField_Codigo.getText());
        } catch (Exception e) {
            CodAtual = 0;
        }

        sizeTable = jTable_Clientes.getModel().getRowCount();

        if (((iOpcao == 1) && (jTable_Clientes.getSelectedRow() == 0))
                || ((iOpcao == 2) && (jTable_Clientes.getSelectedRow() == sizeTable - 1))) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado.");
        } else {
            PreencherTelaComObjRecuperado(CodAtual, iOpcao);
            jTextField_Nome.requestFocus();
            IndiceSelecionado();
        }
    }//GEN-LAST:event_jButton_PrimeiroActionPerformed

    private void jTable_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_ClientesMouseClicked
        int linhaSelecionada = jTable_Clientes.getSelectedRow();
        if (linhaSelecionada == -1) {

        } else {
            String cpf = jTable_Clientes.getValueAt(linhaSelecionada, 0).toString();
            PreencherTelaComObjRecuperado(Integer.parseInt(cpf), -1);
            jTextField_Codigo.setText(cpf);
            jTextField_Nome.requestFocus();
            JOptionPane.showMessageDialog(rootPane, cpf);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTable_ClientesMouseClicked

    private void jButton_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelarActionPerformed
JOptionPane.showMessageDialog(rootPane, flag);
        dispose();
    }//GEN-LAST:event_jButton_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmManipularCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmManipularCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmManipularCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmManipularCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmManipularCliente dialog = new FrmManipularCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Anterior;
    private javax.swing.JButton jButton_Cancelar;
    private javax.swing.JButton jButton_Manipular;
    private javax.swing.JButton jButton_Primeiro;
    private javax.swing.JButton jButton_Proximo;
    private javax.swing.JButton jButton_Ultimo;
    private javax.swing.JComboBox jComboBox_Cidades;
    private javax.swing.JComboBox jComboBox_Estado;
    private javax.swing.JFormattedTextField jFormattedTextField_Celular;
    private javax.swing.JFormattedTextField jFormattedTextField_Cep;
    private javax.swing.JFormattedTextField jFormattedTextField_Cpf;
    private javax.swing.JFormattedTextField jFormattedTextField_Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Id_Usuario;
    private javax.swing.JLabel jLabel_dt_cadastro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Clientes;
    private javax.swing.JTextField jTextField_Bairro;
    private javax.swing.JTextField jTextField_Codigo;
    private javax.swing.JTextField jTextField_Complemento;
    private javax.swing.JTextField jTextField_Endereco;
    private javax.swing.JTextField jTextField_Nome;
    private javax.swing.JTextField jTextField_Numero;
    // End of variables declaration//GEN-END:variables

    public void setButton(String nome) {
        jButton_Manipular.setText(nome);
    }

    public void PreencherTelaComObjRecuperado(int CodAtual, int iOpcao) {
        ClienteControle Clientecontrol = new ClienteControle();
        ArrayList<String> Registro = new ArrayList<String>();

        if (iOpcao == -1) {
            Registro = Clientecontrol.RecuperaObjeto(CodAtual);
        } else {
            Registro = Clientecontrol.RecuperaObjetoNavegacao(iOpcao, CodAtual);
        }
        if (!Registro.get(0).equals("-1")) {

            if (iOpcao != -1) {
                jTextField_Codigo.setText(Registro.get(0));
            }

            try {
                jTextField_Codigo.setText(Registro.get(0));
            } catch (Exception e) {
            }
            try {
                jTextField_Nome.setText(Registro.get(1));
            } catch (Exception e) {
            }
            try {
                jFormattedTextField_Cpf.setText(Registro.get(2));
            } catch (Exception e) {
            }
            try {
                jFormattedTextField_Cep.setText(Registro.get(3));
            } catch (Exception e) {
            }

            try {
                jTextField_Endereco.setText(Registro.get(4));
            } catch (Exception e) {
            }
            try {
                jTextField_Bairro.setText(Registro.get(5));
            } catch (Exception e) {
            }
            try {
                jTextField_Numero.setText(Registro.get(6));
            } catch (Exception e) {
            }
            try {
                jTextField_Complemento.setText(Registro.get(7));
            } catch (Exception e) {
            }
            try {
                jFormattedTextField_Telefone.setText(Registro.get(8));
            } catch (Exception e) {
            }
            try {
                jFormattedTextField_Celular.setText(Registro.get(9));
            } catch (Exception e) {
            }
            try {
                jLabel_Id_Usuario.setText(Registro.get(10));
            } catch (Exception e) {
            }
            try {
                jLabel_dt_cadastro.setText(Registro.get(11));
            } catch (Exception e) {
            }

        } else {
            if (iOpcao == -1) {
                JOptionPane.showMessageDialog(rootPane, "Registro não encontrado.");
            }
        }
        //tabelaCidades.setRowSelectionInterval(Registro.indexOf(this), Registro.indexOf(this));
    }

    private void IndiceSelecionado() {
        int i = 0;
        int a;
        jTable_Clientes.setRowSelectionInterval(0, 0);
        a = (int) jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 0);

        while (jTextField_Codigo.getText() == null ? String.valueOf(a) != null : !jTextField_Codigo.getText()
                .equals(String.valueOf(a))) {
            i++;
            jTable_Clientes.setRowSelectionInterval(i, i);
            a = (int) jTable_Clientes.getValueAt(jTable_Clientes.getSelectedRow(), 0);
        }

    }

}