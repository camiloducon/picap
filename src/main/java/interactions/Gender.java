package interactions;

import java.util.List;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static userinterfaces.Picap.*;

public class Gender implements Interaction {

	List<WebElementFacade> gender;
	List<WebElementFacade> lblGender;

	private String valGender;

	public Gender(String valGender) {
		this.valGender = valGender;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		selectGender(actor);

	}

	public void selectGender(Actor actor) {
		System.out.println("entreeeeeeeeeeeeeeeee");
		gender = GENDER.resolveAllFor(actor);
		lblGender = LBLGENDER.resolveAllFor(actor);
		for (int i = 0; i < lblGender.size(); i++) {
			System.out.println(lblGender.get(i).getText());
			if (lblGender.get(i).getText().equals(valGender)) {
				lblGender.get(i).click();
				break;
			}
		}
	}

	public static Gender form(String valGender) {
		return new Gender(valGender);
	}

}
