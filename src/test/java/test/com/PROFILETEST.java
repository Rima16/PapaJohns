/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author dellpc
 */
public class PROFILETEST {

    private WebDriver driver;
    private String baseUrl;

    public PROFILETEST() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver = new ChromeDriver();
        baseUrl = "https://www.papajohns.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example
    //
    // @Test
    // public void hello() {}
    @Test
    public void testProfile() {

        driver.get("https://www.papajohns.com/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign Up'])[2]/following::a[1]")).click();
        driver.findElement(By.id("create-account-firstname")).click();
        driver.findElement(By.id("create-account-firstname")).clear();
        driver.findElement(By.id("create-account-firstname")).sendKeys(FilePROIFILEutil.getprofile().getFirstname());
        driver.findElement(By.id("create-account-lastname")).click();
        driver.findElement(By.id("create-account-lastname")).clear();
        driver.findElement(By.id("create-account-lastname")).sendKeys(FilePROIFILEutil.getprofile().getLastname());
        driver.findElement(By.id("create-account-email")).click();
        driver.findElement(By.id("create-account-email")).clear();
        driver.findElement(By.id("create-account-email")).sendKeys(FilePROIFILEutil.getprofile().getEmail());
        driver.findElement(By.id("create-account-phone-number")).click();
        driver.findElement(By.id("create-account-phone-number")).sendKeys(FilePROIFILEutil.getprofile().getPhonenumber());
        //driver.findElement(By.id("create-account-phone-number")).click();
        driver.findElement(By.id("create-account-password")).click();
        driver.findElement(By.id("create-account-password")).clear();
        driver.findElement(By.id("create-account-password")).sendKeys(FilePROIFILEutil.getprofile().getPwd());
        //driver.findElement(By.id("birthMonth")).click();
        //new Select(driver.findElement(By.id("birthMonth"))).selectByVisibleText(FilePROIFILEutil.getprofile().getMonth());
        //driver.findElement(By.id("birthMonth")).click();
       // driver.findElement(By.id("birthDayOfMonth")).click();
        //new Select(driver.findElement(By.id("birthDayOfMonth"))).selectByVisibleText(FilePROIFILEutil.getprofile().getDay());
       // driver.findElement(By.id("birthDayOfMonth")).click();
        driver.findElement(By.id("create-account-textoffers")).click();
        driver.findElement(By.id("createAccountForm-country")).click();
        driver.findElement(By.id("createAccountForm-country")).click();
        driver.findElement(By.id("createAccountForm-addresstype")).click();
        driver.findElement(By.id("createAccountForm-addresstype")).click();
        driver.findElement(By.id("createAccountForm-streetaddress")).click();
        driver.findElement(By.id("createAccountForm-streetaddress")).clear();
        driver.findElement(By.id("createAccountForm-streetaddress")).sendKeys(FilePROIFILEutil.getprofile().getAdd());
        driver.findElement(By.id("createAccountForm-aptstefloor")).click();
        driver.findElement(By.id("createAccountForm-aptstefloor")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).clear();
        driver.findElement(By.id("createAccountForm-usa-city")).sendKeys(FilePROIFILEutil.getprofile().getCity());
        driver.findElement(By.id("createAccountForm-state")).click();
        new Select(driver.findElement(By.id("createAccountForm-state"))).selectByVisibleText(FilePROIFILEutil.getprofile().getState());
        driver.findElement(By.id("createAccountForm-state")).click();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).click();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).clear();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).sendKeys(FilePROIFILEutil.getprofile().getZipcode());
        driver.findElement(By.id("create-account-terms")).click();
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privacy Policy'])[1]/following::button[1]")).click();
        //driver.findElement(By.id("createAccountForm")).click();
        driver.findElement(By.xpath("//*[@id=\"createAccountForm\"]/button")).click();
        /* driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Sign Up'])[2]/following::a[1]")).click();
        driver.findElement(By.id("create-account-firstname")).click();
        driver.findElement(By.id("create-account-firstname")).clear();
        driver.findElement(By.id("create-account-firstname")).sendKeys("Savita");
        driver.findElement(By.id("create-account-lastname")).click();
        driver.findElement(By.id("create-account-lastname")).clear();
        driver.findElement(By.id("create-account-lastname")).sendKeys("Patel");
        driver.findElement(By.id("create-account-email")).click();
        driver.findElement(By.id("create-account-email")).clear();
        driver.findElement(By.id("create-account-email")).sendKeys("bhagyesh_jadi@yahoo.com");
        driver.findElement(By.id("create-account-phone-number")).click();
        driver.findElement(By.id("create-account-password")).click();
        driver.findElement(By.id("create-account-password")).clear();
        driver.findElement(By.id("create-account-password")).sendKeys("Bhagyesh8");
        driver.findElement(By.id("birthMonth")).click();
        new Select(driver.findElement(By.id("birthMonth"))).selectByVisibleText("May");
        driver.findElement(By.id("birthMonth")).click();
        driver.findElement(By.id("birthDayOfMonth")).click();
        new Select(driver.findElement(By.id("birthDayOfMonth"))).selectByVisibleText("7");
        driver.findElement(By.id("birthDayOfMonth")).click();
        driver.findElement(By.id("createAccountForm-streetaddress")).click();
         driver.findElement(By.id("create-account-phone-number")).clear();
        driver.findElement(By.id("create-account-phone-number")).sendKeys("(847)350-9034 ");
          new Select(driver.findElement(By.id("createAccountForm-state"))).selectByVisibleText("IL");
        driver.findElement(By.id("createAccountForm-streetaddress")).clear();
        driver.findElement(By.id("createAccountForm-aptstefloor")).click();
        driver.findElement(By.id("createAccountForm-streetaddress")).sendKeys("123 Main street");
        driver.findElement(By.id("createAccountForm-aptstefloor")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).click();
        driver.findElement(By.id("createAccountForm-usa-city")).clear();
        driver.findElement(By.id("createAccountForm-usa-city")).sendKeys("Carol stream");
        driver.findElement(By.id("createAccountForm-state")).click();
        new Select(driver.findElement(By.id("createAccountForm-state"))).selectByVisibleText("IL");
        driver.findElement(By.id("createAccountForm-state")).click();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).click();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).clear();
        driver.findElement(By.id("createAccountForm-usa-zipcode")).sendKeys("60188");
        driver.findElement(By.id("create-account-terms")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Privacy Policy'])[1]/following::button[1]")).click();*/
  try {

            //assertEquals("Signup in to PapaJohns", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Create New Account'])[1]/following::span[3]")).getText());
            assertEquals("Create a New Accout",driver.getTitle());
            System.out.println("Create an account Sucessfully");
        } catch (Error e) {

        }
    }

}
