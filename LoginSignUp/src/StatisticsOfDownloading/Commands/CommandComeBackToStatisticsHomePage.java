package StatisticsOfDownloading.Commands;

import StatisticsOfDownloading.StatisticsOfDownloading;


public class CommandComeBackToStatisticsHomePage {
        public void comeBackToStatisticsHomePage(){
        StatisticsOfDownloading StatisticsOfDownloadingFrame = new StatisticsOfDownloading();
        StatisticsOfDownloadingFrame.setVisible(true);
        StatisticsOfDownloadingFrame.pack();
        StatisticsOfDownloadingFrame.setLocationRelativeTo(null);
        }
}
