package GeneralCommands;

import Login.Login;


public class CommandLogOut {
       public void logOut(){
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
}
