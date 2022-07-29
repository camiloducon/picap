package interactions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import org.openqa.selenium.Alert;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class alert implements Interaction{

	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("entre a la alerta");
		Alert alert = getDriver().switchTo().alert();
		System.out.println("entre a la alerta");
		String print =  alert.getText();
		System.out.println("Alert text is: " + print);
		alert.accept();
		
	}
	public static alert intoAlerts() {
		return new alert();
	}

}
