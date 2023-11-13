package StatisticsOfDownloading.Commands;

import DownloadManager.DownloadManager;
import StatisticsOfDownloading.StatisticsOfDates;

public class CommandShowStatisticsOfDates {
    public void commandShowStatisticsOfDates(){
        StatisticsOfDates StatisticOfDatesFrame = new StatisticsOfDates();
        StatisticOfDatesFrame.setVisible(true);
        StatisticOfDatesFrame.pack();
        StatisticOfDatesFrame.setLocationRelativeTo(null);
    }
}
