package ru.gb.locators;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class FormsPageLocators {

    public By formsInputField() {
        return MobileBy.AccessibilityId("text-input");
    }

    public By formsInputTextResult() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"input-text-result\"]");
    }
}
