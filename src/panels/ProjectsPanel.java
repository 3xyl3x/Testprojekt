/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;

import database.DatabaseManager;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author david
 */
public class ProjectsPanel extends javax.swing.JPanel {
 private MainWindow window;
  private DatabaseManager dbm;
    /**
     * Creates new form EmployeesPanel
     */
    public ProjectsPanel(MainWindow window,DatabaseManager dbm) {
        this.window=window;
        this.dbm=dbm;
        initComponents();
        listProjects();
    }

        private void listProjects() {
               ArrayList<HashMap<String, String>> projects = dbm.getProjects();

            jTextArea1.setText(""); // Rensa tidigare text
            if (projects != null) {
                for (HashMap<String, String> rad : projects) {
   
                    jTextArea1.append("ID: " + rad.get("pid") + ", Namn: " + rad.get("projektnamn")+" "+rad.get("beskrivning") + "\n");
                }
            } else {
                jTextArea1.setText("Inga projekt hittades.");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setText("Lista över projekt");

        goBackButton.setText("< Tillbaka till start");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(goBackButton)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(goBackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
         window.showPanel("StartPanel");
    }//GEN-LAST:event_goBackButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}