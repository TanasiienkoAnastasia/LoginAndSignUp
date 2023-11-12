package Home.Commands;

import DownloadManager.DownloadManager;

public class CommandSwitchToStartDownloadingPage {
    public void switchToStartDownloadingPage(){
        DownloadManager DownloadManagerFrame = new DownloadManager();
        DownloadManagerFrame.setVisible(true);
        DownloadManagerFrame.pack();
        DownloadManagerFrame.setLocationRelativeTo(null);
    }
}
