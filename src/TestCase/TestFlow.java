package TestCase;

import Generic.BaseClass;
import Generic.Excel;
import PajeObject.*;


public class TestFlow extends BaseClass {

    HomePage HP=new HomePage();
    ColorOptions CO=new ColorOptions();
    Checkout CT=new Checkout();
    Details DS= new Details();
    Excel readexcel=new Excel();
    CardDetails CD=new CardDetails();

    public TestFlow()
    {

    }

    @Test
    public void Home() throws  Exception
    {
        HP.setBusinessName();
        HP.setQuantity();
        System.out.println("Shashank");
    }

    @Test
    public void ChangeColor() throws  Exception
    {
        CO.setColorOptions();
    }


    @Test
    public void Checkout()
    {
        CT.setCheckOut();
    }

    @Test
    public  void AllDetails()
    {
        DS.setUpwardArrow();
    }

    @Test
    public void CardDetails() throws  Exception
    {
        String filePath = System.getProperty("user.dir") + "/InputData/";
        String emailID=readexcel.readExcelEmailID(filePath,"revinfotech","Details");
        String CardNumber=readexcel.readExcelCardNumber(filePath,"revinfotech","Details");
        String Name=readexcel.readExcelName(filePath,"revinfotech","Details");
        String Address1=readexcel.readExcelAddress1(filePath,"revinfotech","Details");
        String Address2=readexcel.readExcelAddress2(filePath,"revinfotech","Details");
        String Zip=readexcel.readExcelZip(filePath,"revinfotech","Details");
        CD.setEmailID(emailID);
        CD.setCardnumber(CardNumber);
        CD.setName(Name);
        CD.setAddress1(Address1);
        CD.setAddress2(Address2);
        CD.setZipCode(Zip);
        CD.setPayButton();

    }

}
