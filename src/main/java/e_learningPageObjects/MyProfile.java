package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class MyProfile {
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
// xpath for edit profile
By Editprof = By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
// id for pass
By Pass = By.id ("profile_password0");
// id for newpass
By Newpass = By.id("password1");
// id for confirm
By Confirm = By.id("profile_password2");
// id for save
By Savse = By.id("profile_apply_change");



// creating constructor
public MyProfile(WebDriver driver) {
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



// defining method getEditprof
public WebElement getEditprof() {
// return the element Editprof
return driver.findElement(Editprof);
}
// defining method getPass
public WebElement getPass() {
// return the element Pass
return driver.findElement(Pass);
}
// defining method getNewpass
public WebElement getNewpass() {
// return the element Newpass
return driver.findElement(Newpass);
}
// defining method getConfirm
public WebElement getConfirm() {
// return the element Confirm
return driver.findElement(Confirm);
}
// defining method getSavse
public WebElement getSavse() {
// return the element Savse
return driver.findElement(Savse);
}


}