package javaapplication1;/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gavin
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    //
    private void initComponents() {

        player2Name = new javax.swing.JLabel();
        player1Name = new javax.swing.JLabel();
        player5Name = new javax.swing.JLabel();
        player4Name = new javax.swing.JLabel();
        player3Name = new javax.swing.JLabel();
        playerBidSubmitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        perviousBidTextDisplay = new javax.swing.JTextPane();
        challengePlayer = new javax.swing.JButton();
        playerBidInput = new javax.swing.JTextField();
        player1Die1 = new javax.swing.JLabel();
        player1Die2 = new javax.swing.JLabel();
        player1Die3 = new javax.swing.JLabel();
        player1Die4 = new javax.swing.JLabel();
        player1Die5 = new javax.swing.JLabel();
        player2Die1 = new javax.swing.JLabel();
        player5Die1 = new javax.swing.JLabel();
        player2Die3 = new javax.swing.JLabel();
        player2Die4 = new javax.swing.JLabel();
        player2Die5 = new javax.swing.JLabel();
        player2Die2 = new javax.swing.JLabel();
        player5Die2 = new javax.swing.JLabel();
        player5Die3 = new javax.swing.JLabel();
        player5Die4 = new javax.swing.JLabel();
        player5Die5 = new javax.swing.JLabel();
        player4Die1 = new javax.swing.JLabel();
        player3Die2 = new javax.swing.JLabel();
        player3Die3 = new javax.swing.JLabel();
        player3Die4 = new javax.swing.JLabel();
        player3Die5 = new javax.swing.JLabel();
        player3Die1 = new javax.swing.JLabel();
        player4Die2 = new javax.swing.JLabel();
        player4Die3 = new javax.swing.JLabel();
        player4Die4 = new javax.swing.JLabel();
        player4Die5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        hostGameMenuItem = new javax.swing.JMenu();
        joinGameMenuItem = new javax.swing.JMenu();
        exitGameMenuItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        player2Name.setText("jLabel1");

        player1Name.setText("jLabel1");

        player5Name.setText("jLabel1");

        player4Name.setText("jLabel1");

        player3Name.setText("jLabel1");

        playerBidSubmitButton.setText("jButton1");
        playerBidSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerBidSubmitButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(perviousBidTextDisplay);

        challengePlayer.setText("jButton3");

        playerBidInput.setText("jTextField1");

        player1Die1.setBackground(new java.awt.Color(255, 255, 255));
        player1Die1.setOpaque(true);
        player1Die1.setPreferredSize(new java.awt.Dimension(80, 80));

        player1Die2.setBackground(new java.awt.Color(255, 255, 255));
        player1Die2.setOpaque(true);
        player1Die2.setPreferredSize(new java.awt.Dimension(80, 80));

        player1Die3.setBackground(new java.awt.Color(255, 255, 255));
        player1Die3.setOpaque(true);
        player1Die3.setPreferredSize(new java.awt.Dimension(80, 80));

        player1Die4.setBackground(new java.awt.Color(255, 255, 255));
        player1Die4.setOpaque(true);
        player1Die4.setPreferredSize(new java.awt.Dimension(80, 80));

        player1Die5.setBackground(new java.awt.Color(255, 255, 255));
        player1Die5.setOpaque(true);
        player1Die5.setPreferredSize(new java.awt.Dimension(80, 80));

        player2Die1.setBackground(new java.awt.Color(255, 255, 255));
        player2Die1.setOpaque(true);
        player2Die1.setPreferredSize(new java.awt.Dimension(80, 80));

        player5Die1.setBackground(new java.awt.Color(255, 255, 255));
        player5Die1.setOpaque(true);
        player5Die1.setPreferredSize(new java.awt.Dimension(80, 80));

        player2Die3.setBackground(new java.awt.Color(255, 255, 255));
        player2Die3.setOpaque(true);
        player2Die3.setPreferredSize(new java.awt.Dimension(80, 80));

        player2Die4.setBackground(new java.awt.Color(255, 255, 255));
        player2Die4.setOpaque(true);
        player2Die4.setPreferredSize(new java.awt.Dimension(80, 80));

        player2Die5.setBackground(new java.awt.Color(255, 255, 255));
        player2Die5.setOpaque(true);
        player2Die5.setPreferredSize(new java.awt.Dimension(80, 80));

        player2Die2.setBackground(new java.awt.Color(255, 255, 255));
        player2Die2.setOpaque(true);
        player2Die2.setPreferredSize(new java.awt.Dimension(80, 80));

        player5Die2.setBackground(new java.awt.Color(255, 255, 255));
        player5Die2.setOpaque(true);
        player5Die2.setPreferredSize(new java.awt.Dimension(80, 80));

        player5Die3.setBackground(new java.awt.Color(255, 255, 255));
        player5Die3.setOpaque(true);
        player5Die3.setPreferredSize(new java.awt.Dimension(80, 80));

        player5Die4.setBackground(new java.awt.Color(255, 255, 255));
        player5Die4.setOpaque(true);
        player5Die4.setPreferredSize(new java.awt.Dimension(80, 80));

        player5Die5.setBackground(new java.awt.Color(255, 255, 255));
        player5Die5.setOpaque(true);
        player5Die5.setPreferredSize(new java.awt.Dimension(80, 80));

        player4Die1.setBackground(new java.awt.Color(255, 255, 255));
        player4Die1.setOpaque(true);
        player4Die1.setPreferredSize(new java.awt.Dimension(80, 80));

        player3Die2.setBackground(new java.awt.Color(255, 255, 255));
        player3Die2.setOpaque(true);
        player3Die2.setPreferredSize(new java.awt.Dimension(80, 80));

        player3Die3.setBackground(new java.awt.Color(255, 255, 255));
        player3Die3.setOpaque(true);
        player3Die3.setPreferredSize(new java.awt.Dimension(80, 80));

        player3Die4.setBackground(new java.awt.Color(255, 255, 255));
        player3Die4.setOpaque(true);
        player3Die4.setPreferredSize(new java.awt.Dimension(80, 80));

        player3Die5.setBackground(new java.awt.Color(255, 255, 255));
        player3Die5.setOpaque(true);
        player3Die5.setPreferredSize(new java.awt.Dimension(80, 80));

        player3Die1.setBackground(new java.awt.Color(255, 255, 255));
        player3Die1.setOpaque(true);
        player3Die1.setPreferredSize(new java.awt.Dimension(80, 80));

        player4Die2.setBackground(new java.awt.Color(255, 255, 255));
        player4Die2.setOpaque(true);
        player4Die2.setPreferredSize(new java.awt.Dimension(80, 80));

        player4Die3.setBackground(new java.awt.Color(255, 255, 255));
        player4Die3.setOpaque(true);
        player4Die3.setPreferredSize(new java.awt.Dimension(80, 80));

        player4Die4.setBackground(new java.awt.Color(255, 255, 255));
        player4Die4.setOpaque(true);
        player4Die4.setPreferredSize(new java.awt.Dimension(80, 80));

        player4Die5.setBackground(new java.awt.Color(255, 255, 255));
        player4Die5.setOpaque(true);
        player4Die5.setPreferredSize(new java.awt.Dimension(80, 80));

        hostGameMenuItem.setText("Host Game");
        jMenuBar1.add(hostGameMenuItem);

        joinGameMenuItem.setText("Join Game");
        jMenuBar1.add(joinGameMenuItem);

        exitGameMenuItem.setText("Exit Game");
        jMenuBar1.add(exitGameMenuItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(player5Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player5Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(player5Name)
                        .addGap(112, 112, 112)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(playerBidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(playerBidSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(player2Name))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(challengePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(player1Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player1Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player1Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player1Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(player1Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(player1Name)
                                .addGap(219, 219, 219)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(player2Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(player4Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player4Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player4Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player4Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player4Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player3Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(player3Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(player4Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player3Name)
                .addGap(419, 419, 419))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player4Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player4Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player4Name))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(player3Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player3Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(player3Name)))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player2Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player2Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(player2Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(player2Name)))
                        .addGap(18, 18, 18)
                        .addComponent(player2Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player2Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(playerBidInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerBidSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(285, 285, 285))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player5Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player5Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(player5Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(player5Name)
                                .addGap(49, 49, 49)))
                        .addComponent(player5Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player5Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(player1Name)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(player1Die2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1Die1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1Die3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1Die4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(player1Die5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(challengePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playerBidSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerBidSubmitButtonActionPerformed

    }//GEN-LAST:event_playerBidSubmitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton challengePlayer;
    private javax.swing.JMenu exitGameMenuItem;
    private javax.swing.JMenu hostGameMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu joinGameMenuItem;
    private javax.swing.JTextPane perviousBidTextDisplay;
    private javax.swing.JLabel player1Die1;
    private javax.swing.JLabel player1Die2;
    private javax.swing.JLabel player1Die3;
    private javax.swing.JLabel player1Die4;
    private javax.swing.JLabel player1Die5;
    private javax.swing.JLabel player1Name;
    private javax.swing.JLabel player2Die1;
    private javax.swing.JLabel player2Die2;
    private javax.swing.JLabel player2Die3;
    private javax.swing.JLabel player2Die4;
    private javax.swing.JLabel player2Die5;
    private javax.swing.JLabel player2Name;
    private javax.swing.JLabel player3Die1;
    private javax.swing.JLabel player3Die2;
    private javax.swing.JLabel player3Die3;
    private javax.swing.JLabel player3Die4;
    private javax.swing.JLabel player3Die5;
    private javax.swing.JLabel player3Name;
    private javax.swing.JLabel player4Die1;
    private javax.swing.JLabel player4Die2;
    private javax.swing.JLabel player4Die3;
    private javax.swing.JLabel player4Die4;
    private javax.swing.JLabel player4Die5;
    private javax.swing.JLabel player4Name;
    private javax.swing.JLabel player5Die1;
    private javax.swing.JLabel player5Die2;
    private javax.swing.JLabel player5Die3;
    private javax.swing.JLabel player5Die4;
    private javax.swing.JLabel player5Die5;
    private javax.swing.JLabel player5Name;
    private javax.swing.JTextField playerBidInput;
    private javax.swing.JButton playerBidSubmitButton;
    // End of variables declaration//GEN-END:variables
}
