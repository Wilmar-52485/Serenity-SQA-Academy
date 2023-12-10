package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.ui.HomeUI.LNK_SINGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LNK_SINGIN)
        );
    }
    public static Performable on(){
        return instrumented(HomeTask.class);
    }
}
