/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;


import javax.swing.table.DefaultTableModel;
/**
 *
 * @author aluno
 */
public class Caixa extends javax.swing.JFrame {
    
    double subtotal;
    int totitens;

    /**
     * Creates new form Caixa
     */
    public Caixa() {
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

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlbltotitens = new javax.swing.JLabel();
        jlblsubtotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtvalorunit = new javax.swing.JTextField();
        jtxtqtd = new javax.swing.JTextField();
        jtxtproduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 146, 92));
        jPanel1.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Lucida Sans", 1, 48)); // NOI18N
        jLabel11.setText("MERCADO - CAIXA ABERTO");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(177, 36, 684, 57);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1079, 0);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(131, 212, 175));
        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Itens");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(66, 11, 40, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Sub Total");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(280, 11, 76, 22);

        jlbltotitens.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jlbltotitens.setText("0");
        jPanel4.add(jlbltotitens);
        jlbltotitens.setBounds(80, 40, 16, 37);

        jlblsubtotal.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jlblsubtotal.setText("0");
        jPanel4.add(jlblsubtotal);
        jlblsubtotal.setBounds(310, 40, 16, 37);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(21, 211, 463, 0);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Valor Unitário", "Quantidade", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.setName("jtabela"); // NOI18N
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(21, 48, 463, 139);

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("Adicionar");
        jButton1.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton1.setName("jbtnadicionar"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(580, 250, 174, 50);

        jButton2.setBackground(new java.awt.Color(153, 255, 204));
        jButton2.setText("Excluir");
        jButton2.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton2.setName("jbtnexcluir"); // NOI18N
        jPanel2.add(jButton2);
        jButton2.setBounds(790, 250, 174, 54);

        jtxtvalorunit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtvalorunit.setName("jtxtvalorunit"); // NOI18N
        jPanel2.add(jtxtvalorunit);
        jtxtvalorunit.setBounds(580, 200, 174, 40);

        jtxtqtd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtqtd.setName("jtxtqtd"); // NOI18N
        jPanel2.add(jtxtqtd);
        jtxtqtd.setBounds(790, 190, 174, 40);

        jtxtproduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxtproduto.setName("jtxtproduto"); // NOI18N
        jPanel2.add(jtxtproduto);
        jtxtproduto.setBounds(580, 50, 385, 45);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Produtos");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(21, 28, 106, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Produtos");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(580, 30, 56, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Valor Unitário(R$)");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(580, 170, 107, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(770, 170, 70, 17);

        jPanel6.setBackground(new java.awt.Color(102, 0, 255));
        jPanel6.setName(""); // NOI18N
        jPanel6.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Itens");
        jPanel6.add(jLabel9);
        jLabel9.setBounds(40, 10, 50, 17);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sub Total");
        jPanel6.add(jLabel10);
        jLabel10.setBounds(310, 10, 80, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("0");
        jLabel13.setName(""); // NOI18N
        jPanel6.add(jLabel13);
        jLabel13.setBounds(50, 30, 60, 60);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("0");
        jLabel14.setName("jlblsubtotal"); // NOI18N
        jPanel6.add(jLabel14);
        jLabel14.setBounds(330, 20, 50, 80);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(20, 200, 460, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 1010, 330);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(null);

        jButton3.setBackground(new java.awt.Color(153, 255, 204));
        jButton3.setText("Finalizar");
        jButton3.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton3.setName("jbtnfinalizar"); // NOI18N
        jPanel3.add(jButton3);
        jButton3.setBounds(592, 38, 174, 40);

        jButton4.setBackground(new java.awt.Color(153, 255, 204));
        jButton4.setText("Cancelar");
        jButton4.setMaximumSize(new java.awt.Dimension(23, 23));
        jButton4.setName("jbtncancelar"); // NOI18N
        jPanel3.add(jButton4);
        jButton4.setBounds(803, 38, 174, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField4.setName("jtxtvrecibo"); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(35, 38, 200, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField5.setName("jtxttroco"); // NOI18N
        jPanel3.add(jTextField5);
        jTextField5.setBounds(289, 38, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Valor Recebido");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(35, 15, 90, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Troco");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(289, 15, 36, 17);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 450, 1010, 130);

        jPanel5.setBackground(new java.awt.Color(0, 204, 204));
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setText("MERCADO - CAIXA ABERTO");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(205, 28, 660, 58);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1010, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        //variaveis para receber os valores digitalizados
        String produto;
        double vunit, vtotal;
        int qtd;
        //atribui os valores das caixas de texto e combobox
        //variaveis
        produto = jtxtproduto.getText();
        vunit = Double.parseDouble(jtxtvalorunit.getText());
        qtd = Integer.parseInt(jtxtqtd.getText());
        //calcular o valor total de cada produto
        vtotal = vunit * qtd;
                //calcula o valor do subtotal
        subtotal = subtotal + vtotal;
        //calcula a quantidade de itens
        totitens = totitens + qtd;
        //mostra os valores
        jLabel13.setText(String.valueOf(subtotal));
        jLabel14.setText(String.valueOf(totitens));
        
        //adiciona nova linha na talela
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel(); 
        modelo.addRow(new Object []{produto, vunit, qtd, vtotal});

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel jlblsubtotal;
    private javax.swing.JLabel jlbltotitens;
    private javax.swing.JTextField jtxtproduto;
    private javax.swing.JTextField jtxtqtd;
    private javax.swing.JTextField jtxtvalorunit;
    // End of variables declaration//GEN-END:variables
}
