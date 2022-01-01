package controller;

import org.testng.annotations.Test;

public class resSite extends ScriptBase{
    @Test
    public void launchSite(){
        init("email", "fff@gmail.com", "gggg", "passwd", "My orders");
    }


}
