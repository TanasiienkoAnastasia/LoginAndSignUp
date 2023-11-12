package Home.Commands;

import StatisticsOfDownloading.StatisticsOfDownloading;

public class CommandSwitchToStatisticsOfDownloading {
    public void switchToStatisticsOfDownloading(){
        StatisticsOfDownloading DateStatisticsOfDownloadingFrame = new StatisticsOfDownloading();
        DateStatisticsOfDownloadingFrame.setVisible(true);
        DateStatisticsOfDownloadingFrame.pack();
        DateStatisticsOfDownloadingFrame.setLocationRelativeTo(null); 
    }
}
