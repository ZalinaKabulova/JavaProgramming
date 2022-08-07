package tasksDay38.browserTask;

public class Chrome extends Browser{

    public Chrome(String browser) {
        super(browser);
    }

    public void openBrowser(){
    System.out.println("Opening chrome browser");
}

    public void closeBrowser(){
    System.out.println("Closing chrome browser");
}
}
