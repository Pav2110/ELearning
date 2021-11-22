package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class SkillSet {
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
// xpath for dropdown
By Dropdown = By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/h4[1]/div[1]/a[1]");
// xpath for skill report
By Skirep = By.xpath("//*[@id=\"headingOne\"]/h4/div/ul/li[1]");
// linktext for white
By White = By.linkText("White");
// linktext for black
By Black = By.linkText("Black");
// linktext for light blue
By Liblu = By.linkText("Light blue");
// linktext for gray
By Gray = By.linkText("Gray");
// linktext for corn
By Corn = By.linkText("Corn");
// xpath for skill rank
By Skira = By.xpath("//a[contains(text(),'Your skill ranking: 0')]");
// xpath for skill wheel
By Skiwhe = By.xpath("//*[@id=\"headingOne\"]/h4/div/ul/li[2]/a");
// xpath for new skill
By Newski = By.xpath("//a[contains(text(),'Get new skills')]");
// xpath for display options
By Disop = By.xpath("//a[contains(text(),'Display options')]");



// creating constructor
public SkillSet(WebDriver driver) {
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



// defining method getDropdown
public WebElement getDropdown() {
// return the element Dropdown
return driver.findElement(Dropdown);
}
// defining method getSkirep
public WebElement getSkirep() {
// return the element Skirep
return driver.findElement(Skirep);
}
// defining method getWhite
public WebElement getWhite() {
// return the element White
return driver.findElement(White);
}
// defining method getBlack
public WebElement getBlack() {
// return the element Black
return driver.findElement(Black);
}
// defining method getLiblu
public WebElement getLiblu() {
// return the element Liblu
return driver.findElement(Liblu);
}
// defining method getGray
public WebElement getGray() {
// return the element Gray
return driver.findElement(Gray);
}
// defining method getCorn
public WebElement getCorn() {
// return the element Corn
return driver.findElement(Corn);
}
// defining method getSkira
public WebElement getSkira() {
// return the element Skira
return driver.findElement(Skira);
}



// defining method getNewski
public WebElement getNewski() {
// return the element Newski
return driver.findElement(Newski);
}
// defining method getDisop
public WebElement getDisop() {
// return the element Disop
return driver.findElement(Disop);
}
// defining method getSkiwhe
public WebElement getSkiwhe() {
// return the element Skiwhe
return driver.findElement(Skiwhe);
}


}
