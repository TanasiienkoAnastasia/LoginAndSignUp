package Home;

import HistoryOfDownloadings.HistoryOfDownloading;
import DownloadManager.DownloadManager;
import GeneralCommands.CommandLogOut;
import Home.Commands.CommandSwitchToStartDownloadingPage;
import StatisticsOfDownloading.StatisticsOfDownloading;
import Login.Login;
import UserPage.UserPage;


public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
    }
    
    public void setUser(String name){
        user.setText("Welcome! "+name);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        DateStatistics = new javax.swing.JButton();
        HistoryOfDownloading = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        User = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        NewDownloading = new java.awt.Button();
        user = new javax.swing.JLabel();
        LogOutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setPreferredSize(new java.awt.Dimension(680, 530));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(680, 530));

        DateStatistics.setBackground(new java.awt.Color(153, 255, 153));
        DateStatistics.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DateStatistics.setText("View statistics of downloading.......");
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/3.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/4.png"))); // NOI18N

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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/5.png"))); // NOI18N

        NewDownloading.setBackground(new java.awt.Color(255, 102, 102));
        NewDownloading.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NewDownloading.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        NewDownloading.setLabel("Start new downloading .....");
        NewDownloading.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewDownloadingActionPerformed(evt);
            }
        });

        user.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(0, 102, 102));
        user.setText("Home page of download manager .....");

        LogOutBtn.setBackground(new java.awt.Color(204, 204, 255));
        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogOutBtn.setText("Log out");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DateStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(User, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(HistoryOfDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NewDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DateStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HistoryOfDownloading, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
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

    private void DateStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateStatisticsActionPerformed
                StatisticsOfDownloading DateStatisticsOfDownloadingFrame = new StatisticsOfDownloading();
                DateStatisticsOfDownloadingFrame.setVisible(true);
                DateStatisticsOfDownloadingFrame.pack();
                DateStatisticsOfDownloadingFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_DateStatisticsActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
                UserPage UserFrame = new UserPage();
                UserFrame.setVisible(true);
                UserFrame.pack();
                UserFrame.setLocationRelativeTo(null); 
                this.dispose();
    }//GEN-LAST:event_UserActionPerformed

    private void NewDownloadingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewDownloadingActionPerformed
                CommandSwitchToStartDownloadingPage switchToStartDownloadingPage = new CommandSwitchToStartDownloadingPage();
                switchToStartDownloadingPage.switchToStartDownloadingPage();
                this.dispose();
    }//GEN-LAST:event_NewDownloadingActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
       CommandLogOut logOut = new CommandLogOut();
       logOut.logOut();
       this.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DateStatistics;
    private javax.swing.JButton HistoryOfDownloading;
    private javax.swing.JButton LogOutBtn;
    private java.awt.Button NewDownloading;
    private javax.swing.JButton User;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
