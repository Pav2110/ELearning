package e_learningPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class E_learningCourses {


public WebDriver driver;



// Login with wrong credentials
By user = By.cssSelector("[placeholder='Username']");
By password = By.cssSelector("[placeholder='Pass']");
By next = By.name("submitAuth");




//Sort course
By SortCourse = By.linkText("Sort courses");
By Description = By.xpath("//*[@title='Course description - Technology']");
By Edit = By.xpath("//*[@title='Edit']");
//By Dow = By.xpath("//*[@alt='down']");
By Create =By.xpath("//*[@title='Create a personal courses category']");
By Name = By.xpath("//*[@class='form-control']");
By Add = By.id("create_course_category_create_course_category");

/*By Close=By.xpath("//*//*[@id='cm-conten']/div/a[4]/img]");
By Up = By.xpath("//*[@src='http://elearningm1.upskills.in/main/img/icons/22/up.png']"); */


//Course history

By Home=By.xpath("//*[@title='Homepage']");
By History=By.linkText("Courses history");
By DisplayCourse=By.linkText("Display courses list");
By Testing= By.xpath("//*[@alt='123testing']");
By Coursedescription=By.xpath("//*[@title='Course description']");
By Agenda = By.id("toolimage_1743");
By Document=By.id("toolimage_1744");
By Doc=By.xpath("//*[@id='search_document_keyword']");
By D=By.xpath("//*[@id='search_document_submit']");
By Click1=By.xpath("//*[@alt='123testing']");
By Learningpath=By.id("toolimage_1745");
By Links1=By.id("toolimage_1746");
By Tests=By.id("toolimage_1747");
By Mtest=By.xpath("//*[@href='overview.php?cidReq=TES&id_session=0&gidReq=0&gradebook=0&origin=&exerciseId=108']");

By PrTest=By.linkText("Proceed with the test");
By Click2=By.partialLinkText("btn btn-success btn-large");
By Back1=By.xpath("//*[@alt='123testing']");


By Announcements=By.id("toolimage_1748");
By Forums=By.id("toolimage_1749");
By ForumsThread=By.xpath("//*[@title='Group 0001']");
By BackTo=By.xpath("//*[@title='Back to Groups']");

By Groupdoc=By.xpath("//*[@alt='Documents']");
By Searchbox1=By.xpath("//*[@name='keyword']");

By Submit=By.xpath("//*[@name='submit']");
By Chatfile=By.xpath("//*[@src='http://elearningm1.upskills.in/main/img/icons/22/folder_document.png']");
By Back2=By.xpath("//*[@alt='123testing']");

By Dropbox=By.id("toolimage_1750");
By Share=By.xpath("//*[@alt='Share a new file']");
By Back12=By.xpath("//*[@alt='123testing']");
By Users=By.id("toolimage_1751");
By Pgclick=By.xpath("//*[@title='Last page']");
By Back123=By.xpath("//*[@alt='123testing']");
//
By Groups=By.id("toolimage_1752");
By Searchbox=By.id("search_groups_keyword");
By Searchclick=By.xpath("//*[@name='submit']");
//By Back010=By.xpath("//*[@alt='123testing']");

By Assignments=By.id("toolimage_1754");
By Ani=By.linkText("Ani");
By Back20=By.xpath("//*[@alt='123testing']");
By Surveys=By.id("toolimage_1755");
By Wiki=By.id("toolimage_1756");
By Allpages=By.xpath("//*[@title='All pages']");
By Latestchanges=By.xpath("//*[@title='Latest changes']");
By Back03=By.xpath("//*[@alt='123testing']");
By Assessments=By.id("toolimage_1757");
By Download=By.xpath(" //*[@class='btn btn-default']");
By Back04=By.xpath("//*[@alt='123testing']");
By Glossary=By.id("toolimage_1758");
By Export=By.xpath("//*[@alt='Export']");
By Downloadd=By.xpath("//*[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']");
By Lineview=By.xpath("//*[@alt='List view']");

By Notebook=By.id("toolimage_1759");
By Createnote=By.xpath("//*[@alt='Add new note in my personal notebook']");
By Notetitle=By.xpath("//*[@class='form-control']");
By Addnote=By.xpath("//*[@name='SubmitNote']");
By Seliniumproject=By.id("toolimage_9796");
By Welcome=By.xpath("//*[@title='Welcome !']");







public E_learningCourses (WebDriver driver) {
this.driver= driver;
}



public WebElement getAccount() {
return driver.findElement(user);

}
public WebElement getPassword() {
return driver.findElement(password);
}
public WebElement getNext() {
return driver.findElement(next);

}


//Sort Course
public WebElement getSortCourse() {
return driver.findElement(SortCourse);
}
public WebElement getDescription() {
return driver.findElement(Description);
}
public WebElement getEdit() {
return driver.findElement(Edit);
}
//public WebElement getValidate() {
//return driver.findElement(Validate);
//}
//public WebElement getDow() {
//return driver.findElement(Dow);
//}
public WebElement getCreate() {
return driver.findElement(Create);
}
public WebElement getName() {
return driver.findElement(Name);
}
public WebElement getAdd() {
return driver.findElement(Add);
}

/*public WebElement getClose() {
return driver.findElement(Close);
}
public WebElement getUp() {
return driver.findElement(Up);
}*/
public WebElement getHome() {
return driver.findElement(Home);
}

//Course History

public WebElement getHistory() {
return driver.findElement(History);

}
public WebElement getDisplayCourse() {
return driver.findElement(DisplayCourse);

}
public WebElement getTesting() {
return driver.findElement(Testing);

}

public WebElement getCoursedescription() {
return driver.findElement(Coursedescription);
}
public WebElement getAgenda() {
return driver.findElement(Agenda);
}
public WebElement getDocument() {
return driver.findElement(Document);
}
public WebElement getDoc() {
return driver.findElement(Doc);
}
public WebElement getD() {
return driver.findElement(D);
}
public WebElement getClick1() {
return driver.findElement(Click1);
}

public WebElement getLearningpath() {
return driver.findElement(Learningpath);
}

public WebElement getLinks1() {
return driver.findElement(Links1);
}
public WebElement getTests() {
return driver.findElement(Tests);
}
public WebElement getMtest() {
return driver.findElement(Mtest);
}

public WebElement getPrTest() {
return driver.findElement(PrTest);
}



public WebElement getClick2() {
return driver.findElement(Click2);
}
public WebElement getBack1() {
return driver.findElement(Back1);
}
public WebElement getAnnouncements() {
return driver.findElement(Announcements);
}
public WebElement getForums() {
return driver.findElement(Forums);
}
public WebElement getForumsThread() {
return driver.findElement(ForumsThread);
}
public WebElement getBackTo() {
return driver.findElement(BackTo);
}
public WebElement getGroupdoc() {
return driver.findElement(Groupdoc);

}
public WebElement getSearchbox1() {
return driver.findElement(Searchbox1);

}

public WebElement getSubmit() {
return driver.findElement(Submit);

}
public WebElement getChatfile() {
return driver.findElement(Chatfile);

}
public WebElement getBack2() {
return driver.findElement(Back2);

}

public WebElement getDropbox() {
return driver.findElement(Dropbox);
}
public WebElement getShare() {
return driver.findElement(Share);
}
public WebElement getBack12() {
return driver.findElement(Back12);
}
public WebElement getUsers() {
return driver.findElement(Users);
}
public WebElement getPgclick() {
return driver.findElement(Pgclick);

}
public WebElement getBack123() {
return driver.findElement(Back123);
}
public WebElement getGroups() {
return driver.findElement(Groups);
}
public WebElement getSearchbox() {
return driver.findElement(Searchbox);
}
public WebElement getSearchclick() {
return driver.findElement(Searchclick);
}


public WebElement getAssignments() {
return driver.findElement(Assignments);
}
public WebElement getAni() {
return driver.findElement(Ani);
}
public WebElement getBack20() {
return driver.findElement(Back20);
}
public WebElement getSurveys() {
return driver.findElement(Surveys);
}
public WebElement getWiki() {
return driver.findElement(Wiki);
}
public WebElement getAllpages() {
return driver.findElement(Allpages);
}
public WebElement getLatestchanges() {
return driver.findElement(Latestchanges);
}
public WebElement getBack03() {
return driver.findElement(Back03);
}
public WebElement getAssessments() {
return driver.findElement(Assessments);
}
public WebElement getDownload() {
return driver.findElement(Download);
}
public WebElement getBack04() {
return driver.findElement(Back04);
}

public WebElement getGlossary() {
return driver.findElement(Glossary);
}
public WebElement getExport() {
return driver.findElement(Export);
}

public WebElement getDownloadd() {
return driver.findElement(Downloadd);
}
public WebElement getLineview() {
return driver.findElement(Lineview);
}



public WebElement getNotebook() {
return driver.findElement(Notebook);

}
public WebElement getCreatenote() {
return driver.findElement(Createnote);

}
public WebElement getNotetitle() {
return driver.findElement(Notetitle);

}
public WebElement getAddnote() {
return driver.findElement(Addnote);

}
public WebElement getSeliniumproject() {
return driver.findElement(Seliniumproject);
}
public WebElement getWelcome() {
return driver.findElement(Welcome);
}

}