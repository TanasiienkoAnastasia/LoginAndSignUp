package loginsignup;


public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
    }
    
    public void setUser(String name){
        user.setText(name);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CategoryStatistics = new javax.swing.JButton();
        DateStatistics = new javax.swing.JButton();
        HistoryOfDownloading = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        NewDownloading = new java.awt.Button();
        user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setPreferredSize(new java.awt.Dimension(680, 530));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 530));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("WELCOME,  ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("IN DOWNLOAD MANAGER");

        CategoryStatistics.setBackground(new java.awt.Color(153, 255, 153));
        CategoryStatistics.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CategoryStatistics.setText("View category statistics .......");
        CategoryStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CategoryStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryStatisticsActionPerformed(evt);
            }
        });

        DateStatistics.setBackground(new java.awt.Color(153, 255, 153));
        DateStatistics.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DateStatistics.setText("View date statistics .......");
        DateStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        DateStatistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateStatisticsActionPerformed(evt);
            }
        });

        HistoryOfDownloading.setBackground(new java.awt.Color(153, 255, 153));
        HistoryOfDownloading.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HistoryOfDownloading.setText("View history of downloading .......");
        HistoryOfDownloading.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        HistoryOfDownloading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryOfDownloadingActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsignup/2.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsignup/3.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsignup/4.png"))); // NOI18N

        User.setBackground(new java.awt.Color(153, 255, 153));
        User.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        User.setText("User page ......");
        User.setToolTipText("");
        User.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginsignup/5.png"))); // NOI18N

        NewDownloading.setBackground(new java.awt.Color(255, 102, 102));
        NewDownloading.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NewDownloading.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NewDownloading.setLabel("Start new downloading .....");
        NewDownloading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDownloadingActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        user.setForeground(new java.awt.Color(0, 51, 51));
        user.setText("NASTYA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CategoryStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HistoryOfDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(NewDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DateStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(CategoryStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HistoryOfDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("HOME");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HistoryOfDownloadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoryOfDownloadingActionPerformed
                HistoryOfDownloading HistoryOfDownloadingFrame = new HistoryOfDownloading();
                HistoryOfDownloadingFrame.setVisible(true);
                HistoryOfDownloadingFrame.pack();
                HistoryOfDownloadingFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_HistoryOfDownloadingActionPerformed

    private void CategoryStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryStatisticsActionPerformed
                CategoryStatisticsOfDownloading CategoryStatisticsOfDownloadingFrame = new CategoryStatisticsOfDownloading();
                CategoryStatisticsOfDownloadingFrame.setVisible(true);
                CategoryStatisticsOfDownloadingFrame.pack();
                CategoryStatisticsOfDownloadingFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_CategoryStatisticsActionPerformed

    private void DateStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateStatisticsActionPerformed
                DateStatisticsOfDownloading DateStatisticsOfDownloadingFrame = new DateStatisticsOfDownloading();
                DateStatisticsOfDownloadingFrame.setVisible(true);
                DateStatisticsOfDownloadingFrame.pack();
                DateStatisticsOfDownloadingFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_DateStatisticsActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
                User UserFrame = new User();
                UserFrame.setVisible(true);
                UserFrame.pack();
                UserFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_UserActionPerformed

    private void NewDownloadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDownloadingActionPerformed
                DownloadManager DownloadManagerFrame = new DownloadManager();
                DownloadManagerFrame.setVisible(true);
                DownloadManagerFrame.pack();
                DownloadManagerFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_NewDownloadingActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CategoryStatistics;
    private javax.swing.JButton DateStatistics;
    private javax.swing.JButton HistoryOfDownloading;
    private java.awt.Button NewDownloading;
    private javax.swing.JButton User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
