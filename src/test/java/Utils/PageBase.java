package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase extends BaseTest {

    private WebDriverWait wait;

    public void waitForElement(WebElement el){
        wait = new WebDriverWait(GetDriver(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(el));
    }

    public void scrollToElement(WebElement el)
    {
        Actions actions = new Actions(GetDriver());
        actions.moveToElement(el);
        actions.perform();
    }

}
