package StatisticsOfDownloading;

import GeneralCommands.CommandComeBackHome;
import GeneralCommands.CommandLogOut;
import Home.Commands.CommandSwitchToUserPage;
import Home.Home;
import Login.Login;
import StatisticsOfDownloading.Commands.CommandShowStatisticsOfDates;
import StatisticsOfDownloading.Commands.CommandShowStatisticsOfSites;
import StatisticsOfDownloading.Commands.CommandShowStatisticsOfSpeed;


public class StatisticsOfDownloading extends javax.swing.JFrame {

    
    public StatisticsOfDownloading() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ComeBack = new javax.swing.JButton();
        LogOutBtn = new javax.swing.JButton();
        StatisticsOfDates = new javax.swing.JButton();
        StatisticsOfSites = new javax.swing.JButton();
        StatisticsOfSpeed = new javax.swing.JButton();
        StatisticsOfVolume = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DateStatistics");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Date statistic of downloading .....");

        ComeBack.setBackground(new java.awt.Color(204, 255, 204));
        ComeBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ComeBack.setText("Come back to home page ....");
        ComeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComeBackActionPerformed(evt);
            }
        });

        LogOutBtn.setBackground(new java.awt.Color(204, 204, 255));
        LogOutBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LogOutBtn.setText("Log out ... ");
        LogOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutBtnActionPerformed(evt);
            }
        });

        StatisticsOfDates.setBackground(new java.awt.Color(255, 255, 204));
        StatisticsOfDates.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatisticsOfDates.setText("Statistics of dates");
        StatisticsOfDates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsOfDatesActionPerformed(evt);
            }
        });

        StatisticsOfSites.setBackground(new java.awt.Color(255, 255, 204));
        StatisticsOfSites.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatisticsOfSites.setText("Statistics of sites");
        StatisticsOfSites.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsOfSitesActionPerformed(evt);
            }
        });

        StatisticsOfSpeed.setBackground(new java.awt.Color(255, 255, 204));
        StatisticsOfSpeed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatisticsOfSpeed.setText("Statistics of speed");
        StatisticsOfSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsOfSpeedActionPerformed(evt);
            }
        });

        StatisticsOfVolume.setBackground(new java.awt.Color(255, 255, 204));
        StatisticsOfVolume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        StatisticsOfVolume.setText("Statistics of volume");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StatisticsOfVolume, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(StatisticsOfSpeed, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addComponent(StatisticsOfSites, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatisticsOfDates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComeBack)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(StatisticsOfDates, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(StatisticsOfSites, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(StatisticsOfSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(StatisticsOfVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(ComeBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

        getAccessibleContext().setAccessibleDescription("DateStatistics");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComeBackActionPerformed
        CommandComeBackHome comeBackHome = new CommandComeBackHome();
        comeBackHome.comeBackHome();
        this.dispose();
    }//GEN-LAST:event_ComeBackActionPerformed

    private void LogOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutBtnActionPerformed
       CommandLogOut logOut = new CommandLogOut();
       logOut.logOut();
       this.dispose();
    }//GEN-LAST:event_LogOutBtnActionPerformed

    private void StatisticsOfDatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsOfDatesActionPerformed
        CommandShowStatisticsOfDates commandShowStatisticsOfDates = new CommandShowStatisticsOfDates();
        commandShowStatisticsOfDates.commandShowStatisticsOfDates();
        this.dispose();
    }//GEN-LAST:event_StatisticsOfDatesActionPerformed

    private void StatisticsOfSitesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsOfSitesActionPerformed
        CommandShowStatisticsOfSites commandShowStatisticsOfSites = new CommandShowStatisticsOfSites();
        commandShowStatisticsOfSites.commandShowStatisticsOfSites();
        this.dispose();
    }//GEN-LAST:event_StatisticsOfSitesActionPerformed

    private void StatisticsOfSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsOfSpeedActionPerformed
        CommandShowStatisticsOfSpeed commandShowStatisticsOfSpeed = new CommandShowStatisticsOfSpeed();
        commandShowStatisticsOfSpeed.commandShowStatisticsOfSpeed();
        this.dispose();
    }//GEN-LAST:event_StatisticsOfSpeedActionPerformed

   
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsOfDownloading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ComeBack;
    private javax.swing.JButton LogOutBtn;
    private javax.swing.JButton StatisticsOfDates;
    private javax.swing.JButton StatisticsOfSites;
    private javax.swing.JButton StatisticsOfSpeed;
    private javax.swing.JButton StatisticsOfVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
