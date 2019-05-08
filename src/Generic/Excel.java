package Generic;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class Excel extends  BaseClass{

    public Excel()
    {
    }

public String readExcelEmailID(String filePath,String fileName,String  sheetName) throws Exception
{
    filePath = (System.getProperty("user.dir") + "/InputData/");
    fileName = "revinfotech.xlsx";
    sheetName="Details";
    File file=new File(filePath + fileName);
    FileInputStream fis=new FileInputStream(file);
    Workbook revinfotech;
    String fileExtensionName=fileName.substring(fileName.indexOf("."));
    revinfotech=new XSSFWorkbook(fis);
    Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
    int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
    String emaildID=revinfotechSheet.getRow(1).getCell(0).toString();
    System.out.println(emaildID);
    return emaildID;
}

    public String readExcelCardNumber(String filePath,String fileName,String  sheetName) throws Exception
    {
        filePath = (System.getProperty("user.dir") + "/InputData/");
        fileName = "revinfotech.xlsx";
        sheetName="Details";
        File file=new File(filePath+fileName);
        FileInputStream fis=new FileInputStream(file);
        Workbook revinfotech;
        String fileExtensionName=fileName.substring(fileName.indexOf("."));
        revinfotech=new XSSFWorkbook(fis);
        Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
        int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
        String CardNumber=revinfotechSheet.getRow(1).getCell(1).toString();
        System.out.println(CardNumber);
        return CardNumber;
    }

    public String readExcelName(String filePath,String fileName,String  sheetName) throws Exception
    {
        filePath = (System.getProperty("user.dir") + "/InputData/");
        fileName = "revinfotech.xlsx";
        sheetName="Details";
        File file=new File(filePath+fileName);
        FileInputStream fis=new FileInputStream(file);
        Workbook revinfotech;
        String fileExtensionName=fileName.substring(fileName.indexOf("."));
        revinfotech=new XSSFWorkbook(fis);
        Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
        int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
        String Name=revinfotechSheet.getRow(1).getCell(2).toString();
        System.out.println(Name);
        return Name;
    }

    public String readExcelAddress1(String filePath,String fileName,String  sheetName) throws Exception
    {
        filePath = (System.getProperty("user.dir") + "/InputData/");
        fileName = "revinfotech.xlsx";
        sheetName="Details";
        File file=new File(filePath+fileName);
        FileInputStream fis=new FileInputStream(file);
        Workbook revinfotech;
        String fileExtensionName=fileName.substring(fileName.indexOf("."));
        revinfotech=new XSSFWorkbook(fis);
        Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
        int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
        String Address1=revinfotechSheet.getRow(1).getCell(3).toString();
        System.out.println(Address1);
        return Address1;
    }

    public String readExcelAddress2(String filePath,String fileName,String  sheetName) throws Exception
    {
        filePath = (System.getProperty("user.dir") + "/InputData/");
        fileName = "revinfotech.xlsx";
        sheetName="Details";
        File file=new File(filePath+fileName);
        FileInputStream fis=new FileInputStream(file);
        Workbook revinfotech;
        String fileExtensionName=fileName.substring(fileName.indexOf("."));
        revinfotech=new XSSFWorkbook(fis);
        Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
        int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
        String Address2=revinfotechSheet.getRow(1).getCell(4).toString();
        System.out.println(Address2);
        return Address2;
    }

    public String readExcelZip(String filePath,String fileName,String  sheetName) throws Exception
    {
        filePath = (System.getProperty("user.dir") + "/InputData/");
        fileName = "revinfotech.xlsx";
        sheetName="Details";
        File file=new File(filePath+fileName);
        FileInputStream fis=new FileInputStream(file);
        Workbook revinfotech;
        String fileExtensionName=fileName.substring(fileName.indexOf("."));
        revinfotech=new XSSFWorkbook(fis);
        Sheet revinfotechSheet=revinfotech.getSheet(sheetName);
        int rowcount=revinfotechSheet.getLastRowNum()-revinfotechSheet.getFirstRowNum();
        String Zip=revinfotechSheet.getRow(1).getCell(5).toString();
        System.out.println(Zip);
        return Zip;
    }
}
