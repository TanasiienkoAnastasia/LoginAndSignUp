package StatisticsOfDownloading.Commands;

import StatisticsOfDownloading.StatisticsOfSites;


public class CommandShowStatisticsOfSites {
    public void commandShowStatisticsOfSites(){
        StatisticsOfSites StatisticsOfSitesFrame = new StatisticsOfSites();
        StatisticsOfSitesFrame.setVisible(true);
        StatisticsOfSitesFrame.pack();
        StatisticsOfSitesFrame.setLocationRelativeTo(null);
    }
}
