/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nprfinal;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author nkhieu
 */
public class GeneralUI extends javax.swing.JFrame {

    DefaultListModel<User> model= new DefaultListModel<>();
    
   
    
    

    /**
     * Creates new form GeneralUI
     */
    public GeneralUI() {
      initComponents();
      activeUserList.setModel(model);
      model.addElement(new User("all","heyyyy"));
      model.addElement(new User("user 1","Hello"));
      model.addElement(new User("user 2","Hi! How are you?"));
      model.addElement(new User("user 3","Xin chao"));
      model.addElement(new User("user 4","Eiii"));
      model.addElement(new User("user 5","Alooooo"));

     
      activeUserList.getSelectionModel().addListSelectionListener(e ->{
          
          User activeUser = activeUserList.getSelectedValue();
          
          userInfoLbl.setText(activeUser.getName());
          msgLbl.setText(activeUser.getName()+ ": "+ activeUser.getMessage());
          
          
          countLbl.setText((activeUserList.getSize()).toString());
          
      });
    }
   
    
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        activePanel = new javax.swing.JPanel();
        activeScroll = new javax.swing.JScrollPane();
        activeUserList = new javax.swing.JList<>();
        activeInfoPanel = new javax.swing.JPanel();
        activeUsersLbl = new javax.swing.JLabel();
        countLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        sendBtn = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        userInfoLbl = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        msgPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        msgLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        activeScroll.setViewportView(activeUserList);

        activeUsersLbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        activeUsersLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activeUsersLbl.setText("Active Users");
        activeUsersLbl.setToolTipText("");

        countLbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        countLbl.setToolTipText("");

        javax.swing.GroupLayout activeInfoPanelLayout = new javax.swing.GroupLayout(activeInfoPanel);
        activeInfoPanel.setLayout(activeInfoPanelLayout);
        activeInfoPanelLayout.setHorizontalGroup(
            activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activeUsersLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(countLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        activeInfoPanelLayout.setVerticalGroup(
            activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(countLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(activeUsersLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout activePanelLayout = new javax.swing.GroupLayout(activePanel);
        activePanel.setLayout(activePanelLayout);
        activePanelLayout.setHorizontalGroup(
            activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(activeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(activeInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        activePanelLayout.setVerticalGroup(
            activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activePanelLayout.createSequentialGroup()
                .addComponent(activeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(activeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        sendBtn.setText("Send");

        userInfoLbl.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        userInfoLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userInfoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userInfoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("File");

        msgPanel.setLayout(new java.awt.CardLayout());

        msgLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        msgLbl.setText("alooooo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        msgPanel.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(msgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(activePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
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
            java.util.logging.Logger.getLogger(GeneralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralUI().setVisible(true);
                
            }
        });
        
     }

    private static class JLable extends JLabel {

        public JLable() {
        }
    }
    
    private class User{
       
        String name;
        String message;

        public User(String name,String message) {
            
            this.name = name;
            this.message = message;
        }
        
        

        public String getMessage() {
            return message;
        }
        

        public String getName() {
            return name;
        }

        public void setMessage(String message) {
            this.message = message;
        }
        
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }

        

    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel activeInfoPanel;
    private javax.swing.JPanel activePanel;
    private javax.swing.JScrollPane activeScroll;
    private javax.swing.JList<User> activeUserList;
    private javax.swing.JLabel activeUsersLbl;
    private javax.swing.JLabel countLbl;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JPanel msgPanel;
    private javax.swing.JButton sendBtn;
    private javax.swing.JLabel userInfoLbl;
    // End of variables declaration//GEN-END:variables
}

