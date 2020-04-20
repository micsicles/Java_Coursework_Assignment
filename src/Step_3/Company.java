// Author Michael Burns :- B0035365 date 17/03/2020
//Referances that helped with the below code can be seen in the Coursework Report

package Step_3;

import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author micsg
 */
public class Company extends javax.swing.JFrame {

    /**
     * Creates new form Company
     */
    public Company() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ProjectsTree = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        addProjectButton = new javax.swing.JButton();
        addDatesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addCompanyButton = new javax.swing.JButton();
        companyNameTextField = new javax.swing.JTextField();
        projectNameTextField = new javax.swing.JTextField();
        datesTextField = new javax.swing.JTextField();
        warningLabel = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();
        AddTeamMembers = new javax.swing.JButton();
        Displayall = new javax.swing.JButton();
        projectNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Company's");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Hack M");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Web Development");
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("01/01/2020");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("12/06/2021");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("UWS");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Reception");
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("12/7/20");
        treeNode3.add(treeNode4);
        treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("13/7/20");
        treeNode3.add(treeNode4);
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        ProjectsTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ProjectsTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProjectsTreeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProjectsTree);

        jLabel1.setText("Enter Project name");

        addProjectButton.setText("Add Project");
        addProjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProjectButtonActionPerformed(evt);
            }
        });

        addDatesButton.setText("Add Dates");
        addDatesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDatesButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Dates");

        jLabel3.setText("Enter Company Name");

        addCompanyButton.setText("Add Company");
        addCompanyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompanyButtonActionPerformed(evt);
            }
        });

        companyNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyNameTextFieldActionPerformed(evt);
            }
        });

        warningLabel.setForeground(new java.awt.Color(255, 0, 51));

        Delete.setText("Remove");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        AddTeamMembers.setText("Add Team Members");
        AddTeamMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTeamMembersMouseClicked(evt);
            }
        });
        AddTeamMembers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTeamMembersActionPerformed(evt);
            }
        });

        Displayall.setText("Dispaly all");
        Displayall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayallMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(warningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(companyNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                            .addComponent(projectNameTextField)
                                            .addComponent(datesTextField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(AddTeamMembers, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(projectNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Displayall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addDatesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addCompanyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addProjectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addCompanyButton)
                            .addComponent(companyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addProjectButton)
                            .addComponent(jLabel1)
                            .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(datesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addDatesButton))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(Delete)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(projectNameLabel)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Displayall)
                            .addComponent(AddTeamMembers))
                        .addGap(41, 41, 41)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // the selecting and preventing to select company only to enter the date is still not working.
    private void addProjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProjectButtonActionPerformed
        warningLabel.setText(" ");
        DefaultTreeModel model=(DefaultTreeModel)ProjectsTree.getModel();
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode)ProjectsTree.getLastSelectedPathComponent();
        DefaultMutableTreeNode newProject = new DefaultMutableTreeNode(projectNameTextField.getText());
        if(selectedNode.isRoot()){
            warningLabel.setText("You must select company to enter projects");
        }else{
                if(selectedNode != null){
                    if(!projectNameTextField.getText().trim().equals("")){
                        model.insertNodeInto(newProject, selectedNode, selectedNode.getChildCount());
                    }else{
                        warningLabel.setText("You must Enter Project");
                    }
                }else{
                    warningLabel.setText("You must Select a Company to insert the project");
                }
                projectNameTextField.setText(" ");
            }
    }//GEN-LAST:event_addProjectButtonActionPerformed
    
    private void addCompanyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompanyButtonActionPerformed
        warningLabel.setText(" ");
        DefaultTreeModel model=(DefaultTreeModel)ProjectsTree.getModel();
        DefaultMutableTreeNode root =(DefaultMutableTreeNode)model.getRoot();
        if(!companyNameTextField.getText().trim().equals("")){
        root.add(new DefaultMutableTreeNode(companyNameTextField.getText()));
        model.reload();
    }else{ 
            warningLabel.setText("You must Enter Company in the text field");
        }
         companyNameTextField.setText(" ");
    }//GEN-LAST:event_addCompanyButtonActionPerformed

    private void companyNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyNameTextFieldActionPerformed

    // the selecting and preventing to select projects only to enter the date is still not working.
    private void addDatesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDatesButtonActionPerformed
        warningLabel.setText(" ");
        DefaultTreeModel model=(DefaultTreeModel)ProjectsTree.getModel();
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode)ProjectsTree.getLastSelectedPathComponent();
        DefaultMutableTreeNode newDates = new DefaultMutableTreeNode(datesTextField.getText());
         //if(selectedNode.isRoot()){                                                                                         
         //   warningLabel.setText("You must select a Project");    // without this shows the error message 
       // }else
       {
        if(selectedNode != null){
            if(!datesTextField.getText().trim().equals("")){
                model.insertNodeInto(newDates, selectedNode, selectedNode.getChildCount());
            }else{
                warningLabel.setText("You must Enter Start date or End date");
            }
        }else{
            warningLabel.setText("You must Select a Project to insert dates");
        }
       }
        datesTextField.setText(" ");
    }//GEN-LAST:event_addDatesButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        warningLabel.setText(" ");
        DefaultTreeModel model=(DefaultTreeModel)ProjectsTree.getModel();
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode)ProjectsTree.getLastSelectedPathComponent();        
        if(selectedNode.isRoot()){
            warningLabel.setText("You can't delete root");          
    }else{        
    if(selectedNode !=null){
        model.removeNodeFromParent(selectedNode);
    }else{
        warningLabel.setText("You must choose a project or date to delete");
        }
      }
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddTeamMembersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTeamMembersActionPerformed
       
    }//GEN-LAST:event_AddTeamMembersActionPerformed

    private void AddTeamMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTeamMembersMouseClicked
        DefaultTreeModel model=(DefaultTreeModel)ProjectsTree.getModel();
        DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode)ProjectsTree.getLastSelectedPathComponent();       
    if(selectedNode ==null){
        warningLabel.setText("You must choose a valid project to continue");
    }else{
        this.toBack();
        TeamMemberTest tmt = new TeamMemberTest();
        tmt.setVisible(true);
        tmt.toFront();
        tmt.pack();
        tmt.setLocationRelativeTo(null);        
        this.dispose(); 
    }
    }//GEN-LAST:event_AddTeamMembersMouseClicked
    
//looking to transfer the selected project into the projects of team member when looking to add member to the project.
     
    private void ProjectsTreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProjectsTreeMouseClicked
    DefaultMutableTreeNode selectedNode =(DefaultMutableTreeNode)ProjectsTree.getSelectionPath().getLastPathComponent();
    projectNameLabel.setText(selectedNode.getUserObject().toString());
    

          
    }//GEN-LAST:event_ProjectsTreeMouseClicked

    private void DisplayallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayallMouseClicked
        this.toBack();
        BinarySearchTree bst = new BinarySearchTree();
        bst.setVisible(true);
        bst.toFront();
        bst.pack();
        bst.setLocationRelativeTo(null);        
        this.dispose();
    }//GEN-LAST:event_DisplayallMouseClicked
    
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
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTeamMembers;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Displayall;
    public static javax.swing.JTree ProjectsTree;
    private javax.swing.JButton addCompanyButton;
    private javax.swing.JButton addDatesButton;
    private javax.swing.JButton addProjectButton;
    private javax.swing.JTextField companyNameTextField;
    private javax.swing.JTextField datesTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel projectNameLabel;
    private javax.swing.JTextField projectNameTextField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
