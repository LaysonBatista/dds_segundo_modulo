package pkg04_01_exercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lucas
 */
public class Agendamento extends javax.swing.JFrame {

    /**
     * Creates new form Estoque
     */
    public Agendamento() {
        initComponents();
    }
    
    public void PopularJTable(String sql) {
    try
  {
   Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3307/fashion_foot", "ff_layson", "123456");
   PreparedStatement banco = (PreparedStatement)con.prepareStatement(sql);
   banco.execute(); 
 
   ResultSet resultado = banco.executeQuery(sql);
 
   DefaultTableModel model =(DefaultTableModel) Tabela_Agendamento.getModel();
   model.setNumRows(0);
 
   while(resultado.next())
   {
       model.addRow(new Object[] 
       { 
          //retorna os dados da tabela do BD, cada campo e um coluna.
          //codigo,nome,condicao,tamanho,unidades,categoria,preco,valor_venda,peso,descricao
          resultado.getString("horario"),
          resultado.getString("nome"),
          resultado.getString("idade"),
          resultado.getString("endereco"),
          resultado.getString("categoria")
       }); 
  } 
   banco.close();
   con.close();
  }
 catch (SQLException ex)
 {
    System.out.println("o erro foi " +ex);
  }
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ajuda1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        novoAgendamento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela_Agendamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                Select(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(17, 69, 139));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(229, 237, 248));
        jLabel1.setText("AGENDAMENTO");

        ajuda1.setBackground(new java.awt.Color(17, 69, 139));
        ajuda1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        ajuda1.setForeground(new java.awt.Color(229, 237, 248));
        ajuda1.setText("<");
        ajuda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajuda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ajuda1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(781, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ajuda1)
                    .addComponent(jLabel1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(229, 237, 248));

        novoAgendamento.setBackground(new java.awt.Color(17, 69, 139));
        novoAgendamento.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        novoAgendamento.setForeground(new java.awt.Color(229, 237, 248));
        novoAgendamento.setText("Novo Agendamento");
        novoAgendamento.setToolTipText("");
        novoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoAgendamentoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        Tabela_Agendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Horário", "Nome", "Idade", "Local", "Categoria"
            }
        ));
        Tabela_Agendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela_Agendamento(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela_Agendamento);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(novoAgendamento)
                        .addGap(184, 184, 184)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(novoAgendamento)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoAgendamentoActionPerformed
        // TODO add your handling code here:
        Agendamento.this.dispose();
        Novo_Agendamento novoAgendamento = new Novo_Agendamento();
        novoAgendamento.setVisible(true);
    }//GEN-LAST:event_novoAgendamentoActionPerformed

    private void ajuda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajuda1ActionPerformed
        // TODO add your handling code here:
        Agendamento.this.dispose();
        Carrinho carrinho = new Carrinho();
        carrinho.setVisible(true);
        
    }//GEN-LAST:event_ajuda1ActionPerformed

    private void Select(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Select
        // TODO add your handling code here:
        Connection conexao = null;
        PreparedStatement statement = null;

        String url = "jdbc:mysql://localhost:3307/fashion_foot";
        String usuario = "ff_lucas";
        String senha = "123456";
        
        try {
        conexao = DriverManager.getConnection(url, usuario, senha);
        this.PopularJTable("SELECT * FROM agendamento");
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_Select

    private void Tabela_Agendamento(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela_Agendamento
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Tabela_Agendamento

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
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agendamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela_Agendamento;
    private javax.swing.JButton ajuda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton novoAgendamento;
    // End of variables declaration//GEN-END:variables
}
