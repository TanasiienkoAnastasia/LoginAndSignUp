package StatisticsOfDownloading.Commands;

import StatisticsOfDownloading.StatisticsOfVolume;


public class CommandShowStatisticsOfVolume {
    public void commandShowStatisticsOfVolume(){
        StatisticsOfVolume StatisticsOfVolumeFrame = new StatisticsOfVolume();
        StatisticsOfVolumeFrame.setVisible(true);
        StatisticsOfVolumeFrame.pack();
        StatisticsOfVolumeFrame.setLocationRelativeTo(null);
    }
}
