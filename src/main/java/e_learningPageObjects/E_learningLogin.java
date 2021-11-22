package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class E_learningLogin {
	
	public WebDriver driver;
	
	// Login with wrong credentials
	By user = By.cssSelector("[placeholder='Username']");
	By password = By.cssSelector("[placeholder='Pass']");
	By next = By.name("submitAuth");
	
	// sign in with new details for follow courses
	By signin=By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a");
	By option1 = By.cssSelector("[value='5']");
	By firstname = By.id("registration_firstname");
	By lastname = By.id("registration_lastname");
    By email = By.cssSelector("input#registration_email");
	By username = By.xpath("//*[@id='username']");
	By newpassword = By.xpath("//*[@id='pass1']");
	By confirmpassword = By.id("pass2");
	By phonenumber = By.id("registration_phone");
	By language = By.className("filter-option-inner");
	By selectlanguage = By.linkText("English");
	By registerbtn = By.xpath("//*[@name='submit'][@id='registration_submit']");
	By homepage = By.xpath("//*[@id='navbar']/ul[1]/li[1]/a");
	
	
	
	By coursecatalog = By.linkText("Course catalog");
	By search = By.cssSelector("[name='search_term']");
	By searchclick = By.cssSelector("[type='submit']");
	
	

	
    public E_learningLogin (WebDriver driver) {
		this.driver= driver;
	}
	
	
	// Login
	public WebElement getAccount() {
		return driver.findElement(user);
		
	}
	public WebElement getPassword() {
		return driver.findElement(password);
		}
	public WebElement getNext() {
		return driver.findElement(next);
		
	}
	
	
	// Sign in - Follow course
	public WebElement getSignup() {
		return driver.findElement(signin);
		}
	public WebElement getOption1() {
		return driver.findElement(option1);
		}
	public WebElement getFistname() {
		return driver.findElement(firstname);
		}
	public WebElement getLastname() {
		return driver.findElement(lastname);
		}
	public WebElement getEmail() {
		return driver.findElement(email);
		}
	public WebElement getUsername() {
		return driver.findElement(username);
		}
	public WebElement getNewPassword() {
		return driver.findElement(newpassword);
		}
	public WebElement getConfirmPassword() {
		return driver.findElement(confirmpassword);
		}
	public WebElement getPhonenumber() {
		return driver.findElement(phonenumber);
		}
	public WebElement getLanguage() {
		return driver.findElement(language);
		}
	public WebElement getSelectLanguage() {
		return driver.findElement(selectlanguage);
		}
	public WebElement getRegister() {
		return driver.findElement(registerbtn);
		}
	
	
	
	
	
	
	public WebElement getHomePage() {
		return driver.findElement(homepage);
		}
	//
	public WebElement getCourseCatalog() {
		return driver.findElement(coursecatalog);
		}
	public WebElement getSearchBox() {
		return driver.findElement(search);
		}
	public WebElement getSearchClick() {
		return driver.findElement(searchclick);
		}

	
	
	
}

