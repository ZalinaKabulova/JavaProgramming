package tasksDay38.browserTask;

public class Opera extends Browser {

    public Opera(String browser) { //constructor
        super(browser);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening opera browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing opera browser");
    }

}
