/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panels;
import database.DatabaseManager;
import java.util.ArrayList;
import javax.swing.DefaultListModel; 
import models.Employee;

/**
 *
 * @author david
 */
public class EmployeesPanel extends javax.swing.JPanel {
 private MainWindow window;
 private DatabaseManager dbm;
 private DefaultListModel<Employee> listModel; 

    public EmployeesPanel(MainWindow window,DatabaseManager dbm) {
        this.window=window;
        this.dbm=dbm;
        initComponents();
      
        listModel = new DefaultListModel<>();
        employeeList.setModel(listModel); 
        listEmployees();
    }
    
    private void listEmployees() {
               ArrayList<Employee> employees = dbm.getEmployees();
               if (employees!=null) {
                   for (Employee emp : employees) {
                       listModel.addElement(emp);
                   }
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

        jLabel1 = new javax.swing.JLabel();
        goBackButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList<>();
        newEmployeeButton = new javax.swing.JButton();
        editEmployeeButton = new javax.swing.JButton();
        deleteEmployeeButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Lista över anställda");

        goBackButton.setText("< Tillbaka till start");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        employeeList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        employeeList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                employeeListValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(employeeList);

        newEmployeeButton.setText("Ny anställd");
        newEmployeeButton.setEnabled(false);
        newEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEmployeeButtonActionPerformed(evt);
            }
        });

        editEmployeeButton.setText("Ändra anställd");
        editEmployeeButton.setEnabled(false);

        deleteEmployeeButton.setText("Radera anställd");
        deleteEmployeeButton.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(goBackButton))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(goBackButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteEmployeeButton)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
           window.showPanel("StartPanel");
    }//GEN-LAST:event_goBackButtonActionPerformed

    private void newEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEmployeeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newEmployeeButtonActionPerformed

    // En anställd vald 
    private void employeeListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_employeeListValueChanged
       
       boolean isSelected = !employeeList.isSelectionEmpty();
       editEmployeeButton.setEnabled(isSelected);
       deleteEmployeeButton.setEnabled(isSelected);
    }//GEN-LAST:event_employeeListValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteEmployeeButton;
    private javax.swing.JButton editEmployeeButton;
    private javax.swing.JList<Employee> employeeList;
    private javax.swing.JButton goBackButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton newEmployeeButton;
    // End of variables declaration//GEN-END:variables
}
