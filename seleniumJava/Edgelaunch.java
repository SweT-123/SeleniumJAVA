package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Edgelaunch {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver ();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Teachnologies");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VN");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("swetha");
        driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("VN");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
        WebElement drop = driver.findElement(By.name("generalStateProvinceGeoId"));
        Select op=new Select(drop);
        op.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_description")).sendKeys("SeleniumJAVA");
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Swetha");
        driver.findElement(By.className("smallSubmit")).click();
        

        
        
        

        
        
        
        
        
       
        
        
        
        
         
        
        
        
        
        
        
        
        
        
        
        }

}
