package PajeObject;

import Generic.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class HomePage extends BaseClass {

    public  static SoftAssert softAssertion=null;


    By BusinessName= By.xpath("//h5[@class='mb0 pull-left full-width business-name']");
    By Quantity=By.xpath("//tr[@id='quantity_change']//span[@class='left'][contains(text(),'>')]");



    public void setBusinessName()
    {
        String BrandName= "theofficialbrand-SD";
        WebElement businessname= driver.findElement(BusinessName);
       String getTextBrandName= businessname.getText();

       if(getTextBrandName.equalsIgnoreCase(BrandName))
       {
           System.out.println("BrandName strings are matching");
       }
       else
       {
           System.out.println("BrandName is not matching");
       }

    }

    public void setQuantity()
    {

        WebElement quantity=driver.findElement(Quantity);
        if (quantity.isDisplayed())
        {
           quantity.click();
           driver.navigate().refresh();
        }
        else
            {
            System.out.println("Quantity is not clickkable" + quantity);
          }
    }


}
