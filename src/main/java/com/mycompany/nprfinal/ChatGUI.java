/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nprfinal;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.LEFT_ALIGNMENT;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.List;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author nkhieu
 */
public class ChatGUI extends javax.swing.JFrame {

    DefaultListModel<User> model = new DefaultListModel<>();
    JPanel chatContentPanel = new JPanel();
    JLabel receivedMessLbl = new JLable();
    JLabel yourMsgLbl = new JLable();

    JPanel userInfoPanel = new JPanel();
    JLabel userInfoLbl = new JLable();
    CardLayout cardLayout;
    public final String CHAT_CONTENT_PANEL = "chat content panel";
    
    /**
     * Creates new form ChatGUI
     */
    public ChatGUI() {
        initComponents();
        activeUserList.setModel(model);
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("All", "heyyyy"));
        users.add(new User("KhacHieu", "Hi! How are you?"));
        users.add(new User("ThanhHuyen", "Xin chao"));
        users.add(new User("ThanhTung", "Eiii"));
        users.add(new User("User4", "Alooooo"));
        users.add(new User("User5", "Aluuuuuuuuu"));
        cardLayout = (CardLayout) chatPanel.getLayout();
        HashMap<String, JPanel> listPanel = new HashMap<>();
        for(User u : users){
            model.addElement(u);
            JPanel newPanel = new JPanel();
            JLabel newLabel = new JLabel();
            newLabel.setText(u.getName());
            newPanel.add(newLabel);
            newPanel.setName(u.getName());
            listPanel.put(u.getName(), newPanel);
            chatPanel.add(u.getName(), newPanel);
        }
        activeUserList.getSelectionModel().addListSelectionListener(e ->  {
            if (e.getValueIsAdjusting())
            {
                //System.out.println("Adjusting. Ignore this");
                return;
            }
                User activeUser = activeUserList.getSelectedValue();
//                userInfoLbl.setText(activeUser.getName());
//                userInfoLbl.setFont(new Font("Verdana", Font.PLAIN, 25));
//                infoPanel.add(userInfoLbl);
//                receivedMessLbl.setText(activeUser.getName() + ": " + activeUser.getMessage());
//                receivedMessLbl.setFont(new Font("Verdana", Font.PLAIN, 15));
                JPanel currentPanel = listPanel.get(activeUser.getName());

                cardLayout.show(chatPanel, activeUser.getName());
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
        activeInfoPanel = new javax.swing.JPanel();
        countLbl = new javax.swing.JLabel();
        activeUsersLbl = new javax.swing.JLabel();
        activeScroll = new javax.swing.JScrollPane();
        activeUserList = new javax.swing.JList<>();
        infoPanel = new javax.swing.JPanel();
        chatPanel = new javax.swing.JPanel();
        msgPanel = new javax.swing.JPanel();
        fileBtn = new javax.swing.JButton();
        sendBtn = new javax.swing.JButton();
        msgJSP = new javax.swing.JScrollPane();
        msgT = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1012, 800));

        activeInfoPanel.setBackground(new java.awt.Color(255, 255, 255));

        countLbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        countLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        countLbl.setToolTipText("");

        activeUsersLbl.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        activeUsersLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        activeUsersLbl.setText("Active Users");
        activeUsersLbl.setToolTipText("");

        javax.swing.GroupLayout activeInfoPanelLayout = new javax.swing.GroupLayout(activeInfoPanel);
        activeInfoPanel.setLayout(activeInfoPanelLayout);
        activeInfoPanelLayout.setHorizontalGroup(
            activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activeInfoPanelLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addComponent(countLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(activeInfoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(activeUsersLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(113, Short.MAX_VALUE)))
        );
        activeInfoPanelLayout.setVerticalGroup(
            activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(activeInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(countLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(activeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(activeInfoPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(activeUsersLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        activeScroll.setViewportView(activeUserList);

        javax.swing.GroupLayout activePanelLayout = new javax.swing.GroupLayout(activePanel);
        activePanel.setLayout(activePanelLayout);
        activePanelLayout.setHorizontalGroup(
            activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(activePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(activeScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(activePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(activeInfoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        activePanelLayout.setVerticalGroup(
            activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, activePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(activeScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(activePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(activePanelLayout.createSequentialGroup()
                    .addComponent(activeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 650, Short.MAX_VALUE)))
        );

        infoPanel.setLayout(new java.awt.CardLayout());

        chatPanel.setLayout(new java.awt.CardLayout());

        fileBtn.setText("FILE");
        fileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBtnActionPerformed(evt);
            }
        });

        sendBtn.setText("SEND");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        msgT.setColumns(20);
        msgT.setRows(5);
        msgJSP.setViewportView(msgT);

        javax.swing.GroupLayout msgPanelLayout = new javax.swing.GroupLayout(msgPanel);
        msgPanel.setLayout(msgPanelLayout);
        msgPanelLayout.setHorizontalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(msgPanelLayout.createSequentialGroup()
                .addComponent(fileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgJSP, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        msgPanelLayout.setVerticalGroup(
            msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, msgPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(msgPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(msgJSP, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fileBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(activePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(infoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(activePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chatPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
//        FileNameExtensionFilter fileFilter= new FileNameExtensionFilter("fileName", "docx","jpg","png","pdf","xlsx");
//        fileChooser.setFileFilter(fileFilter);
        fileChooser.setMultiSelectionEnabled(false);

        int x = fileChooser.showDialog(this, "Choose file");
        if (x == JFileChooser.APPROVE_OPTION) {
            File f = fileChooser.getSelectedFile();
            msgT.setText(f.getAbsolutePath());
        }


    }//GEN-LAST:event_fileBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        String yourMsg= msgT.getText();
//        System.out.println(yourMsg);
        yourMsgLbl.setText(yourMsg);
        yourMsgLbl.setFont(new Font("Verdana", Font.PLAIN, 15));
        chatContentPanel.add(yourMsgLbl);
        chatPanel.add(chatContentPanel);
//        cardLayout.show(chatPanel,CHAT_CONTENT_PANEL);

        
        
    }//GEN-LAST:event_sendBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChatGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChatGUI().setVisible(true);
            }
        });
    }

    private static class JLable extends JLabel {

        public JLable() {
        }
    }

    private class User {

        String name;
        String message;

        public User(String name, String message) {

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
    private javax.swing.JPanel chatPanel;
    private javax.swing.JLabel countLbl;
    private javax.swing.JButton fileBtn;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JScrollPane msgJSP;
    private javax.swing.JPanel msgPanel;
    private javax.swing.JTextArea msgT;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}
