package Login.Commands;

import SignUp.SignUp;

public class CommandSwitchToSignUpPage{
    public void switchToSignUpPage(){
       SignUp SignUpFrame = new SignUp();
       SignUpFrame.setVisible(true);
       SignUpFrame.pack();
       SignUpFrame.setLocationRelativeTo(null);
    }
}
