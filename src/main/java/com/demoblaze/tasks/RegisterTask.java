package com.demoblaze.tasks;

import com.demoblaze.interactions.SwithAlert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.WebDriver;

import static com.demoblaze.ui.RegisterUI.*;

public class RegisterTask implements Task {
    private WebDriver driver;

    public RegisterTask(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("alt.c2-coriba9p@yopmail.com").into(TXT_EMAIL),
                Enter.theValue("1234").into(TXT_PASSWORD),
                Click.on(BTN_SIGN_UP)


        );
    }
    public static RegisterTask on(WebDriver driver){
        return new RegisterTask(driver);
    }
}
