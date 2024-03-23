/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg04_01_exercise;

import pkg04_01_exercise.Agendamento;
import pkg04_01_exercise.Lista_de_Produtos;
import pkg04_01_exercise.Pagamento;
import javax.swing.JOptionPane;

/**
 *
 * @author jvpes
 */
public class Carrinho extends javax.swing.JFrame {

    /**
     * Creates new form Carrinho
     */
    public Carrinho() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_voltar = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btn_comprar_selecionados = new javax.swing.JButton();
        btn_agendar_teste = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn_comprar_1 = new javax.swing.JButton();
        btn_excluir_1 = new javax.swing.JButton();
        btn_favoritar_1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        select_qtd_1 = new javax.swing.JComboBox<>();
        label_valor_1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_comprar_2 = new javax.swing.JButton();
        btn_excluir_2 = new javax.swing.JButton();
        btn_favoritar_2 = new javax.swing.JButton();
        select_qtd_2 = new javax.swing.JComboBox<>();
        label_valor_2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        btn_voltar.setBackground(new java.awt.Color(17, 69, 139));
        btn_voltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_voltar.setForeground(new java.awt.Color(229, 237, 248));
        btn_voltar.setText("<");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 237, 248));
        jLabel1.setText("CARRINHO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btn_voltar)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(589, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar)
                    .addComponent(jLabel1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));

        jCheckBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBox1.setToolTipText("");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jCheckBox2.setToolTipText("");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        btn_comprar_selecionados.setBackground(new java.awt.Color(17, 69, 139));
        btn_comprar_selecionados.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_comprar_selecionados.setForeground(new java.awt.Color(229, 237, 248));
        btn_comprar_selecionados.setText("Comprar selecionados");
        btn_comprar_selecionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprar_selecionadosActionPerformed(evt);
            }
        });

        btn_agendar_teste.setBackground(new java.awt.Color(17, 69, 139));
        btn_agendar_teste.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_agendar_teste.setForeground(new java.awt.Color(229, 237, 248));
        btn_agendar_teste.setText("Agendar teste");
        btn_agendar_teste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agendar_testeActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btn_comprar_1.setBackground(new java.awt.Color(17, 69, 139));
        btn_comprar_1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_comprar_1.setForeground(new java.awt.Color(229, 237, 248));
        btn_comprar_1.setText("Comprar");
        btn_comprar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprar_1ActionPerformed(evt);
            }
        });

        btn_excluir_1.setBackground(new java.awt.Color(17, 69, 139));
        btn_excluir_1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_excluir_1.setForeground(new java.awt.Color(229, 237, 248));
        btn_excluir_1.setText("Excluir");
        btn_excluir_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_1ActionPerformed(evt);
            }
        });

        btn_favoritar_1.setBackground(new java.awt.Color(17, 69, 139));
        btn_favoritar_1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_favoritar_1.setForeground(new java.awt.Color(229, 237, 248));
        btn_favoritar_1.setText("Favoritar");
        btn_favoritar_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_favoritar_1ActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(17, 69, 139));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(229, 237, 248));
        jLabel2.setText("IMAGEM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(17, 69, 139));
        jLabel4.setText("Forma de pagamento");

        select_qtd_1.setBackground(new java.awt.Color(17, 69, 139));
        select_qtd_1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        select_qtd_1.setForeground(new java.awt.Color(229, 237, 248));
        select_qtd_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        label_valor_1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_valor_1.setForeground(new java.awt.Color(17, 69, 139));
        label_valor_1.setText("R$99,99");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 69, 139));
        jLabel8.setText("Nome do produto");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_comprar_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir_1))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_favoritar_1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(select_qtd_1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(label_valor_1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addContainerGap(258, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(select_qtd_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_valor_1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_comprar_1)
                    .addComponent(btn_excluir_1)
                    .addComponent(btn_favoritar_1))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(17, 69, 139));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(229, 237, 248));
        jLabel6.setText("IMAGEM 2");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel6)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(39, 39, 39))
        );

        btn_comprar_2.setBackground(new java.awt.Color(17, 69, 139));
        btn_comprar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_comprar_2.setForeground(new java.awt.Color(229, 237, 248));
        btn_comprar_2.setText("Comprar");
        btn_comprar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comprar_2ActionPerformed(evt);
            }
        });

        btn_excluir_2.setBackground(new java.awt.Color(17, 69, 139));
        btn_excluir_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_excluir_2.setForeground(new java.awt.Color(229, 237, 248));
        btn_excluir_2.setText("Excluir");
        btn_excluir_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluir_2ActionPerformed(evt);
            }
        });

        btn_favoritar_2.setBackground(new java.awt.Color(17, 69, 139));
        btn_favoritar_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_favoritar_2.setForeground(new java.awt.Color(229, 237, 248));
        btn_favoritar_2.setText("Favoritar");
        btn_favoritar_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_favoritar_2ActionPerformed(evt);
            }
        });

        select_qtd_2.setBackground(new java.awt.Color(17, 69, 139));
        select_qtd_2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        select_qtd_2.setForeground(new java.awt.Color(229, 237, 248));
        select_qtd_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        label_valor_2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label_valor_2.setForeground(new java.awt.Color(17, 69, 139));
        label_valor_2.setText("R$99,99");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 69, 139));
        jLabel3.setText("Nome do produto 2");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 69, 139));
        jLabel9.setText("Forma de pagamento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn_comprar_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_excluir_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_favoritar_2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(select_qtd_2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(label_valor_2))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))))
                        .addGap(15, 15, 15))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(select_qtd_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_valor_2))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_comprar_2)
                    .addComponent(btn_excluir_2)
                    .addComponent(btn_favoritar_2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_agendar_teste)
                        .addGap(18, 18, 18)
                        .addComponent(btn_comprar_selecionados)))
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jCheckBox1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox2)
                        .addGap(86, 86, 86)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_comprar_selecionados)
                    .addComponent(btn_agendar_teste))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btn_agendar_testeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agendar_testeActionPerformed
        // TODO add your handling code here:
        Carrinho.this.dispose();
        Agendamento agendamento = new Agendamento();
        agendamento.setVisible(true);
        
    }//GEN-LAST:event_btn_agendar_testeActionPerformed

    private void btn_comprar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprar_1ActionPerformed
        // TODO add your handling code here:
        Carrinho.this.dispose();
        Pagamento pagamento = new Pagamento();
        pagamento.setVisible(true);
    }//GEN-LAST:event_btn_comprar_1ActionPerformed

    private void btn_comprar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprar_2ActionPerformed
        // TODO add your handling code here:
        Carrinho.this.dispose();
        Pagamento pagamento = new Pagamento();
        pagamento.setVisible(true);
    }//GEN-LAST:event_btn_comprar_2ActionPerformed

    private void btn_comprar_selecionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comprar_selecionadosActionPerformed
        // TODO add your handling code here:
        Carrinho.this.dispose();
        Pagamento pagamento = new Pagamento();
        pagamento.setVisible(true);
    }//GEN-LAST:event_btn_comprar_selecionadosActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        // TODO add your handling code here:
        Carrinho.this.dispose();
        Lista_de_Produtos acessoListagemProduto = new Lista_de_Produtos();
        acessoListagemProduto.setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_excluir_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_1ActionPerformed
        // TODO add your handling code here:
         String[] opcoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja excluir esse produto do carrinho?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        if (resposta == JOptionPane.YES_OPTION) {
            
        JOptionPane.showMessageDialog(rootPane,"O Produto será removido em breve.");
        
        } else {
            
        }
    }//GEN-LAST:event_btn_excluir_1ActionPerformed

    private void btn_excluir_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluir_2ActionPerformed
        // TODO add your handling code here:
         String[] opcoes = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(rootPane, "Tem certeza que deseja excluir esse produto do carrinho?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        if (resposta == JOptionPane.YES_OPTION) {
            
        JOptionPane.showMessageDialog(rootPane,"O Produto será removido em breve.");
        
        } else {
            
        }
    }//GEN-LAST:event_btn_excluir_2ActionPerformed

    private void btn_favoritar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_favoritar_1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane,"O Produto foi adicionado aos favoritos!.");
        
    }//GEN-LAST:event_btn_favoritar_1ActionPerformed

    private void btn_favoritar_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_favoritar_2ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(rootPane,"O Produto foi adicionado aos favoritos!.");
         
    }//GEN-LAST:event_btn_favoritar_2ActionPerformed

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
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agendar_teste;
    private javax.swing.JButton btn_comprar_1;
    private javax.swing.JButton btn_comprar_2;
    private javax.swing.JButton btn_comprar_selecionados;
    private javax.swing.JButton btn_excluir_1;
    private javax.swing.JButton btn_excluir_2;
    private javax.swing.JButton btn_favoritar_1;
    private javax.swing.JButton btn_favoritar_2;
    private javax.swing.JToggleButton btn_voltar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_valor_1;
    private javax.swing.JLabel label_valor_2;
    private javax.swing.JComboBox<String> select_qtd_1;
    private javax.swing.JComboBox<String> select_qtd_2;
    // End of variables declaration//GEN-END:variables
}
