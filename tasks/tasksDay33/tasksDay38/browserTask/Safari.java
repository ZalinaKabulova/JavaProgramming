package tasksDay33.tasksDay38.browserTask;

public class Safari extends Browser {

    public Safari(String browser) {
        super(browser);
    }

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing safari browser");
    }
}
