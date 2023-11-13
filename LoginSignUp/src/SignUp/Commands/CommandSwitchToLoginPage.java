package SignUp.Commands;

import Login.Login;

public class CommandSwitchToLoginPage {
    public void switchToLoginPage(){
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
}
