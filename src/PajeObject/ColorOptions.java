package PajeObject;

import Generic.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColorOptions extends BaseClass {

    By ColorOptions=By.xpath("//table[@class='pb-sm mb-sm full-width product-list']//tr[5]//td[2]");
    By ChangeColor=By.xpath("//span[contains(text(),'Change Color')]");
    By BrownColor=By.xpath("//li[contains(text(),'Brown')]");
    By BlackColor=By.xpath("//li[contains(text(),'Black')]");



    public WebDriver setColorOptions() throws  Exception
    {


        WebElement coloroptions=driver.findElement(ColorOptions);
        WebElement changecolor=driver.findElement(ChangeColor);
        WebElement browncolor=driver.findElement(BrownColor);
        WebElement blackcolor=driver.findElement(BlackColor);


        coloroptions.click();

        if(browncolor.isDisplayed())
        {
            WebDriverWait wait=new WebDriverWait(driver,8);

            wait.until(ExpectedConditions.visibilityOf(browncolor));
            browncolor.click();

        }
        else if (blackcolor.isDisplayed()){
            blackcolor.click();
            System.out.println("Color has been changed to Black");
        }

        return driver;

    }


}
