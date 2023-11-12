package Home.Commands;

import UserPage.UserPage;


public class CommandSwitchToUserPage{
    public void commandSwitchToUserPage(){
        UserPage UserFrame = new UserPage();
        UserFrame.setVisible(true);
        UserFrame.pack();
        UserFrame.setLocationRelativeTo(null);
    }
}
