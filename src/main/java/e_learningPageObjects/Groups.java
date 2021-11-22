package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class Groups {
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
// xpath for group
By Group = By.xpath("/html[1]/body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[6]/a[1]");
// id for popular
By Popular = By.id("tab_browse2");
// xpath for click1
By Click1 = By.xpath("//*[@id=\"tab_browse-2\"]/div[2]/div[3]/div/div/div[2]/a");

// creating constructor
public Groups(WebDriver driver) {
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




//defining method getGroup
public WebElement getGroup() {
// return the element Group
return driver.findElement(Group);
}



//defining method getPopular
public WebElement getPopular() {
// return the element Popular
return driver.findElement(Popular);
}



//defining method getClick1
public WebElement getClick1() {
// return the element Click1
return driver.findElement(Click1);
}

}