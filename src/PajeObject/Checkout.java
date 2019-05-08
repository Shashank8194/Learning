package PajeObject;

import Generic.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Checkout extends BaseClass {

    By CheckOut= By.xpath("//button[contains(text(),'Checkout')]");


    public void setCheckOut()
    {
        WebElement checkout=driver.findElement(CheckOut);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        if (checkout.isDisplayed())
        {
            checkout.click();
        }else
        {
            System.out.println("Checkout is not enabled");
        }
    }
}
