package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

// Класс с локаторами главной/домашней страницы.
public class MainPageLocators {

    public By loginButton() {
        return MobileBy.AccessibilityId("Login");
    }

    public By formsButton() {
        return MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"Forms\"]/android.widget.TextView");
    }

    public By homeScreen() {
        return MobileBy.AccessibilityId("Home-screen");
    }
}


