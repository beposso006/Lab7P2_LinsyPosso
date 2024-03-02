/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lab7p2_linsyposso;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author 29164
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jppm_tree = new javax.swing.JPopupMenu();
        jmi_loadFile = new javax.swing.JMenuItem();
        jmi_refresh = new javax.swing.JMenuItem();
        jppm_table = new javax.swing.JPopupMenu();
        jmi_cleartable = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jtf_lineaComando = new javax.swing.JTextField();
        jB_enter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree_archivo = new javax.swing.JTree();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_new = new javax.swing.JMenuItem();
        jmi_import = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jM_clear = new javax.swing.JMenu();
        jM_ClearCL = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jM_refreshTree = new javax.swing.JMenuItem();
        jM_help = new javax.swing.JMenu();
        jmi_EstructuraP = new javax.swing.JMenuItem();
        jmi_commands = new javax.swing.JMenuItem();

        jmi_loadFile.setText("Load File");
        jmi_loadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_loadFileActionPerformed(evt);
            }
        });
        jppm_tree.add(jmi_loadFile);

        jmi_refresh.setText("Refresh Trees");
        jmi_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_refreshActionPerformed(evt);
            }
        });
        jppm_tree.add(jmi_refresh);

        jmi_cleartable.setText("Clear Table");
        jmi_cleartable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cleartableActionPerformed(evt);
            }
        });
        jppm_table.add(jmi_cleartable);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtf_lineaComando.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jtf_lineaComando, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 50));

        jB_enter.setText("Enter");
        jB_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB_enterMouseClicked(evt);
            }
        });
        jPanel1.add(jB_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 160, 40));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("CSVs");
        jTree_archivo.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree_archivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree_archivoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree_archivo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 480));

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Category", "Price", "Aisle", "Bin"
            }
        ));
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_productos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 590, 480));

        jMenu1.setText("File");

        jmi_new.setText("New File");
        jmi_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_newActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_new);

        jmi_import.setText("Import File");
        jmi_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_importActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_import);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Window");

        jM_clear.setText("Clear");

        jM_ClearCL.setText("Clear Command Line");
        jM_ClearCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_ClearCLActionPerformed(evt);
            }
        });
        jM_clear.add(jM_ClearCL);

        jMenuItem5.setText("Clear Table");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jM_clear.add(jMenuItem5);

        jMenu2.add(jM_clear);

        jM_refreshTree.setText("Refresh Tree");
        jM_refreshTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jM_refreshTreeActionPerformed(evt);
            }
        });
        jMenu2.add(jM_refreshTree);

        jMenuBar1.add(jMenu2);

        jM_help.setText("Help");

        jmi_EstructuraP.setText("Product Structure");
        jmi_EstructuraP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_EstructuraPActionPerformed(evt);
            }
        });
        jM_help.add(jmi_EstructuraP);

        jmi_commands.setText("Commands");
        jmi_commands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_commandsActionPerformed(evt);
            }
        });
        jM_help.add(jmi_commands);

        jMenuBar1.add(jM_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 817, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB_enterMouseClicked
        if (jtf_lineaComando.getText().contains("./load")) {
            cargardeArchivo();
        } else if (jtf_lineaComando.getText().contains("./create")) {
            try {
                crearArchivo();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (jtf_lineaComando.getText().contains("./clean")){
            limpiarTable();
        }else if (jtf_lineaComando.getText().contains("./refresh")){
            cargarArboles();
        }
    }//GEN-LAST:event_jB_enterMouseClicked

    private void jmi_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_importActionPerformed
        cargardeArchivo();
    }//GEN-LAST:event_jmi_importActionPerformed

    private void jmi_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_newActionPerformed
        try {
            crearArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmi_newActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       limpiarTable();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jM_ClearCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_ClearCLActionPerformed
        jtf_lineaComando.setText("");
    }//GEN-LAST:event_jM_ClearCLActionPerformed

    private void jmi_cleartableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cleartableActionPerformed
        limpiarTable();
    }//GEN-LAST:event_jmi_cleartableActionPerformed

    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
        if (evt.isMetaDown()) {
            jppm_table.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTable_productosMouseClicked

    private void jM_refreshTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jM_refreshTreeActionPerformed
       cargarArboles();
    }//GEN-LAST:event_jM_refreshTreeActionPerformed

    private void jTree_archivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree_archivoMouseClicked
        if (evt.isMetaDown()) {
            jppm_tree.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jTree_archivoMouseClicked

    private void jmi_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_refreshActionPerformed
        cargarArboles();
    }//GEN-LAST:event_jmi_refreshActionPerformed

    private void jmi_loadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_loadFileActionPerformed
        cargardeArchivo();
    }//GEN-LAST:event_jmi_loadFileActionPerformed

    private void jmi_commandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_commandsActionPerformed
        JOptionPane.showMessageDialog(this, "Comandos: " + "\n"
                + "1) ./load" + "\n" + "2) ./create" + "\n" + "3) ./clear"
        + "\n" + "4) /refresh");
    }//GEN-LAST:event_jmi_commandsActionPerformed

    private void jmi_EstructuraPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_EstructuraPActionPerformed
        
    }//GEN-LAST:event_jmi_EstructuraPActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void cargardeArchivo() {
        File archivo = null;
        FileReader fr = null;
        try {
            archivo = new File("./data.txt");
            leer = new Scanner(archivo);
            DefaultTableModel modelo = (DefaultTableModel) jTable_productos.getModel();
            modelo.setRowCount(0);
            while (leer.hasNext()) {
                String next = leer.nextLine();
                String[] tk = next.split(",");
                System.out.println(next);

                Object[] row = {tk[0], tk[1], tk[2], tk[3], tk[4], tk[5]};
                
                modelo.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        leer.close();
    }

    private void crearArchivo() throws IOException {
        DefaultTableModel modelo = (DefaultTableModel) jTable_productos.getModel();
        String acum = "";

        File archivo = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            String l = jtf_lineaComando.getText();
            String[] parse = l.split(" ");
            archivo = new File("./" + parse[1]);
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (int i = 0; i < modelo.getRowCount(); i++) {
                for (int j = 0; j < modelo.getColumnCount(); j++) {
                    if (modelo.getValueAt(i, j) != null) {
                        modelo.getValueAt(i, j);
                        acum += modelo.getValueAt(i, j) + ",";
                    }
                }
                bw.write(acum);
                acum = "";
            }
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    
    private void limpiarTable(){    
        DefaultTableModel model = (DefaultTableModel) jTable_productos.getModel();
        int f = jTable_productos.getRowCount();
        for (int i = 0; f > i; i++) {
            model.removeRow(0);
        }
        model.setRowCount(5);
    }
    
    private void cargarArboles(){
        File direct = new File(".");
        File [] a = direct.listFiles();
        DefaultMutableTreeNode nodoA = new DefaultMutableTreeNode("Archivos CSV");
        DefaultTreeModel model = (DefaultTreeModel) jTree_archivo.getModel();
        model.setRoot(nodoA);
        if (a != null) {
            for (File file : a) {
                if (file.getPath().contains(".txt")) {
                    DefaultMutableTreeNode nodoN = new DefaultMutableTreeNode(file.getName());
                    nodoA.add(nodoN);
                }
            }
            jTree_archivo.setModel(model);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_enter;
    private javax.swing.JMenuItem jM_ClearCL;
    private javax.swing.JMenu jM_clear;
    private javax.swing.JMenu jM_help;
    private javax.swing.JMenuItem jM_refreshTree;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_productos;
    private javax.swing.JTree jTree_archivo;
    private javax.swing.JMenuItem jmi_EstructuraP;
    private javax.swing.JMenuItem jmi_cleartable;
    private javax.swing.JMenuItem jmi_commands;
    private javax.swing.JMenuItem jmi_import;
    private javax.swing.JMenuItem jmi_loadFile;
    private javax.swing.JMenuItem jmi_new;
    private javax.swing.JMenuItem jmi_refresh;
    private javax.swing.JPopupMenu jppm_table;
    private javax.swing.JPopupMenu jppm_tree;
    private javax.swing.JTextField jtf_lineaComando;
    // End of variables declaration//GEN-END:variables
    static Scanner leer = new Scanner(System.in);
    Producto pr = new Producto();
}
