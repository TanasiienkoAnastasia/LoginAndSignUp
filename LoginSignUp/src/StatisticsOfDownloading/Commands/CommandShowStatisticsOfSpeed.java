package StatisticsOfDownloading.Commands;

import StatisticsOfDownloading.StatisticsOfSites;
import StatisticsOfDownloading.StatisticsOfSpeed;


public class CommandShowStatisticsOfSpeed {
    public void commandShowStatisticsOfSpeed(){
        StatisticsOfSpeed StatisticsOfSpeedFrame = new StatisticsOfSpeed();
        StatisticsOfSpeedFrame.setVisible(true);
        StatisticsOfSpeedFrame.pack();
        StatisticsOfSpeedFrame.setLocationRelativeTo(null);
    }
}
