package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chromedriver","C:\\Users\\Malika Refsi\\IdeaProjects\\AutomationProject1\\driver");
        // this line set the location where the location where the chromedriver is located
        WebDriver driver=new ChromeDriver();// create an instance of the web driver
        //by this step we be able to open a browser
        // and if I want to go some where to google do the fpllowing
        driver.get("https://www.amazon.com/");// after run the will lunch
        // since selenium is too fast I have to aske it to slow down by thefollowing
        Thread.sleep(2000);// 2 sec
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java book");
        // this to fint the equivalent of the action ui front end and this because we want to enter a text 'java book'
        driver.findElement(By.id("nav-search-submit-button")).click();
        //and this way we can automate all the steps



    }
}
