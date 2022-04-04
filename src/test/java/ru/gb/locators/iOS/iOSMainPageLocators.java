package ru.gb.locators.iOS;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.MainPageLocators;

public class iOSMainPageLocators implements MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    @Override
    public By formsButton() {
        return null;
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }

    @Override
    public By swipeButton() {
        return null;
    }
}
