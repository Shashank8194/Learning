package PajeObject;

import Generic.BaseClass;
import Generic.Excel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class CardDetails extends BaseClass {

    Excel readexcel=new Excel();

    By EmailID=By.id("guestUserEmail");
//   By Cardnumber= By.xpath("//div[@class='StripeElement StripeElement--empty']");
    By CardNumber=By.name("cardnumber");
   By Cardnumber=By.xpath("//div[@id='card-element']");
    By name=By.id("nameOnCard");
    By FirstAddress=By.id("billing-address1");
    By PlusSign=By.xpath("//div[@class='tab-pane active']//em[@class='icon icon-plus']");
    By LastAddress= By.id("billing-address2");
    By ZipCode=By.xpath("//div[@id='card-info']//input[@placeholder='ZIP']");
    By PayButton=By.xpath("//*[@id=\"ka-foot\"]/div/button[10]");


    public WebElement setEmailID(String emailID) throws Exception
    {
        WebElement ID=driver.findElement(EmailID);
        try
        {
            ID.click();
            ID.sendKeys(emailID);
        }catch (Exception e)
        {
            System.out.println("Email ID Entered");
        }
        return ID;
    }

    public WebElement setCardnumber(String CardNumber) throws Exception
    {
        WebElement cardnumber=driver.findElement(Cardnumber);
      try{
          Actions actions = new Actions(driver);
          actions.moveToElement(cardnumber);
          actions.click();
          actions.sendKeys("1234");
          actions.sendKeys(Keys.TAB);
          actions.sendKeys("10");
          actions.sendKeys("11");
          actions.sendKeys(Keys.TAB);
          actions.sendKeys("123");
          actions.build().perform();
       /*   cardnumber.click();
          cardnumber.sendKeys(CardNumber);*/
      }
      catch (Exception e)
      {
          e.printStackTrace();
          System.out.println("Card Number Entered" +cardnumber);
      }
      return  cardnumber;
    }

    public void setName(String Name) throws  Exception
    {
        WebElement fullname=driver.findElement(name);
        try{
            fullname.click();
            fullname.sendKeys(Name);
        }
        catch (Exception e)
        {
            System.out.println("Name Entered");
        }
    }

    public void setAddress1(String Address1) throws  Exception
    {
        WebElement address1=driver.findElement(FirstAddress);
        WebElement addicon=driver.findElement(PlusSign);
        try
        {
            address1.click();
            address1.sendKeys(Address1);
            addicon.click();
        }catch (Exception e)
        {
            System.out.println("Address 1 is entered");
        }

    }

    public void setAddress2(String Address2) throws  Exception
    {
        WebElement address2=driver.findElement(LastAddress);
        try
        {
            address2.click();
            address2.sendKeys(Address2);
        }catch (Exception e)
        {
            System.out.println("Address 2 is entered");
        }
    }

    public void setZipCode(String Zip) throws  Exception
    {
        WebElement zip=driver.findElement(ZipCode);
        try
        {
            zip.click();
            zip.sendKeys(Zip);
        }catch (Exception e)
        {
            System.out.println("Zip Code Entered");
        }
    }

    public void setPayButton() throws  Exception
    {
        WebElement pay=driver.findElement(PayButton);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       // Thread.sleep(4000);
      Actions actions=new Actions(driver);
       actions.moveToElement(pay);
       actions.click();
       pay.click();
       actions.build().perform();
    }


}
