package com.demoblaze.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;


import net.serenitybdd.screenplay.Performable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SwithAlert implements Interaction {
    private WebDriver driver;



    @Override
    public <T extends Actor> void performAs(T actor) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

}
