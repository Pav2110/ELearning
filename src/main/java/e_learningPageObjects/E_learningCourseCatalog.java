package e_learningPageObjects;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;


public class E_learningCourseCatalog {
	
	public WebDriver driver;
	
	
	// clicking on course catalog
	By coursecatalog = By.linkText("Course catalog");
	By search = By.cssSelector("[name='search_term']");
	By searchclick = By.cssSelector("[type='submit']");
	
	// Technology course
	By technology = By.xpath("//*[@alt='Technology']");
	By facebooklink = By.xpath("//*[@id='about-course']/div[2]/div/div/div[1]/div[2]/ul/li[2]/a");
	By twitterlink = By.xpath("//*[@id='about-course']/div[2]/div/div/div[1]/div[2]/ul/li[3]/a");
	By linkedinlink = By.xpath("//*[@id='about-course']/div[2]/div/div/div[1]/div[2]/ul/li[4]/a");
	By coursehome = By.linkText("Course home");
	
	
	
	
	
	public E_learningCourseCatalog (WebDriver driver) {
	this.driver= driver;
}
	
	public WebElement getCourseCatalog() {
		return driver.findElement(coursecatalog);
		}
	public WebElement getSearchBox() {
		return driver.findElement(search);
		}
	public WebElement getSearchClick() {
		return driver.findElement(searchclick);
		}
	public WebElement getTechnology() {
		return driver.findElement(technology);
		}
	public WebElement getFacebooklink() {
		return driver.findElement(facebooklink);
		}
	public WebElement getTwitterLink() {
		return driver.findElement(twitterlink);
		}
	public WebElement getLinkedinLink() {
		return driver.findElement(linkedinlink);
		}
	public WebElement getCourseHome() {
		return driver.findElement(coursehome);
		}
	
	
}

