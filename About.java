

public class About extends javax.swing.JFrame {
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/** Creates new form About */
    public About() {
        initComponents();
        this.setLocation(420, 250);
        this.setResizable(false);
    }

     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {
     	javax.swing.JLabel ThanksLabel = new javax.swing.JLabel();
     	
         javax.swing.JLabel appTitleLabel = new javax.swing.JLabel();
         javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
         javax.swing.JLabel versionLabel = new javax.swing.JLabel();
         javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
         javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
         javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
         javax.swing.JLabel appVendorLabel = new javax.swing.JLabel();
         javax.swing.JLabel appHomepageLabel = new javax.swing.JLabel();
         jButton1 = new javax.swing.JButton();
         jButton2 = new javax.swing.JButton();
         jLabel1 = new javax.swing.JLabel();

         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

         appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel.getFont().getSize()+4));
         appTitleLabel.setText("TXE 1.6");

         appDescLabel.setText("A easy to use text editor with basic editing functions with steady updates.");

         versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
         versionLabel.setText("Product Version:");

         vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
         vendorLabel.setText("Developer:");
         
         ThanksLabel.setFont(ThanksLabel.getFont().deriveFont(ThanksLabel.getFont().getStyle() | java.awt.Font.BOLD));
         ThanksLabel.setText("Special Thanks To:");
         
         homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
         homepageLabel.setText("Website:");

         appVersionLabel.setText("1.6.5 Alpha");

         appVendorLabel.setText("Eric Zhu of Great Ark Studios And Font Chooser from the Open Source Project made by Masahiko SAWAI Copyright 2004-2005,2007-2008 All Rights Reserved.");

         appHomepageLabel.setText("http://greatarkstudios.weebly.com. And the Open Source Font Chooser At http://jfontchooser.sourceforge.jp/site/jfontchooser/download.html");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(versionLabel)
                                    .addComponent(vendorLabel)
                                    .addComponent(homepageLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(appVendorLabel)
                                    .addComponent(appVersionLabel)
                                    .addComponent(appHomepageLabel)))
                            .addComponent(appTitleLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appDescLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(appTitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appDescLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(versionLabel)
                            .addComponent(appVersionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendorLabel)
                            .addComponent(appVendorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(homepageLabel)
                            .addComponent(appHomepageLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        this.setVisible(false);
 
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
