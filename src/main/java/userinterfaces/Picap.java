package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/automation-practice-form")
public class Picap extends PageObject{
		
	public static final Target NAME = Target.the("NAME")
			.located(By.id("firstName"));
	
	public static final Target LAST_NAME = Target.the("LAST NAME")
			.located(By.id("lastName"));
	
	public static final Target EMAIL = Target.the("EMAIL")
			.located(By.id("userEmail"));
	
	public static final Target GENDER = Target.the("GENDER")
			.locatedBy("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']/div/input");
	
	public static final Target LBLGENDER = Target.the("LABEL GENDER")
			.locatedBy("//div[@id='genterWrapper']//div[@class='col-md-9 col-sm-12']/div/label");

	public static final Target PHONE = Target.the("PHONE")
			.located(By.id("userNumber"));
	
	public static final Target btnOpenCalendar = Target.the("btnOpenCalendar")
			.located(By.id("dateOfBirthInput"));
	
	public static final Target SELECT_MOUNTH = Target.the("MES")
			.locatedBy("//select[@class='react-datepicker__month-select']");
	
	public static final Target SELECT_YEAR = Target.the("AÑO")
			.locatedBy("//select[@class='react-datepicker__year-select']");
	
	public static final Target SELECT_DAY = Target.the("DIA")
			.locatedBy("//div[@class='react-datepicker__month']/div/div");
	
	public static final Target HOBBIE = Target.the("HOBBIE")
			.locatedBy("//div[@id='hobbiesWrapper']//label[@class='custom-control-label']");
	
	
	
}


