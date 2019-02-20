package com.ibm.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\eclipse-jee-2018-12-R-win32-x86_64\\eclipse\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	// 	ChromeDriver wd = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");         
        //No.of Columns
     /*   List<WebElement>  col = wd.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List<WebElement>  rows = wd.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
     */   
        List<WebElement>  row_count = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        List<WebElement>  col_count = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        
        List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
        System.out.println(col.size());
        
        List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        System.out.println(row.size());
        
       System.out.println(row_count.size());
       System.out.println(col_count.size());
       
       for(int j=1;j<col.size();j++)
       {
       List<WebElement> data = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[j]"));
       for (int i = 0; i < data.size(); i++) {
           System.out.println(data.get(i).getText());
       }
       System.out.println();
       }
       
       /*
        * With no subscipt value for td, it will print the whole table
        
        List<WebElement> data = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[]"));
       for (int i = 0; i < data.size(); i++) {
           System.out.println(data.get(i).getText());
       }
        
        
        */
//        for (int i=0;i<rows.size();i++) {
//            if (rows.get(i).getText()=="Welspun Corp")
//            {
//                
//            }
//        }
//        wd.close();
       driver.close();
	}

}
