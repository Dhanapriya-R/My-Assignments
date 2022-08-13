package week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSeleniumBasic {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
	//<input class="inputLogin" type="text" id="username" name="USERNAME" size="50">
		//driver.findElement(By.id("username"));
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		//<input class="inputLogin" type="password" id="password" name="PASSWORD" size="50">
		WebElement elementPassWord = driver.findElement(By.name("PASSWORD"));
		elementPassWord.sendKeys("crmsfa");
		//<input class="decorativeSubmit" type="submit" value="Login">
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementWelcomeMessage = driver.findElement(By.tagName("h2"));
		String text = elementWelcomeMessage.getText();
		System.out.println(text);
		
		WebElement elementCRMSFA = driver.findElement (By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		//<a href="/crmsfa/control/leadsMain" id="ext-gen857">Leads</a>
		WebElement elementLeads = driver.findElement (By.linkText("Leads"));
		elementLeads.click();
		//<a href="/crmsfa/control/createLeadForm" class="selected" id="ext-gen591">Create Lead</a>
		WebElement elementCreateLead= driver.findElement (By.linkText("Create Lead"));
		elementCreateLead.click();
		//<input type="text" class="inputBox" name="companyName" size="30" maxlength="100" id="createLeadForm_companyName">
		WebElement elementCompanyName= driver.findElement (By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("TestLeaf");
		//<input type="text" class="inputBox" name="firstName" size="30" maxlength="100" id="createLeadForm_firstName">
		WebElement elementFirstName= driver.findElement (By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("DhanaPriya");
		//<input type="text" class="inputBox" name="lastName" size="30" maxlength="100" id="createLeadForm_lastName">
		WebElement elementlastName= driver.findElement (By.id("createLeadForm_lastName"));
		elementlastName.sendKeys("Ravi");
		//<select class="inputBox" name="dataSourceId" id="createLeadForm_dataSourceId" size="1"><option value="">&nbsp;</option><option value="LEAD_COLDCALL">Cold Call</option><option value="LEAD_CONFERENCE">Conference</option><option value="LEAD_DIRECTMAIL">Direct Mail</option><option value="LEAD_EMPLOYEE">Employee</option><option value="LEAD_EXISTCUST">Existing Customer</option><option value="LEAD_OTHER">Other</option><option value="LEAD_PARTNER">Partner</option><option value="LEAD_PR">Public Relations</option><option value="LEAD_SELFGEN">Self Generated</option><option value="LEAD_TRADESHOW">Tradeshow</option><option value="LEAD_WEBSITE">Website</option><option value="LEAD_WORDOFMOUTH">Word of Mouth</option></select>
		WebElement LocatingSourceDD= driver.findElement (By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select(LocatingSourceDD);
		(sourceDD).selectByIndex (2);
		//<select class="inputBox" name="marketingCampaignId" id="createLeadForm_marketingCampaignId" size="1"><option value="">&nbsp;</option><option value="9002">Affiliate Sites</option><option value="CATRQ_AUTOMOBILE">Automobile</option><option value="CATRQ_CARNDRIVER">Car and Driver</option><option value="CATRQ_CAMPAIGNS">Catalog Generating Marketing Campaigns</option><option value="DEMO_MKTG_CAMP">Demo Marketing Campaign</option><option value="9000">eCommerce Site Internal Campaign</option><option value="9001">Pay Per Click Advertising</option><option value="CATRQ_ROADNTRACK">Road and Track</option></select>
		WebElement LocatingmarketingCampaign= driver.findElement (By.name("marketingCampaignId"));
		Select LocateMarketDD = new Select(LocatingmarketingCampaign);
		(LocateMarketDD).selectByVisibleText ("Automobile");
		//<select class="inputBox" name="industryEnumId" id="createLeadForm_industryEnumId" size="1"><option value="">&nbsp;</option><option value="IND_AEROSPACE">Aerospace</option><option value="IND_HARDWARE">Computer Hardware</option><option value="IND_SOFTWARE">Computer Software</option><option value="IND_DISTRIBUTION">Distribution</option><option value="IND_FINANCE">Finance</option><option value="IND_GEN_SERVICES">General Services</option><option value="IND_HEALTH_CARE">Health Care</option><option value="IND_INSURANCE">Insurance</option><option value="IND_MANUFACTURING">Manufacturing</option><option value="IND_MEDIA">Media</option><option value="IND_NON_PROFIT">Non-profit</option><option value="IND_REAL_ESTATE">Real Estate</option><option value="IND_RETAIL">Retail</option><option value="IND_ETAILER">E-tailer</option><option value="IND_TELECOM">Telecommunications</option><option value="IND_PRESS">Press</option></select>
		WebElement Locatingindustry= driver.findElement (By.id("createLeadForm_industryEnumId"));
		Select LocateindustryDD = new Select(Locatingindustry);
		(LocateindustryDD).selectByValue ("IND_INSURANCE");
		//<input type="text" class="inputBox" name="departmentName" size="30" maxlength="100" id="createLeadForm_departmentName">
		WebElement LocateDepartment  = driver.findElement (By.id("createLeadForm_departmentName"));
		LocateDepartment.sendKeys("Testing");
		//<textarea class="inputBox" name="description" cols="60" rows="3" id="createLeadForm_description"></textarea>
		WebElement LocatingDescription = driver.findElement (By.id("createLeadForm_description"));
		LocatingDescription.sendKeys("Automation Testing");
		//<input type="text" class="inputBox" name="primaryEmail" size="30" maxlength="100" id="createLeadForm_primaryEmail">
		WebElement LocateEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
		LocateEmail.sendKeys("priyar473@gmail.com");
		//<select class="inputBox" name="generalStateProvinceGeoId" id="createLeadForm_generalStateProvinceGeoId" size="1"><option value="">&nbsp;</option><option value="USA-84057">84057</option><option value="AL">Alabama</option><option value="AK">Alaska</option><option value="AZ">Arizona</option><option value="AR">Arkansas</option><option value="AA">Armed Forces Americas</option><option value="AE">Armed Forces Europe</option><option value="AP">Armed Forces Pacific</option><option value="CA">California</option><option value="CO">Colorado</option><option value="CT">Connecticut</option><option value="DE">Delaware</option><option value="DC">District of Columbia</option><option value="FL">Florida</option><option value="GA">Georgia</option><option value="GU">Guam</option><option value="HI">Hawaii</option><option value="ID">Idaho</option><option value="IL">Illinois</option><option value="IN">Indiana</option><option value="IA">Iowa</option><option value="KS">Kansas</option><option value="KY">Kentucky</option><option value="LA">Louisiana</option><option value="ME">Maine</option><option value="MD">Maryland</option><option value="MA">Massachusetts</option><option value="MI">Michigan</option><option value="MN">Minnesota</option><option value="MS">Mississippi</option><option value="MO">Missouri</option><option value="MT">Montana</option><option value="NE">Nebraska</option><option value="NV">Nevada</option><option value="NH">New Hampshire</option><option value="NJ">New Jersey</option><option value="NM">New Mexico</option><option value="NY">New York</option><option value="NC">North Carolina</option><option value="ND">North Dakota</option><option value="OH">Ohio</option><option value="OK">Oklahoma</option><option value="OR">Oregon</option><option value="PA">Pennsylvania</option><option value="PR">Puerto Rico</option><option value="RI">Rhode Island</option><option value="SC">South Carolina</option><option value="SD">South Dakota</option><option value="TN">Tennessee</option><option value="TX">Texas</option><option value="UT">Utah</option><option value="VT">Vermont</option><option value="VI">Virgin Islands</option><option value="VA">Virginia</option><option value="WA">Washington</option><option value="WV">West Virginia</option><option value="WI">Wisconsin</option><option value="WY">Wyoming</option></select>
		WebElement LocateState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state = new Select(LocateState);
		state.selectByValue("NY");
		//<input type="submit" class="smallSubmit" name="submitButton" value="Create Lead" id="ext-gen725">
		WebElement LocateCreateButton = driver.findElement(By.id("ext-gen725"));
		LocateCreateButton.click();
}
}