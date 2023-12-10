package com.demoblaze.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    public static final Target LNK_SINGIN=Target.the("Link SIGN IN")
            .located(By.id("signin2"));
}
