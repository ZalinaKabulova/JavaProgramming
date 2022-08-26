package tasksDay45;

public class RemoteWebDriver implements WebDriver,TakeScreenShot,JavaScriptExecuter {

     public String browserName;

     public String getBrowserName() {
          return browserName;
     }

     public void setBrowserName(String browserName) {
          this.browserName = browserName;
     }

     public RemoteWebDriver(String browserName) {
          setBrowserName(browserName);
          System.out.println("Opening "+browserName+" browser ");

     }

     @Override
     public void executeScript(String script) {
          System.out.println("Executing \""+script+"\" script on"+browserName+" browser");
     }

     @Override
     public void findElement(String locator) {
          System.out.println(browserName+" driver locating an element by "+locator);
     }

     @Override
     public void findElements(String locator) {
          System.out.println(browserName+" driver locating multiple elements by "+locator);
     }

     @Override
     public void takesScreenShot() {
          System.out.println("Taking screenshot on: "+browserName+" browser");
     }

     @Override
     public void get(String url) {
          System.out.println("Getting the "+url+" on "+browserName+" browser");
     }

     @Override
     public void close() {
          System.out.println("Closing the tab on "+browserName+" browser");
     }

     @Override
     public void quit() {
          System.out.println("Quitting the "+browserName+" browser");
     }

     @Override
     public void getTitle() {
          System.out.println(browserName+" driver is getting the title");


     }

     @Override
     public String toString() {
          return "RemoteWebDriver{" +
                  "browserName='" + browserName + '\'' +
                  '}';
     }
}
