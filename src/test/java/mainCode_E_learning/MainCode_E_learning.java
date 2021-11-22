package mainCode_E_learning;

import java.util.Set;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import e_learningPageObjects.E_learningCourseCatalog;
import e_learningPageObjects.E_learningLogin;
import e_learningPageObjects.E_learningTechnology;
import e_learningPageObjects.Groups;
import resources_E_learning.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import e_learningPageObjects.Dropdown;
import e_learningPageObjects.PopularCourses;
import e_learningPageObjects.LostPassword;
import e_learningPageObjects.MyFriends;
import e_learningPageObjects.MyProfile;
import e_learningPageObjects.Progress;
import e_learningPageObjects.SkillSet;
import e_learningPageObjects.SocialNetworking;
import e_learningPageObjects.SocialWall;
import e_learningPageObjects.signin;
import e_learningPageObjects.signup;
import resources_E_learning.Base;	
import e_learningPageObjects.E_learningCourses;


	public class MainCode_E_learning extends Base {
			
		
//Module - 1
		//1st scenario SIGNUP

		//Intialize the browser
		@Given("^Initialize the browser with chrome$")
		public void initialize_the_browser_with_chrome() throws Throwable
		{
		//Intialize the driver
		driver =initializeDriver();
		}

		//Navigate to the url of elearning
		@Given("^Navigate to \"([^\"]*)\" Site$")
		public void navigate_to_something_site(String url) throws Throwable
		{
		//arg1 contains the url
		driver.get(url);
		//maximize the window
		driver.manage().window().maximize();
		}
		//Signup button
		@Given("^Click on signup button$")
		public void click_on_signup_button() throws Throwable
		{
		//Create instance for signup page
		signup s1=new signup(driver);
		//click
		s1.getsignup().click();

		}

		//give the credentials
		@When("^user registered by using (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+) (.+)$")
		public void user_registered_by_using(String firstname, String lastname, String email, String username, String pass, String confirmpass, String phone, String code, String skype, String linkedinprofileurl) throws Throwable {
		//Create instance for signup
		signup s1=new signup(driver);
		//click on check box
		s1.getcheck().click();
		//give firstname
		s1.getfirstname().sendKeys(firstname);
		//give lastname
		s1.getlastname().sendKeys(lastname);
		//give email
		s1.getemail().sendKeys(email);
		//give username
		s1.getusername().sendKeys(username);
		//give password
		s1.getpass().sendKeys(pass);
		//confirm the password
		s1.getconfirmpass().sendKeys(confirmpass);
		//give phone number
		s1.getphone().sendKeys(phone);
		//give code
		s1.getcode().sendKeys(code);
		//give skype
		s1.getskype().sendKeys(skype);
		//give linkedin profile url
		s1.getlinkedin().sendKeys(linkedinprofileurl);
		//click
		s1.getregister().click();

		}

		//User successfully registered
		@And("^print user registers successfully$")
		public void print_user_registers_successfully() throws Throwable
		{
		//Contains given text or not
		if(driver.getPageSource().contains("alert alert-warning"))
		{
		//print
		System.out.println("User already registered");
		}
		else
		{
		//print
		System.out.println("Open the webpage");
		}
		//wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//close
		driver.close();
		}



		//2nd Scenario SIGNIN

		//Login to the home page
		@Given("^Click on Login link in home page to land on Secure sign in Page$")
		public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable
		{
		//create instance for signin
		signin s1=new signin(driver);
		//used assertion to check administrator is displayed or not
		Assert.assertTrue(s1.getadm().isDisplayed());
		//print
		System.out.println("Elearning page is opened and Window is Maximised");
		}

		//enter credentials
		@When("^User enters (.+) and (.+) and logs in$")
		public void user_enters_and_and_logs_in1(String username, String password) throws Throwable
		{
		//create instance for signin page
		signin s1=new signin(driver);
		//Give username and password
		s1.getusername().sendKeys(username);
		s1.getPassword().sendKeys(password);
		//click on login button
		s1.getLogin().click();
		}

		//Verify whether the current url is same as the expected url
		@Then("^Verify that user is succesfully logged in$")
		public void user_enters_and_and_logs_in() throws Throwable
		{
		//creating the actual url
		String actualUrl="http://elearningm1.upskills.in/user_portal.php";
		//creating the expected url
		String expectedUrl= driver.getCurrentUrl();
		//used assertion to check current url is same as the expected url
		Assert.assertEquals(expectedUrl,actualUrl);
		}

		//Check login is successful
		@And("^print success$")
		public void print_success() throws Throwable
		{
		//expectedtext
		String expectedtext="Apoorva Mutyala";
		//gettext method used to retrieve the text
		String s = driver.findElement(By.xpath("//strong[text()=\"Apoorva Mutyala\"]")).getText();
		//equalsIgnoreCase is used
		if(expectedtext.equalsIgnoreCase(s))
		{
		//print
		System.out.println("User logged sucessfully");
		}
		//wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//close
		driver.close();

		}




		//3rd scenario DROPDOWN

		//click on language dropdown
		@Then("^Click on language you preferred$")
		public void click_on_language_you_preferred() throws Throwable
		{
		//create instance for dropdown
		Dropdown d1=new Dropdown(driver);
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on icon
		d1.getdropdown1().click();
		//click on the language
		d1.getdropdown().click();
		}

		//language is selected
		@Then("^print language is selected$")
		public void print_language_is_selected() throws Throwable
		{
		//print
		System.out.println("Language is changed according to the requirement");
		//wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//close
		driver.close();
		}



		//4th scenario LOST MY PASSWORD

		//lost my password link
		@Then("^Click on I my lost password link and give (.+)$")
		public void click_on_i_my_lost_password_link_and_give(String mail) throws Throwable
		{
		//create instance for lostpassword
		LostPassword l1=new LostPassword(driver);
		//click
		l1.getlostpassword().click();
		//send mail
		l1.getmail().sendKeys(mail);
		//click on sendmessage button
		l1.getsendmessage().click();

		}

		//link sent to the user
		@Then("^the link had send to the user$")
		public void the_link_had_send_to_the_user() throws Throwable
		{
		//given text is there in webpage or not
		if(driver.getPageSource().contains("There is no account with this user and/or e-mail address"))
		{
		System.out.println("No account is there");
		}
		else
		{
		System.out.print("Link has Sent to the given mail");
		}
		//wait
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//driver.close();
		}

// 5th scenario PROGRESS

		
		@Then("^check the links$")
		public void check_the_links() throws Throwable {

		//create instance for link
		PopularCourses l=new PopularCourses(driver);

		//click
		l.getlink().click();
		//click
		l.getlinkedin().click();

		//window handle
		Set<String> windows = driver.getWindowHandles();

		//create Iterator
		Iterator<String>it = windows.iterator();

		//Create parent and child window id
		String parentId = it.next();
		String childId = it.next();

		//switch to child window
		driver.switchTo().window(childId);
		//To wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//To close the driver
		driver.close();
		//switch to parent window
		driver.switchTo().window(parentId);

		//back
		driver.navigate().back();
		}

		@And("^close the browser$")
		public void close_the_browser1() throws Throwable {
		//Close
		//driver.close();
		

		}


		

		//Verify user is logged in or not
		@When("^Verify that user is succesfully logged in to the site$")
		public void verify_that_user_is_succesfully_logged_in_to_the_site() throws Throwable
		{
		//Assertion used
		Assert.assertTrue(driver.findElement(By.xpath("//*[@class='btn btn-primary btn-large']")).isDisplayed());
		//print
		System.out.println("user logged in successfully");
		}

		//Go to the progress link
		@And("^go to the progress$")
		public void go_to_the_progress() throws Throwable
		{
		//print
		System.out.println("Go the progress link");
		}

		//click on progress link
		@Given("^click progress link$")
		public void click_progress_link() throws Throwable
		{
		//Create instance for progress
		Progress p1=new Progress(driver);
		//click
		p1.getprogress().click();
		}

		//check the progress link is opened or not
		@And("^check the data$")
		public void check_the_data() throws Throwable
		{
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='No data available']")).isDisplayed());
		System.out.println("progress link opened");
		
		}


		//6th scenario POPULAR COURSES

	
	
		
