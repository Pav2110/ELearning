package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class MyFriends {
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

// cssselector for box
By Box = By.cssSelector("[placeholder='By name']");
// xpath for search
By Search = By.xpath("//*[@id=\"find_friends_form\"]/fieldset/div/div/button");
// xpath for invite
By Invite = By.xpath("//*[@id=\"user_card_4589\"]/div/div[2]/div/div[2]/div/a[1]");
// id for message
By Message = By.id("content_invitation_id");
// id for send message
By Sendmess = By.id("btn-send-invitation");

// creating constructor
public MyFriends(WebDriver driver) {
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
//defining method getBox
public WebElement getBox() {
// return the element Box
return driver.findElement(Box);
}
// defining method getSearch
public WebElement getSearch() {
// return the element Search
return driver.findElement(Search);
}
// defining method getInvite
public WebElement getInvite() {
// return the element Invite
return driver.findElement(Invite);
}
// defining method getMessage
public WebElement getMessage() {
// return the element Message
return driver.findElement(Message);
}
// defining method getSendmess
public WebElement getSendmess() {
// return the element Sendmess
return driver.findElement(Sendmess);
}

}
