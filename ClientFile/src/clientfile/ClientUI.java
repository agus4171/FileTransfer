/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientfile;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import objectfile.ObjectFile;

/**
 *
 * @author MAgus
 */
public class ClientUI extends javax.swing.JFrame {

    /**
     * Creates new form ServerForm
     */
    public ClientUI() {
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

        pilihFile = new javax.swing.JFileChooser();
        downloadFile = new javax.swing.JFileChooser();
        host = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        port = new javax.swing.JTextField();
        Host = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        Port = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        userAktif = new javax.swing.JLabel();
        fileClient = new javax.swing.JLabel();
        listUser = new javax.swing.JButton();
        file = new javax.swing.JButton();
        kirim = new javax.swing.JButton();
        konek = new javax.swing.JButton();
        listFile = new javax.swing.JButton();
        download = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();

        downloadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadFileActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 51));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(500, 620));
        setPreferredSize(new java.awt.Dimension(500, 620));
        setResizable(false);

        host.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        host.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        host.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });

        port.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        port.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        Host.setFont(new java.awt.Font("Bobcaygeon BRK", 0, 22)); // NOI18N
        Host.setText("Host");

        User.setFont(new java.awt.Font("Bobcaygeon BRK", 0, 22)); // NOI18N
        User.setText("Username");

        Port.setFont(new java.awt.Font("Bobcaygeon BRK", 0, 22)); // NOI18N
        Port.setText("Port");

        welcome.setFont(new java.awt.Font("Bullpen 3D", 1, 36)); // NOI18N
        welcome.setText("FILE TRANSFER");

        userAktif.setFont(new java.awt.Font("SF DecoTechno", 0, 24)); // NOI18N
        userAktif.setText("Pilih User");

        fileClient.setFont(new java.awt.Font("SF DecoTechno", 0, 24)); // NOI18N
        fileClient.setText("Pilih FIle");

        listUser.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        listUser.setText("List User");
        listUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listUserActionPerformed(evt);
            }
        });

        file.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        file.setText("Pilih File");
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });

        kirim.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        kirim.setText("Kirim");
        kirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kirimActionPerformed(evt);
            }
        });

        konek.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        konek.setText("Connect");
        konek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konekActionPerformed(evt);
            }
        });

        listFile.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        listFile.setText("List File");
        listFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listFileActionPerformed(evt);
            }
        });

        download.setFont(new java.awt.Font("Horizon BT", 0, 20)); // NOI18N
        download.setText("Download");
        download.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadActionPerformed(evt);
            }
        });

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jList2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(jList2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kirim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(listUser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(userAktif)))
                .addGap(185, 207, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Host)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Port)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(User))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(konek, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(listFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(fileClient))
                            .addComponent(download))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(welcome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User)
                    .addComponent(Port)
                    .addComponent(Host, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(konek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listUser)
                    .addComponent(userAktif))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file)
                    .addComponent(kirim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listFile)
                    .addComponent(fileClient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(download)
                .addGap(750, 750, 750))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private Socket socketClient;
    private ObjectInputStream ois = null;
    private ObjectOutputStream ous = null;
    private String fnama;
    private File fileChoose;
    private String userRecv;
    private String nama;
    private ArrayList<String> lUser;
    private ArrayList<String> lFile;
    private DefaultListModel data;
    private ObjectFile objf;
    private DataInputStream diStream = null;
    private DataOutputStream doStream = null;
    private JList list = null;
    private String pilih;

    private void kirim(ObjectFile file) {
        try {
            ous.writeObject(file);
            ous.flush();
            ous.reset();
        } catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void hostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hostActionPerformed

    private void konekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konekActionPerformed
        // TODO add your handling code here:

        try {
            socketClient = new Socket(host.getText(), Integer.parseInt(port.getText()));
            ois = new ObjectInputStream(socketClient.getInputStream());
            ous = new ObjectOutputStream(socketClient.getOutputStream());
            objf = new ObjectFile();
            objf.setUser(user.getText());
            objf.setCommand("CONNECT");
            kirim(objf);

        } catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_konekActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void listUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listUserActionPerformed
        // TODO add your handling code here:
        //objf = new ObjectFile();
        objf.setCommand("GET USER");
        try {
            kirim(objf);
            lUser = (ArrayList<String>) ois.readObject();
            data = new DefaultListModel();
            for (int i = 0; i < lUser.size(); i++) {
                data.addElement(lUser.get(i));
                System.out.println(lUser.get(i));
            }
            jList1.setModel(data);
        } catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listUserActionPerformed

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
        int returnVal = pilihFile.showOpenDialog(this);
        if (returnVal == pilihFile.APPROVE_OPTION) {
            fileChoose = pilihFile.getSelectedFile();
            pilihFile.setMultiSelectionEnabled(true);

            JFileChooser fc = new JFileChooser();
            fnama = fileChoose.toString();
            JOptionPane.showMessageDialog(ClientUI.this, fnama);
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_fileActionPerformed

    private void kirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kirimActionPerformed
        try {
            // TODO add your handling code here:
            byte[] bytef = new byte[(int) fileChoose.length()];
            diStream = new DataInputStream(new FileInputStream(fileChoose));
            diStream.read(bytef);
            objf.setIsi(bytef);
            objf.setNama(fileChoose.getName());
            String selected = jList1.getSelectedValue().toString();
            objf.setUser(selected);
            objf.setCommand("SEND");
            kirim(objf);
            diStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kirimActionPerformed

    private void listFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listFileActionPerformed
        // TODO add your handling code here:
        //objf = new ObjectFile();
        objf.setCommand("GET FILE");
        try {
            kirim(objf);
            lFile = (ArrayList<String>) ois.readObject();
            data = new DefaultListModel();
            for (int i = 0; i < lFile.size(); i++) {
                data.addElement(lFile.get(i));
            }
            jList2.setModel(data);
        } catch (IOException ex) {
        } catch (ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_listFileActionPerformed

    private void downloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadActionPerformed
        // TODO add your handling code here:
        String selectedF = jList2.getSelectedValue().toString();
        System.out.println("file" + selectedF);
        JOptionPane.showMessageDialog(ClientUI.this, selectedF);
        objf.setCommand("DOWNLOAD");
        objf.setNama(selectedF);
        kirim(objf);
        try {
            downloadFile.showSaveDialog(null);
            fileChoose = downloadFile.getSelectedFile();
            objf = (ObjectFile) ois.readObject();
            doStream = new DataOutputStream(new FileOutputStream(fileChoose));
            doStream.write(objf.getIsi());
            doStream.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClientUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_downloadActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void downloadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadFileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downloadFileActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

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
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClientUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Host;
    private javax.swing.JLabel Port;
    private javax.swing.JLabel User;
    private javax.swing.JButton download;
    private javax.swing.JFileChooser downloadFile;
    private javax.swing.JButton file;
    private javax.swing.JLabel fileClient;
    private javax.swing.JTextField host;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kirim;
    private javax.swing.JButton konek;
    private javax.swing.JButton listFile;
    private javax.swing.JButton listUser;
    private javax.swing.JFileChooser pilihFile;
    private javax.swing.JTextField port;
    private javax.swing.JTextField user;
    private javax.swing.JLabel userAktif;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}