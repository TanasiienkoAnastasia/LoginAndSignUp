package loginsignup.Commands;

import Login.Login;

public class CommandOpenLogInForm {
    public void openLoginInForm(){
       Login LoginFrame = new Login();
       LoginFrame.setVisible(true);
       LoginFrame.pack();
       LoginFrame.setLocationRelativeTo(null);
    }
}