//Module - 2		
		//Raja
		
	
	
		

		//Sign in

		@When("^User click on signup new page should open$")
		public void user_click_on_signup_new_page_should_open() throws Throwable {
		E_learningLogin El1= new E_learningLogin(driver);

		

		}

		@When("^User should be able to enter (.+), (.+)$")
		public void user_should_be_able_to_enter_(String newusername, String newpassword) throws Throwable {
		// code to follow the course

		E_learningCourses El1= new E_learningCourses(driver);
		El1.getAccount().sendKeys(newusername);
		El1.getPassword().sendKeys(newpassword);
		El1.getNext().click();


		//SortCourses

		El1.getSortCourse().click();
		El1.getDescription().click();
		El1.getEdit().click();
		//El1.getValidate().click();
		//El1.getDow().click();
		El1.getCreate().click();
		El1.getName().sendKeys("Java Tutorial");
		El1.getAdd().click();

		//El1.getClose().click();
		//El1.getUp().click();


		// Course history
		El1.getHome().click();
		El1.getHistory().click();
		El1.getDisplayCourse().click();
		El1.getTesting().click();

		El1.getCoursedescription().click();
		//Assert.assertTrue(driver.findElementEisDisplayed());
		driver.navigate().back();

		El1.getAgenda().click();
		driver.navigate().back();

		El1.getDocument().click(); //Documents
		El1.getDoc().sendKeys("Dbms");
		El1.getD().click();
		El1.getClick1().click();

		El1.getLearningpath().click();//Learning
		driver.navigate().back();

		El1.getLinks1().click(); // Links
		driver.navigate().back();

		El1.getTests().click(); // Tests
		El1.getMtest().click();

		El1.getPrTest().click();
		El1.getBack1().click();

		El1.getAnnouncements().click(); //Announcements
		driver.navigate().back();

		El1.getForums().click(); //Forums
		El1.getForumsThread().click();
		El1.getBackTo().click();
		El1.getGroupdoc().click();
		El1.getSearchbox1().sendKeys("Chat");

		El1.getSubmit().click();

		El1.getChatfile().click();

		El1.getBack2().click();

		El1.getDropbox().click();
		El1.getShare().click();
		El1.getBack12().click();


		El1.getUsers().click(); //User
		El1.getPgclick().click();
		El1.getBack123().click();


		El1.getGroups().click(); //Groups
		El1.getSearchbox().sendKeys("Group 0005");
		El1.getSearchclick().click();
		El1.getBack123().click();
		//driver.findElement(By.linkText(""))


		El1.getAssignments().click(); //Assignments
		El1.getAni().click();
		El1.getBack20().click();


		El1.getSurveys().click(); //Survey
		driver.navigate().back();

		El1.getWiki().click(); //Wiki
		El1.getAllpages().click();
		El1.getLatestchanges().click();
		El1.getBack03().click();


		El1.getAssessments().click(); //Assessment
		El1.getDownload().click();
		El1.getBack04().click();


		El1.getGlossary().click(); //Glossary
		El1.getExport().click();
		El1.getDownloadd().click();
		driver.navigate().back();
		El1.getLineview().click();
		El1.getBack123().click();

		El1.getNotebook().click(); //Notebook
		El1.getCreatenote().click();
		El1.getNotetitle().sendKeys("Automation Training");
		El1.getAddnote().click();
		El1.getBack123().click();
		El1.getSeliniumproject().click(); //SeliniumProject
		El1.getWelcome().click();
		El1.getBack123().click();


		}




		@Then("^User should be able to complete regsistration$")
		public void user_should_be_able_to_complete_regsistration() throws Throwable {
			driver.close();
		}
		
		
	// Module - 3			
		
	      	// pavan
		
		
			@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and click on login$")
			public void user_enters_something_and_something_and_click_on_login(String username, String password) throws Throwable {
				// Logins with the credentials provided
				E_learningLogin Elo = new E_learningLogin(driver);
				Elo.getAccount().sendKeys(username);
				Elo.getPassword().sendKeys(password);
				Elo.getNext().click();
			}

		    
		    @When("^User firstly verifys Course catalog section by clicking on it$")
		    public void user_firstly_verifys_course_catalog_section_by_clicking_on_it() throws Throwable {
		    
		    }

		    @When("^User enters \"([^\"]*)\" as a course name$")
		    public void user_enters_something_as_a_course_name(String selectedcourse) throws Throwable {
		    	E_learningCourseCatalog Elcc = new E_learningCourseCatalog(driver);
		    	// Selects course catagory
		    	Elcc.getCourseCatalog().click();
		    	// Enters "Technology" as course name
		    	Elcc.getSearchBox().sendKeys(selectedcourse);
			    Elcc.getSearchClick().click();
			    System.out.println("Course catalog section has been opened");
		    }

		    @Then("^User will go through course catalog$")
		    public void user_will_go_through_course_catalog() throws Throwable {
		    	E_learningCourseCatalog Elcc = new E_learningCourseCatalog(driver);
		    	Elcc.getTechnology().click();
		    	System.out.println("Technology course has been opened");
		    	
		    	// Facebook link
		    	
		    	Elcc.getFacebooklink().click(); // Selects facebook link to share the course
		    	// Window handling for controlling the child tab opened (Facebook login page)
		    	Set<String> windowHandle = driver.getWindowHandles();
		    	Iterator<String> iterator= windowHandle.iterator();
		    	String parentId=iterator.next();
		    	String childId=iterator.next();
		    	
		    	driver.switchTo().window(childId); // Switching to child tab to perform actions in it
		    	System.out.println("Facebook page has opened");
		    	driver.close();
		    	driver.switchTo().window(parentId);// Switching back to parent tab to continue the code execution flow
		    
		    	
		    	
		    	//Twitter link
		    	
		    	Elcc.getTwitterLink().click();// Selects twitter link to share the course
		    	// Window handling for controlling the child tab opened (twitter login page)
		    	Set<String> windowHandle1 = driver.getWindowHandles();
		    	Iterator<String> iterator1= windowHandle1.iterator();
		    	String parentId1=iterator1.next();
		    	String childId1=iterator1.next();
		    	driver.switchTo().window(childId1); // Switching to child tab to perform actions in it
		    	System.out.println("Twitter page has opened");
		    	driver.close();
		    	driver.switchTo().window(parentId1);// Switching back to parent tab to continue the code execution flow
		    	
		    	
		    	
		    	
		    	//Linkedin link
		    	
		    	Elcc.getLinkedinLink().click();	// Selects linkedin link to share the course
		    	// Window handling for controlling the child tab opened (linkedin login page)
		    	Set<String> windowHandle2 = driver.getWindowHandles();
		    	Iterator<String> iterator2= windowHandle2.iterator();
		    	String parentId2=iterator2.next();
		    	String childId2=iterator2.next();
		    	driver.switchTo().window(childId2);// Switching to child tab to perform actions in it
		    	System.out.println("Linkedin page has opened");
		    	driver.close();
		    	driver.switchTo().window(parentId2);// Switching back to parent tab to continue the code execution flow
		    	
		    	//Course homepage
		    	
		    	E_learningTechnology Elt= new E_learningTechnology(driver);
		    	Elcc.getCourseHome().click();
		    	
		    	
		    	// Description
		    	Elt.getDescription().click();
		    	System.out.println("Description of Technology is displayed");
		    	System.out.println(driver.findElement(By.id("description_1")).getText());
		    	driver.navigate().back();
		    	
		    	
		    	//Agenda
		    	Elt.getAgenda().click();
		    	driver.navigate().back();
		    	
		    	
		    	//Documents
		    	Elt.getDocuments().click();		    			    			    	
		    	driver.findElement(By.xpath("//*[@alt='View Slideshow']")).click();		    	
		    	driver.findElement(By.xpath("//*[@alt='Show Thumbnails']")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.xpath("//*[@alt='Gallery settings']")).click();		    
		    	driver.findElement(By.cssSelector("[value='autoresizing']")).click();
		    	driver.findElement(By.cssSelector("[alt='Back to Documents overview'")).click();
		    	JavascriptExecutor  js = (JavascriptExecutor)driver;
		    	js.executeScript("window.scrollBy(0,1000)", "");
		    	System.out.println(driver.findElement(By.id("document_quota")).getText());
		    	System.out.println("DBMS ppt has been downloaded");
		    	driver.findElement(By.linkText("DBMS.pptx")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	// Learning Path
		    	Elt.getLearningpath().click();
		    	driver.findElement(By.linkText("Agile methodology")).click();
		    	driver.findElement(By.xpath("//*[@id='btn-menu-float']/a")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	//Links
		    	Elt.getLinks().click();
		    	driver.findElement(By.linkText("Machine learning")).click();
		    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		    	Set<String>windowHandle3 = driver.getWindowHandles();
		    	Iterator<String> iterator3 = windowHandle3.iterator();
		    	String parentId3 = iterator3.next();
		    	String childId3 = iterator3.next();
		    	driver.switchTo().window(childId3);
		    	System.out.println("Youtube video of Machine Learning by Edureka is selected");
		    	driver.close();
		    	driver.switchTo().window(parentId3);
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	// Tests
		    	Elt.getTests().click();
		    	driver.findElement(By.linkText("Module exam")).click();
		    	driver.findElement(By.linkText("Start test")).click();
		    	driver.findElement(By.cssSelector("[value='1747']")).click();
		    	driver.findElement(By.xpath("//button[text()='Next question']")).click();
		    	driver.findElement(By.cssSelector("[value='1751']")).click();
		    	driver.findElement(By.xpath("//button[text()='Next question']")).click();
		    	driver.findElement(By.cssSelector("[value='1753']")).click();
		    	driver.findElement(By.xpath("//button[text()='Next question']")).click();
		    	driver.findElement(By.cssSelector("[value='1757']")).click();
		    	driver.findElement(By.xpath("//button[text()='Next question']")).click();
		    	driver.findElement(By.cssSelector("[value='1763']")).click();
		    	driver.findElement(By.xpath("//button[text()='End test']")).click();		    	
		    	js.executeScript("window.scrollBy(0,10000)", "");
		    	driver.findElement(By.linkText("Return to Course Homepage")).click();
		    	
		    	
		    	//Announcements
		    	Elt.getAnnouncements().click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	//Forums
		    	
		    	Elt.getForums().click();		    	
		    	driver.findElement(By.cssSelector("[alt='Search']")).click();
		    	driver.findElement(By.id("forumsearch_search_term")).sendKeys("Meeting 1");
		    	driver.findElement(By.id("forumsearch_submit")).click();
		    	driver.findElement(By.linkText("Forums")).click();
		    	driver.findElement(By.cssSelector("[title='Mini project group_1']")).click();
		    	driver.findElement(By.linkText("Group area Mini project group_1")).click();
		    	driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/ul/li[2]/a")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	// Dropbox
		    	
		    	Elt.getDropbox().click();
		    	driver.findElement(By.cssSelector("[alt='Share a new file']")).click();
		    	driver.findElement(By.linkText("Upload (Simple)")).click();
		    	driver.findElement(By.linkText("Dropbox")).click();
		    	driver.findElement(By.cssSelector("[alt='Add a new folder']")).click();
		    	driver.findElement(By.id("add_new_category_category_name")).sendKeys("Machine Learning");
		    	driver.findElement(By.id("add_new_category_StoreCategory")).click();
		    	driver.findElement(By.linkText("Received Files")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	// Groups
		    	
		    	Elt.getGroups().click();
		    	driver.findElement(By.linkText("Mini group_2")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    			    	
		    	
		    	
		    	
		    	// Assignments
		    	
		    	Elt.getAssignments().click();
		    	driver.findElement(By.linkText("Module-1 exam")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	// Surveys
		    	Elt.getSurveys().click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	// Wiki
		    	Elt.getWiki().click();
		    	driver.findElement(By.cssSelector("[alt='Search']")).click();
		    	driver.findElement(By.id("wiki_search_search_term")).sendKeys("Machine Learning");
		    	driver.findElement(By.id("wiki_search_SubmitWikiSearch")).click();
		    	driver.findElement(By.cssSelector("[alt='Statistics']")).click();
		    	driver.findElement(By.linkText("Most active users")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.linkText("Most visited pages")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.linkText("Most changed pages")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.linkText("Orphaned pages")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.linkText("Wanted pages")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.linkText("Pages most linked")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.cssSelector("[alt='All pages']")).click();
		    	driver.findElement(By.cssSelector("[alt='Latest changes']")).click();
		    	driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[3]/span/a")).click();
		    	driver.findElement(By.cssSelector("[alt='Home']")).click();	    
		    	driver.findElement(By.cssSelector("[alt='Edit this page']")).click();
		    
		    	// Wiki - Static Dropdown for selecting progress
		    	WebElement wikiDropDown = driver.findElement(By.id("wiki_progress"));
		    	Select dropDown = new Select(wikiDropDown);
		    	dropDown.selectByIndex(7);
		    	WebElement selectwikiDropDown= dropDown.getFirstSelectedOption();
		    	System.out.println("The progress is :"+selectwikiDropDown.getText());
		    	driver.findElement(By.id("wiki_SaveWikiChange")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	//Assessments
		    	
		    	Elt.getAssessments().click();
		    	driver.findElement(By.xpath("//*[@id=\"gradebook-student-actions\"]/div/div/a")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	// Glossary
		    	Elt.getGlossary().click();
		    	driver.findElement(By.cssSelector("[alt='Export']")).click();
		    	driver.findElement(By.id("export_format_xls_label")).click();
		    	driver.findElement(By.xpath("//span[text()='Download']")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.cssSelector("[alt='Export']")).click();
		    	driver.findElement(By.id("export_format_csv_label")).click();
		    	driver.findElement(By.xpath("//span[text()='Download']")).click();
		    	driver.navigate().back();
		    	driver.findElement(By.cssSelector("[alt='Export']")).click();
		    	driver.findElement(By.id("export_format_pdf_label")).click();
		    	driver.findElement(By.xpath("//span[text()='Download']")).click();
		    	driver.findElement(By.linkText("Glossary")).click();
		    	driver.findElement(By.cssSelector("[alt='List view']")).click();
		    	driver.findElement(By.id("search_keyword")).sendKeys("Selenium");
		    	driver.findElement(By.id("search_submit")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	
		    	
		    	//Notebook
		    	Elt.getNotebook().click();
		    	driver.findElement(By.cssSelector ("[alt='Add new note in my personal notebook']")).click();
		    	driver.findElement(By.name("note_title")).sendKeys("Selenium");
		    	driver.findElement(By.id("note_SubmitNote")).click();
		    	driver.findElement(By.linkText("Notebook")).click();
		    	driver.findElement(By.cssSelector("[alt='Sort by date created']")).click();		    
		    	driver.findElement(By.cssSelector("[alt='Sort by date last modified']")).click();
		    	driver.findElement(By.cssSelector("[alt='Sort by title']")).click();
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	
		    	
		    	
		    	//E-learning
		    	Elt.getElearning().click();
		    	Actions action = new Actions(driver);
		    	WebElement text = driver.findElement(By.xpath("//*[@id='search-blog']/div[2]/form/div/input[3]"));
		    	action.moveToElement(text);
		    	action.sendKeys("Automation");
		    	
		    	
		    	
		    	//Actions action1 = new Actions(driver);
		    	WebElement text1 = driver.findElement(By.xpath("//*[@id=\"search-blog\"]/div[2]/form/button"));
		    	action.moveToElement(text1);
		    	action.click();
		    	action.build();
		    	action.perform();		    	
		    	driver.findElement(By.cssSelector("[alt='Technology']")).click();
		    	driver.findElement(By.linkText("My courses")).click();
		    	driver.findElement(By.linkText("Course catalog")).click();		    	
		    	driver.findElement(By.linkText("2")).click();
		    	driver.findElement(By.linkText("60")).click();
		    	driver.findElement(By.linkText("My courses")).click();
		    }
		    
		    @Then("^Verify that login is succesful completed$")
		    public void verify_that_login_is_succesful_completed() throws Throwable {
		    	
		    }
		        
		    @Then("^close the window$")
		    public void close_the_window() throws Throwable {
		       driver.close();
		    }
		    
		
		    
// Module - 4
		    //Rohit
		    
		    @Given("E-learning login page is launched")
			public void e_learning_login_page_is_launched() {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
			}

			@When("User enters Username and Password")
			public void user_enters_username_and_password() {
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox


			}
			@Then("^click login$")
			public void click_login() {
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
			}

			@And("E-page is opened")
			public void e_page_is_opened() {
				String title = driver.getTitle();
				//stores the title of the page in the variable 'title'
				System.out.println(title);
				//prints the title in console
				Assert.assertEquals("My Organization - My education - My courses", title);
				//compares the title with predicted one

			}
			@Then("^close the Browser$")
			public void close_the_browser() throws Throwable {
				driver.close();
				//browser is closed
			}
			
			
			
			
			//Second Scenario
			
			
			@Given("^user is logged in and naviated to home page$")
			public void user_is_logged_in_and_naviated_to_home_page() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 			
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button

			}

			@Then("^click on the Personal Agenda$")
			public void click_on_the_personal_agenda() throws Throwable {
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
			}

			@And("^verify the page$")
			public void verify_the_page() throws Throwable {
				String actualUrl="http://elearningm1.upskills.in/main/calendar/agenda_js.php?type=personal"; 
				//actual url to verify the page
				String expectedUrl= driver.getCurrentUrl();
				//expected url to verify the page
				Assert.assertEquals(expectedUrl,actualUrl);
				//checks whether actual url equals expected url 

			}

			@Then("^Quit the browser$")
			public void quit_the_browser() throws Throwable {
				driver.close();
				//browser is closed

			}
			
			
			//3rd Scenario

			@Given("^User is logged in and directed to personal agenda page$")
			public void user_is_logged_in_and_directed_to_personal_agenda_page() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
			}

			@When("User Clicks on Red colured icon")
			public void user_clicks_on_red_colured_icon() throws InterruptedException {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				//clicks on red colured icon
				Thread.sleep(3000);
				//waits for 3 seconds

			}

			@Then("Current running month is displayed")
			public void current_running_month_is_displayed() {
				boolean Element1 =  driver.findElement(By.xpath("//h2[contains(text(),'November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element1);
				//Assertion gets successful when element is displayed


			}

			@And("Click on > button")
			public void click_on_button() {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
				//clicks on > button
			}
			@Then("^Succeeding month is displayed$")
			public void succeeding_month_is_displayed() throws InterruptedException {
				boolean Element2 =  driver.findElement(By.xpath("//h2[contains(text(),'December 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element2);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000);
				//waits for 3 seconds
			}
			@And("^Click on today$")
			public void click_on_today(){
				driver.findElement(By.xpath("//button[contains(text(),'today')]")).click();
				//clicks on today icon
			}

			@Then("^again Current running month is displayed$")
			public void again_current_running_month_is_displayed() throws InterruptedException{
				boolean Element3 =  driver.findElement(By.xpath("//h2[contains(text(),'November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element3);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000);
				//waits for 3 seconds
			}
			@And("^Click on < button$")
			public void click_on_button11()  {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[2]/span[1]")).click();
				//clicks on < button	
			}

			@Then("^Preceeding month is displayed$")
			public void preceeding_month_is_displayed() throws InterruptedException {
				boolean Element4 =  driver.findElement(By.xpath("//h2[contains(text(),'October 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element4);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000); //waits for 3 seconds
				driver.close();
				
			}
			
			
			
			
			//4th Scenario
			
			
			@Given("^User is Logged in and directed to Personal Agenda page$")
			public void user_is_logged_in_and_directed_to_personal_agenda_page1() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//Launches chrome browser
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
			}

			@When("^User Clicks on red colured icon and clicks on week,today options$")
			public void user_clicks_on_red_colured_icon_and_clicks_on_weektoday_options() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				//clicks on red colured icon
				Thread.sleep(1000);
				//waits for 1 seconds
				driver.findElement(By.xpath("//button[contains(text(),'week')]")).click();
				//clicks on red week button
				Thread.sleep(1000);
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'today')]")).click();
				//clicks on today button
				Thread.sleep(1000);
			}

			@Then("Current running week is displayed")
			public void current_running_week_is_displayed() throws InterruptedException {
				boolean Element4 =  driver.findElement(By.xpath("//h2[contains(text(),'22 – 28 Nov 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element4);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 2 seconds
			}
			@And("click on > button")
			public void click_on_button1() {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
				//clicks on > button
			}

			@Then("^Succeeding week is displayed$")
			public void succeeding_week_is_displayed() throws Throwable {
				boolean Element =  driver.findElement(By.xpath("//h2[contains(text(),'29 Nov – 5 Dec 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000);
				//waits for 3 seconds
			}
			@And("^click on today$")
			public void click_on_today1() throws Throwable {
				driver.findElement(By.xpath("//button[contains(text(),'today')]")).click();
				//clicks on today button
				Thread.sleep(3000);
				//waits for 3 seconds		
			}

			@Then("^again Current running week is displayed$")
			public void again_current_running_week_is_displayed() throws Throwable {
				boolean Element =  driver.findElement(By.xpath("//h2[contains(text(),'22 – 28 Nov 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000);
				//waits for 3 seconds		
			}
			@And("^click on < button$")
			public void click_on_button111() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[2]/span[1]")).click();
				//clicks on < button
			}

			@Then("^Preceeding week is displayed$")
			public void preceeding_week_is_displayed() throws Throwable {
				boolean Element =  driver.findElement(By.xpath("//h2[contains(text(),'15 – 21 Nov 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element);
				//Assertion gets successful when element is displayed
				Thread.sleep(3000);
				//waits for 3 seconds
			}

			@Then("^close the  browser$")
			public void close_the_browser11() throws Throwable {
				driver.close();
				//browser is closed
			}
			
			
			//5th Scenario
			
			
			
			@Given("^User is logged in and Directed to personal agenda Page$")
			public void user_is_logged_in_and_directed_to_personal_agenda_page0() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//Launches chrome browser 
			}

			@When("^User Clicks on red colured icon and clicks on day option$")
			public void user_clicks_on_red_colured_icon_and_clicks_on_day_option() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				//clicks on red coloured
				Thread.sleep(1000);
				//waits for 1 second
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[2]/div[1]/button[3]")).click();
				//clicks on day button
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[contains(text(),'today')]")).click();
				//clicks on today button
				Thread.sleep(1000);

			}

			@Then("^Current running day is displayed which is highlighted$")
			public void current_running_day_is_displayed_which_is_highlighted() throws Throwable {
				boolean Element5 =  driver.findElement(By.xpath("//h2[contains(text(),'22 November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element5);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 3 seconds
			}
			@And("click on > buttoN")
			public void click_on_butto_n9() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[3]/span[1]")).click();
				//clicks on > button
				Thread.sleep(2000);
				//waits for 2 seconds
			}



			@Then("^Succeeding day is displayed$")
			public void succeeding_day_is_displayed() throws Throwable {
				boolean Element5 =  driver.findElement(By.xpath("//h2[contains(text(),'23 November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element5);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 2 seconds
			}
			@And("^click on todaY$")
			public void click_on_today8() throws Throwable {
				driver.findElement(By.xpath("//button[contains(text(),'today')]")).click();
				//clicks on today button
				Thread.sleep(2000);
				//waits for 2 seconds
			}
			@Then("^again Current running day is displayed$")
			public void again_current_running_day_is_displayed() throws Throwable {
				boolean Element5 =  driver.findElement(By.xpath("//h2[contains(text(),'22 November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element5);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 3 seconds
			}
			@Then("click on < buttoN")
			public void click_on_butto_n() throws InterruptedException {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[3]/div[1]/div[1]/div[1]/button[2]/span[1]")).click();
				//clicks on < button
				Thread.sleep(2000);
				//waits for 2 seconds
			}


			@Then("^Preceeding day is displayed$")
			public void preceeding_day_is_displayed() throws Throwable {
				boolean Element5 =  driver.findElement(By.xpath("//h2[contains(text(),'21 November 2021')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element5);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 2 seconds
			}

			@Then("^close the  Browser$")
			public void close_the_browser111() throws Throwable {
				driver.close();
				//browser is closed
			}

		    //6th Scenario
			
			
			@Given("^Login with credentials and click Red icon$")
			public void login_with_credentials_and_click_red_icon() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				//clicks on red colured icon
				Thread.sleep(1000);
				//waits for 1 second
			}

			@Then("^click on any date$")
			public void click_on_any_date() throws Throwable {
				driver.findElement(By.xpath("//body[1]/main[1]/section[1]/div[1]/div[2]/div[1]/section[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]")).click();
				Thread.sleep(3000);
				//waits for 3 seconds
			}
			@And("^give event details and click add$")
			public void give_event_details_and_click_add() throws Throwable {
				driver.findElement(By.xpath("//input[@id='title']")).sendKeys("Selenium test");
				//fills the event text box
				Thread.sleep(3000);
				//waits for 3 seconds
				driver.findElement(By.xpath("//span[contains(text(),'Add')]")).click();
				//clicks on add button
			}

			@Then("^Verify event details$")
			public void verify_event_details() throws Throwable {
				boolean Element6 =  driver.findElement(By.xpath("//span[contains(text(),'Selenium test')]")).isDisplayed();
				//returns true or false whether it is displayed or not
				Assert.assertEquals(true, Element6);
				//Assertion gets successful when element is displayed
				Thread.sleep(2000);
				//waits for 3 seconds
			}
			@And("^quit this Browser$")
			public void quit_this_browser() throws Throwable {
				driver.close();
				//Browser is closed
			}
			
			//7th Scenario
			
			
			@Given("^Login with credentials and click Red__icon$")
			public void login_with_credentials_and_click_redicon() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).click();
				//clicks on red colured icon
				Thread.sleep(1000);
				//waits for 1 seconds
			}

			@When("^click on agenda_list$")
			public void click_on_agendalist() throws Throwable {
				driver.findElement(By.xpath("//button[contains(text(),'Agenda list')]")).click();
				//clicks on agenda list
				Thread.sleep(1000);
				//waits for 1 second

			}

			@Then("^All saved events can be seen$")
			public void all_saved_events_can_be_seen() throws Throwable {
				Thread.sleep(7000);
				//waits for 7 seconds

			}
			@And("^you can close the window$")
			public void you_can_close_the_window() throws Throwable {
				driver.close();
				//browser is closed
			}
			
			
			//8th Scenario

			@Given("^login with credentials and reach personal agenda$")
			public void login_with_credentials_and_reach_personal_agenda() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
				Thread.sleep(1000);
				//waits for 3 seconds
			}

			@Then("^click on Blue Coloured icon$")
			public void click_on_blue_coloured_icon() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[2]/img[1]")).click();
				//clicks on blue coloured icon
			}

			@And("^Agenda list is displayed$")
			public void agenda_list_is_displayed() throws Throwable {
				Thread.sleep(3000);
				//waits for 3 seconds
			}

			@Then("^quit and close$")
			public void quit_and_close() throws Throwable {
				driver.close();
				//browser is closed
			}
			
			
			//9th Scenario
			
			
			
			@Given("^login with credentials and Reach personal agenda$")
			public void login_with_credentials_and_Reach_personal_agenda() throws Throwable {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\pm54\\Desktop\\study material\\chromedriver_win32\\chromedriver.exe");
				driver= new ChromeDriver();
				//Launches chrome browser 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//waits for 10 seconds until no action takes 
				driver.manage().window().maximize();
				//maximizes chrome browser
				driver.get("http://elearningm1.upskills.in/");
				//navigates to login page page of E-Learning site
				driver.findElement(By.id("login")).sendKeys("Deekshith");
				//fills username textbox as deekshith
				driver.findElement(By.name("password")).sendKeys("qwertyQ1@");
				//fills password textbox
				driver.findElement(By.xpath("//button[@id='form-login_submitAuth']")).click();
				//clicks on login button
				driver.findElement(By.xpath("//a[contains(text(),'Personal agenda')]")).click();
				//clicks on Personal Agenda
				Thread.sleep(1000);
				//waits for 3 seconds
			}

			@Then("^click on Blue Coloured icon with dots$")
			public void click_on_blue_coloured_icon_with_dots() throws Throwable {
				driver.findElement(By.xpath("//body/main[@id='main']/section[@id='cm-content']/div[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/a[3]/img[1]")).click();
				//clicks on blue coloured icon with
			}

			@And("^sessions is displayed$")
			public void sessions_is_displayed() throws Throwable {
				Thread.sleep(3000);
				//waits for 3 seconds
			}

			@Then("^quit , close$")
			public void quit_close() throws Throwable {
				driver.close();
				//Browser is closed
			}
		    
		    
			 
			
			
			// Module - 5
			// Deekshit
			
			
			//Social networking



			@Given("^Start the browser with chrome$")
			public void start_the_browser_with_chrome() throws Throwable {
			// initializes the driver
			driver = initializeDriver();
			// opens the link using the driver
			driver.get("http://elearningm1.upskills.in/index.php");
			// maximizes the screen
			driver.manage().window().maximize();
			}



			@When("^enter credentials (.+) and (.+) and login$")
			public void enter_credentials_and_and_login(String username, String password) throws Throwable {
			// create instance for social networking
			SocialNetworking S1= new SocialNetworking(driver);
			// giving username and password
			S1.getAccount().sendKeys(username);
			S1.getPassword().sendKeys(password);
			//click on next to continue
			S1.getNext().click();
			}



			@And("^goto to \"([^\"]*)\"$")
			public void goto_to_something(String strArg1) throws Throwable {

			}





			@Given("^My courses page will be present$")
			public void my_courses_page_will_be_present() throws Throwable {

			}



			@When("^User clicks on socialnetwork$")
			public void user_clicks_on_socialnetwork() throws Throwable {
			// create instance for social networking
			SocialNetworking Sn = new SocialNetworking(driver);
			// clicking on social network module
			Sn.getSocnet().click();
			// actual url to compare
			String actualUrl="http://elearningm1.upskills.in/main/social/home.php";
			// expected url which is driven by driver
			String expectedUrl= driver.getCurrentUrl();
			// Comparing the expected url with actual url
			Assert.assertEquals(expectedUrl,actualUrl);

			}




			@Then("^Social Networking page will be opened$")
			public void social_networking_page_will_be_opened() throws Throwable {
			}




			//Social Wall



			@When("User enters text in the textbox")
			public void user_enters_text_in_the_textbox() throws Throwable {
			// create instance for social networking
			SocialWall s1 = new SocialWall(driver);
			// passing information
			s1.getText().sendKeys("testing is being done");
			}



			@And("clicks on the post button")
			public void clicks_on_the_post_button() throws Throwable {
			// create instance for SocialWall
			SocialWall p1 = new SocialWall(driver);
			// clicking on post
			p1.getPost().click();
			}




			@And("then the text will get posted")
			public void then_the_text_will_get_posted() throws Throwable {

			}



			@Then("^close the tab$")
			public void close_the_tab() throws Throwable {
			// closes the browser
			driver.close();
			}




			//My friends



			@When("^user searches name of a person in the search box$")
			public void user_searches_name_of_a_person_in_the_search_box() throws Throwable {
			// create instance for MyFriends
			MyFriends f1 = new MyFriends(driver);
			// passing information
			f1.getBox().sendKeys("Deekshith Saganti");
			}



			@When("^user to sends invitation to a person given down in the list by clicking on invitation$")
			public void user_to_sends_invitation_to_a_person_given_down_in_the_list_by_clicking_on_invitation() throws Throwable {
			// create instance for MyFriends
			MyFriends i1 = new MyFriends(driver);
			// click on invite
			i1.getInvite().click();
			}



			@Then("^list of names are displayed$")
			public void list_of_names_are_displayed() throws Throwable {

			}



			@Then("^the invite is sent $")
			public void the_invite_is_sent() throws Throwable {

			}



			@And("^hits search key$")
			public void hits_search_key() throws Throwable {
			// create instance for MyFriends
			MyFriends h1 = new MyFriends(driver);
			// click on search
			h1.getSearch().click();
			}



			@And("^the sendmessage box has to be hit$")
			public void the_sendmessage_box_has_to_be_hit() throws Throwable {
			// create instance for MyFriends
			MyFriends sm1 = new MyFriends(driver);
			// click on send message
			sm1.getSendmess().click();
			}



			@And("^the message has to be written$")
			public void the_message_has_to_be_written() throws Throwable {
			// create instance for MyFriends
			MyFriends mes1 = new MyFriends(driver);
			// passing information
			mes1.getMessage().sendKeys("Automate testing a website");
			}
			@Then("^close the windows$")
			public void close_the_windows() throws Throwable {
			// close the window
			driver.close();
			}



			//skill set



			@When("^user clicks on dropdown button and selects skill report$")
			public void user_clicks_on_dropdown_button_and_selects_skill_report() throws Throwable {
			// create instance for SkillSet
			SkillSet dd = new SkillSet(driver);
			// click on dropdown
			dd.getDropdown().click();
			// create instance for SkillSet
			SkillSet sk1 = new SkillSet(driver);
			// click on send report
			sk1.getSkirep().click();
			// navigate back
			driver.navigate().back();
			// click on dropdown
			dd.getDropdown().click();
			}




			@And("^clicks on skill wheel,Get new skill,Display options$")
			public void clicks_on_skill_wheelget_new_skilldisplay_options() throws Throwable {
			// create instance for SkillSet
			SkillSet sw = new SkillSet(driver);
			// click on skill wheel
			sw.getSkiwhe().click();
			// create instance for SkillSet
			SkillSet nsk = new SkillSet(driver);
			// click on new skill
			nsk.getNewski().click();
			// create instance for SkillSet
			SkillSet dso = new SkillSet(driver);
			// click on display options
			dso.getDisop().click();
			}




			@Then("^changes the color$")
			public void changes_the_color() throws Throwable {
			// create instance for SkillSet
			SkillSet sc = new SkillSet(driver);
			// click on white
			sc.getWhite().click();
			// click on Black
			sc.getBlack().click();
			// click on Light blue
			sc.getLiblu().click();
			// click on Gray
			sc.getGray().click();
			// click on Corn
			sc.getCorn().click();
			// navigating back
			driver.navigate().back();
			// create instance for SkillSet
			SkillSet dd = new SkillSet(driver);
			// click on dropdown
			dd.getDropdown().click();
			}



			@Then("^clicks on Your skill ranking$")
			public void clicks_on_your_skill_ranking() throws Throwable {
			// create instance for SkillSet
			SkillSet sr = new SkillSet(driver);
			// click on skill rank
			sr.getSkira().click();
			// navigating back
			driver.navigate().back();
			}





			//my profile



			@When("^User clicks on profile and edit profile$")
			public void user_clicks_on_profile_and_edit_profile() throws Throwable {
			// create instance for MyProfile
			MyProfile ed1 = new MyProfile(driver);
			// click on edit profile
			ed1.getEditprof().click();
			}



			@Then("^enters credentials and saves$")
			public void enters_credentials_and_saves() throws Throwable {
			// create instance for MyProfile
			MyProfile cre1 = new MyProfile(driver);
			// passing information
			cre1.getPass().sendKeys("pavan12!@34#$");
			// passing information
			cre1.getNewpass().sendKeys("pavan12!@34#$");
			// passing information
			cre1.getConfirm().sendKeys("pavan12!@34#$");
			// create instance for MyProfile
			MyProfile svsa1 = new MyProfile(driver);
			// clicks on save
			svsa1.getSavse().click();
			// navigate back
			driver.navigate().back();
			driver.navigate().back();
			// closes the window
			driver.close();
			}




			//groups



			@When("^user clicks on the social groups and selects groups$")
			public void user_clicks_on_the_social_groups_and_selects_groups() throws Throwable {
			// create instance for Groups
			Groups gr = new Groups(driver);
			// clicks on my groups
			gr.getGroup().click();
			// create instance for Groups
			Groups nw = new Groups(driver);
			// clicks on popular
			nw.getPopular().click();
			}



			@Then("^user clicks on one of the groups$")
			public void user_clicks_on_one_of_the_groups() throws Throwable {
			// create instance for Groups
			Groups c1 = new Groups(driver);
			// click on one group to become a member
			c1.getClick1().click();
			driver.close();
			}



			
			
	}
	
	
			
		    
		    
			
	  
		    
		   
		 
	
		
								

	
