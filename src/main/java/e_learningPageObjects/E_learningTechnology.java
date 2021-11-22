package e_learningPageObjects;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Iterator;

public class E_learningTechnology {

	
	
	public WebDriver driver;
	
	public  E_learningTechnology (WebDriver driver) {
		this.driver= driver;
	}
	
	By description = By.linkText("Course description");
	By agenda = By.linkText("Agenda");
	By documents = By.linkText("Documents");
	By learningpath = By.linkText("Learning path");
	By links = By.linkText("Links");
	By tests = By.linkText("Tests");
	By announcements = By.linkText("Announcements");
	By forums = By.linkText("Forums");
	By dropbox = By.linkText("Dropbox");
	By groups = By.linkText("Groups");
	By chat = By.linkText("Chat");
	By assignments = By.linkText("Assignments");
	By surveys = By.linkText("Surveys");
	By wiki = By.linkText("Wiki");
	By assessments = By.linkText("Assessments");
	By  glossary = By.linkText("Glossary");
	By notebook = By.linkText("Notebook");
	By elearning = By.linkText("elearning");
	
	
	public WebElement getDescription() {
		return driver.findElement(description);
	
	}
	public WebElement getAgenda() {
		return driver.findElement(agenda);
	}
	public WebElement getDocuments() {
		return driver.findElement(documents);
	}
	public WebElement getLearningpath() {
		return driver.findElement(learningpath);
	}
	public WebElement getLinks() {
		return driver.findElement(links);
	}
	public WebElement getTests() {
		return driver.findElement(tests);
	}
	public WebElement getAnnouncements() {
		return driver.findElement(announcements);
	}
	public WebElement getForums() {
		return driver.findElement(forums);
	}
	public WebElement getDropbox() {
		return driver.findElement(dropbox);
	}
	public WebElement getGroups() {
		return driver.findElement(groups);
	}
	public WebElement getChat() {
		return driver.findElement(chat);
	}
	public WebElement getAssignments() {
		return driver.findElement(assignments);
	}
	public WebElement getSurveys() {
		return driver.findElement(surveys);
	}
	public WebElement getWiki() {
		return driver.findElement(wiki);
	}
	public WebElement getAssessments() {
		return driver.findElement(assessments);
	}
	public WebElement getGlossary() {
		return driver.findElement(glossary);
	}
	public WebElement getNotebook() {
		return driver.findElement(notebook);
	}
	public WebElement getElearning() {
		return driver.findElement(elearning);
	}
		
}









