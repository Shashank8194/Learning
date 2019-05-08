package PajeObject;

import Generic.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Details extends BaseClass {

    By UpwardArrow=By.xpath("//div[@class='cart-icon toggle ka-hide ex-open']");

    public void setUpwardArrow()
    {
        WebElement upwardarrow=driver.findElement(UpwardArrow);
        if (upwardarrow.isDisplayed())
        {
            upwardarrow.click();
        }else {
            System.out.println("Upward arrow is not displayed");
        }
    }
}
