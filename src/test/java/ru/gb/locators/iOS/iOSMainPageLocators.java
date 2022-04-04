package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.MainPageLocators;

public class iOSMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}
