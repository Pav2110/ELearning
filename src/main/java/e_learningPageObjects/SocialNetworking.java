package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class SocialNetworking {

//Defining webdriver
public WebDriver driver;
//cssSelector for username
By user = By.cssSelector("[placeholder='Username']");
//cssSelector for password
By password = By.cssSelector("[placeholder='Pass']");
//cssSelector for next
By next = By.name("submitAuth");
// linkText for social network
By Socnet = By.linkText("Social network");

// creating constructor
public SocialNetworking(WebDriver driver) {
this.driver=driver;



}



// defining method getAccount
public WebElement getAccount() {
// return the element username
return driver.findElement(user);



}
// defining method getPassword
public WebElement getPassword() {
// return the element password
return driver.findElement(password);
}
// defining method getNext
public WebElement getNext() {
// return the element next
return driver.findElement(next);



}
// defining method getSocnet
public WebElement getSocnet() {
// return the element Socnet
return driver.findElement(Socnet);
}





}