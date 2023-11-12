package GeneralCommands;

import Home.Home;

public class CommandComeBackHome {
    public void comeBackHome(){
        Home HomeFrame = new Home();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null); 
    }
}
