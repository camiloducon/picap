package stepsdefinition;

import static utils.Constantes.CAMILO;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import tasks.AbrirNavegador;
import tasks.FillForm;

public class Picap {

	@Managed
	private WebDriver hisBrowser;


	@Before
	public void setUp() {
		CAMILO.can(BrowseTheWeb.with(hisBrowser));
	}
	@Given("^camilo want to into application$")
	public void camilo_want_to_into_application() {
		CAMILO.wasAbleTo(AbrirNavegador.picap());

	}

	@When("^complete the form$")
	public void complete_the_form() {
		CAMILO.wasAbleTo(FillForm.intoPicap());
	}

	@Then("^finally test$")
	public void finally_test() {

	}
}
