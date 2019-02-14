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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author dellpc
 */
public class Startyourorder {

    private WebDriver driver;
    private String baseUrl;

    public Startyourorder() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        // System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
         //driver = new ChromeDriver();
        // baseUrl = "https://www.papajohns.com/";
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testPapajohns() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://www.papajohns.com";
        //System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.papajohns.com/");
        driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("header-account-sign-in-email")).sendKeys(FileUtilLogin.getLogin().getUsername());
        driver.findElement(By.id("header-account-sign-in-password")).sendKeys(FileUtilLogin.getLogin().getPassword());
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Keep me signed in'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.manage().window().maximize();
        int v = 2;
        if (v == 1) {
            driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[1]/a")).click();
            driver.findElement(By.id("carryoutFormAccordion")).click();
            driver.findElement(By.id("locations-zipPostalcode")).sendKeys("60188");
            driver.findElement(By.id("locations-zipPostalcode")).sendKeys(Keys.ENTER);
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Order Delivery'])[1]/following::button[1]")).click();
        } else {
            driver.findElement(By.xpath("/html/body/div[2]/header/section[1]/nav/ul/li[1]/a")).click();
            driver.findElement(By.id("locations-country")).click();
            driver.findElement(By.id("locations-country")).click();
            driver.findElement(By.id("locations-addresstype")).click();
            driver.findElement(By.id("locations-addresstype")).click();
            driver.findElement(By.id("locations-streetaddress")).click();
            driver.findElement(By.id("locations-streetaddress")).clear();
            driver.findElement(By.id("locations-streetaddress")).sendKeys("1042 bedforddrive CarolStream");
            driver.findElement(By.id("locations-form")).submit();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Room Number'])[2]/following::div[3]")).click();
            driver.findElement(By.id("locations-aptstefloor")).click();
            driver.findElement(By.id("locations-aptstefloor")).click();
            driver.findElement(By.id("locations-usa-zipcode")).click();
            driver.findElement(By.id("locations-usa-zipcode")).click();
            driver.findElement(By.id("locations-usa-zipcode")).clear();
            driver.findElement(By.id("locations-usa-zipcode")).sendKeys("60188");
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Postal Code'])[1]/following::div[2]")).click();
            driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Postal Code'])[1]/following::input[2]")).click();
        }
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[1]/a")).click();//choosing pizza
        try {
            driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/div[1]/ul/li/a")).click();
        } catch (NoSuchElementException e1) {
            driver.findElement(By.xpath("/html/body/div[2]/main/section[1]/div[1]/ul/li/form/button")).click();
        }//create your own
        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("/html/body/div[2]/main/form/div/div/div/div[3]/div[1]/fieldset[1]/div/label[1]")).click();//crust style original
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[1]/div/label[1]")).click();//crust style original valentines day
        driver.findElement(By.id("size_0")).click();//small
        driver.findElement(By.id("size_0")).click();//square cut
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[4]/div/label[2]")).click();//welldone bake
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[5]/div/label[3]")).click();//ranch sauce
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"size_0\"]/fieldset[6]/div/label[3]"));//extra
        JavascriptExecutor executor = (JavascriptExecutor) driver;//extra
        executor.executeScript("arguments[0].click();", ele);//extra
        WebDriverWait wait = new WebDriverWait(driver, 30);//time delay
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"size_0\"]/nav/a"))); //examining the xpath for a next cheese
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"size_0\"]/nav/div/a"))); //examining the xpath for a next cheese valentines day

        //driver.findElement(By.xpath("//*[@id=\"size_0\"]/nav/a")).click();  //next cheese click button
        driver.findElement(By.xpath("//*[@id=\"size_0\"]/nav/div/a")).click();  //next cheese click button valentines day
        driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/fieldset[1]/div/label[2]")).click();//light cheese
        //driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/nav/a[2]")).click();//next meat button
        driver.findElement(By.xpath("//*[@id=\"Cheeses_0\"]/nav/div/a[2]")).click();//next meat button valentines day

        //driver.findElement(By.xpath("//*[@id=\"Meats_0\"]/nav/a[2]")).click();//next veggies button
        driver.findElement(By.xpath("//*[@id=\"Meats_0\"]/nav/div/a[2]")).click();//next veggies button valentines day

        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/fieldset/ul/li[1]/img")).click();//mushroom
        driver.findElement(By.id("Fresh-Veggies_0")).click();//onions
        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/fieldset/ul/li[6]/img")).click();//black olives
        new Select(driver.findElement(By.id("quantity"))).selectByIndex(2);//select number of pizzas
        driver.findElement(By.id("quantity")).click();//qty dropdown
        //driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/nav/button")).click();//add to cart
        driver.findElement(By.xpath("//*[@id=\"Fresh-Veggies_0\"]/nav/div/button")).click();//add to cart valentines day
        driver.findElement(By.linkText("No Thanks")).click();//no thanks
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[2]/a")).click();//sides
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/div[2]/div/a[1]")).sendKeys("4");
        Select dropdown = new Select(driver.findElement(By.id("comp-side-0-0-0")));
        dropdown.selectByVisibleText("Ranch");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[2]/a")).click();
        driver.findElement(By.id("order-button-0-2")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-2\"]/form/div[2]/div/a[1]")).sendKeys("3");
        Select cheesestick = new Select(driver.findElement(By.id("comp-side-0-2-0")));
        cheesestick.selectByVisibleText("Special Garlic");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-2\"]/form/input[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
       
        
        /*driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();    //deserts
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-1")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/div[2]/div/a[1]")).sendKeys("6");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/input[2]")).click();

        driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/div[2]/div/a[1]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Thread.sleep(1000);*/
        //driver.close();*/
        
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();//desserts
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-1")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/input[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        Thread.sleep(2000);//desserts

        /*driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();    //deserts
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-1")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/div[2]/div/a[1]")).sendKeys("6");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-1\"]/form/input[2]")).click();*/
        driver.get("https://www.papajohns.com/order/menu");
        //driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();  //menu
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[4]/a")).click();              //drinks
        driver.findElement(By.xpath("/html/body/div[2]/main/section/div[1]/ul/li/a")).click(); //order now
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Pepsi'])[2]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$2.99'])[1]/following::label[1]")).click();
        driver.findElement(By.linkText("∨")).click();
        // ERROR: Caught exception [ERROR: Unsupported command [doubleClick | link=∨ | ]]
        driver.findElement(By.linkText("∨")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='∨'])[1]/following::input[1]")).click();

        //******* For Extras ********
        driver.get("https://www.papajohns.com/order/menu");
        //driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();       //menu
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[5]/a")).click();  //extra
        driver.findElement(By.id("order-button-0-0")).click();   //order now
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Special Garlic Sauce'])[2]/following::label[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"ingredient-id-1\"]/li/label")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.linkText("∧")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='∨'])[1]/following::input[1]")).click();
        //   direct check out
        driver.findElement(By.linkText("Checkout")).click();

        /*driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div[1]/a/i")).click();
        driver.findElement(By.xpath("/html/body/div[2]/header/section[2]/nav/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[2]/main/nav/ul/li[3]/a")).click();
        driver.findElement(By.id("order-button-0-0")).click();
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/div[2]/div/a[1]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"product-details-0-0\"]/form/input[2]")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);*/
        //Thread.sleep(1000);
        driver.close();

    }
        
        
    }




