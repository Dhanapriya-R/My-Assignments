package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");
			
			//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
			WebElement LocateUserName = driver.findElement(By.id("username"));
			LocateUserName.sendKeys("Demosalesmanager");
			
			//<input class="inputLogin" type="password" id="password" name="PASSWORD" size="50">
			WebElement LocatePassword = driver.findElement(By.id("password"));
			LocatePassword.sendKeys("crmsfa");
			
			//<input class="decorativeSubmit" type="submit" value="Login">
			WebElement LocateLogin = driver.findElement(By.className("decorativeSubmit"));
			LocateLogin.click();

			//<a style="color: black;" href="/crmsfa/control/main?externalLoginKey=EL898329762371">
          //  CRM/SFA
        //  </a>			
           WebElement ClickLink =driver.findElement(By.linkText("CRM/SFA"));
            ClickLink.click();
          
            WebElement locateLead = driver.findElement (By.linkText("Leads"));
    		locateLead.click();
    		
    		WebElement locatecreateLead = driver.findElement (By.linkText("Create Lead"));
    		locatecreateLead.click();
    		
           //<input type="text" class="inputBox" name="companyName" size="30" maxlength="100" id="createLeadForm_companyName">
            WebElement LocateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
            LocateCompanyName.sendKeys("TestLeaf");
           
            //<input type="text" class="inputBox" name="firstName" size="30" maxlength="100" id="createLeadForm_firstName">
            WebElement LocateFirstName = driver.findElement(By.id("createLeadForm_firstName"));
            LocateFirstName.sendKeys("Dhanapriya");
           
            //<input type="text" class="inputBox" name="lastName" size="30" maxlength="100" id="createLeadForm_lastName">
            WebElement LocateLastName = driver.findElement(By.id("createLeadForm_lastName"));
           LocateLastName.sendKeys("Ravi");
          
           //<input type="text" class="inputBox" name="firstNameLocal" size="30" maxlength="100" id="createLeadForm_firstNameLocal">
            WebElement LocateFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
            LocateFirstNameLocal.sendKeys("Priya");
           
            //<input type="text" class="inputBox" name="departmentName" size="30" maxlength="100" id="createLeadForm_departmentName">
            WebElement LocateDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
            LocateDepartment.sendKeys("Testing");
           
            //<textarea class="inputBox" name="description" cols="60" rows="3" id="createLeadForm_description"></textarea>
            WebElement LocateDescription = driver.findElement(By.id("createLeadForm_description"));
            LocateDescription.sendKeys("Automation Testing");
           
            //<input type="text" class="inputBox" name="primaryEmail" size="30" maxlength="100" id="createLeadForm_primaryEmail">
            WebElement LocateEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
            LocateEmail.sendKeys("priyar473@gmail.com");
            
            //<select class="inputBox" name="generalStateProvinceGeoId" id="createLeadForm_generalStateProvinceGeoId" size="1"><option value="">&nbsp;</option><option value="USA-84057">84057</option><option value="AL">Alabama</option><option value="AK">Alaska</option><option value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="AA">Armed Forces Americas</option><option value="AE">Armed Forces Europe</option><option value="AP">Armed Forces Pacific</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DE">Delaware</option><option value="DC">District of Columbia</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="GU">Guam</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="PR">Puerto Rico</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennessee</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VI">Virgin Islands</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option></select>
            WebElement LocateState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
            Select State = new Select(LocateState);
            
            //<option value="NY">New York</option>
            State.selectByVisibleText("New York");
           
            //<input type="submit" class="smallSubmit" name="submitButton" value="Create Lead" id="ext-gen751">
            WebElement Locatesubmit = driver.findElement(By.name("submitButton"));
            Locatesubmit.click();
        
            //<a class="subMenuButton" href="duplicateLeadForm?partyId=18736" id="ext-gen581">Duplicate Lead</a>
           WebElement LocateDuplicateLeads = driver.findElement(By.linkText("Duplicate Lead"));
            LocateDuplicateLeads.click();
            
         WebElement LocatedupCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
         LocatedupCompanyName.clear();
         
          WebElement LocatedupCompname = driver.findElement(By.className("inputBox"));
          LocatedupCompname.sendKeys("Harness");
          
           
          WebElement LocatedupFirstName = driver.findElement(By.id("createLeadForm_firstName"));
          LocatedupFirstName.clear();
          
           WebElement LocatedupFstName = driver.findElement(By.id("createLeadForm_firstName"));
           LocatedupFstName.sendKeys("Dhana");
           
           WebElement Locatedupsubmit = driver.findElement(By.className("smallSubmit"));
           Locatedupsubmit.click();
           
}
}