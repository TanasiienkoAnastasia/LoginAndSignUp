package Home.Commands;

import HistoryOfDownloadings.HistoryOfDownloading;

public class CommandViewHistoryOfDownloadings {
    public void viewHidtoryOfDownloadings(){
        HistoryOfDownloading HistoryOfDownloadingFrame = new HistoryOfDownloading();
        HistoryOfDownloadingFrame.setVisible(true);
        HistoryOfDownloadingFrame.pack();
        HistoryOfDownloadingFrame.setLocationRelativeTo(null);
    }
}
