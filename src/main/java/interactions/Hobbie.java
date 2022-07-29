package interactions;

import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.Picap.*;

public class Hobbie implements Interaction {

	List<WebElementFacade> hobbie;
	List<WebElementFacade> lblHobbie;

	private String valHobbie;

	public Hobbie(String valHobbie) {
		this.valHobbie = valHobbie;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		selectGender(actor);

	}

	public void selectGender(Actor actor) {
		System.out.println("entreeeeeeeeeeeeeeeee");
		lblHobbie = HOBBIE.resolveAllFor(actor);
		for (int i = 0; i < lblHobbie.size(); i++) {
			System.out.println(lblHobbie.get(i).getText());
			if (lblHobbie.get(i).getText().equals(valHobbie)) {
				lblHobbie.get(i).click();
				break;
			}
		}
	}

	public static Hobbie form(String valHobbie) {
		return new Hobbie(valHobbie);
	}

}
