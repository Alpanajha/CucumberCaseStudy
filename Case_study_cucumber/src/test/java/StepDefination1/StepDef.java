package StepDefination1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	public static WebDriver driver;
	@Given("^user open TestMeApp$")
	public void userOpenTestmeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS); 
	}
	
	@When("^user click signup$")
	public void signup()
	{
		driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	@When("^user click signin$")
	public void signin()
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	
	@When("^user enter credentials as$")
	public void entercredentials(DataTable dt)
	{
		List<String> cred = dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}
	@When("^enter username as \"([^\"]*)\"$")
	public void enterusername(String uname) {
		driver.findElement(By.name("userName")).sendKeys(uname);
	}
	
	@When("^enter first name as \"([^\"]*)\"$")
	public void enterfirstname(String fname) {
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}
	
	@When("^enter last name as \"([^\"]*)\"$")
	public void enterlastname(String lname) {
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	
	@When("^enter password as \"([^\"]*)\"$")
	public void enterpassword(String pass) {
		driver.findElement(By.name("password")).sendKeys(pass);
	}
	
	@When("^enter confirm password as \"([^\"]*)\"$")
	public void enterconfirmpassword(String cpass) {
		driver.findElement(By.name("confirmPassword")).sendKeys(cpass);
	}
	
	@When("^user select gender as \"([^\"]*)\"$")
	public void selectgender(String gender) {
		if(gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}else if(gender.equalsIgnoreCase("female"))
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	}
	
	@When("^enter email as \"([^\"]*)\"$")
	public void email(String email) {
		driver.findElement(By.name("emailAddress")).sendKeys(email);
	}
	
	@When("^enter mobile number as \"([^\"]*)\"$")
	public void entermobile(String mobile) {
		driver.findElement(By.name("mobileNumber")).sendKeys(mobile);
	}
	
	@When("^enter dob as \"([^\"]*)\"$")
	public void enterdob(String dob) {
		driver.findElement(By.name("dob")).sendKeys(dob);
	}
	
	@When("^enter address as \"([^\"]*)\"$")
	public void enteraddress(String address) {
		driver.findElement(By.name("address")).sendKeys(address);
	}
	
	
	@When("^enter security question$")
	public void securityquestion() {
		Select s=new Select(driver.findElement(By.name("securityQuestion")));
		s.selectByIndex(1);
	}
	@When("^enter answer as \"([^\"]*)\"$")
	public void enteranswer(String ans) {
		driver.findElement(By.name("answer")).sendKeys(ans);
	}
	@Then("^user registered sucessfully$")
	public void registersucessfully() {
		System.out.println("User register sucessfully");
	}
	@When("^user enters product$")
	public void usersearch(DataTable dt) {
		List<String> prod=dt.asList(String.class);
		driver.findElement(By.name("products")).sendKeys(prod.get(0));
	}
	@And("^user finds product$")
	public void userfindsproduct() {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}
	@Then("^user add product to cart$")
	public void Addtocart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}
	
	
}
