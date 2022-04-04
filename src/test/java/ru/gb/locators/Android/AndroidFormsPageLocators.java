package ru.gb.locators.Android;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import ru.gb.locators.interfaces.FormsPageLocators;

public class AndroidFormsPageLocators implements FormsPageLocators {
    @Override
    public By formsInputField() {
        return MobileBy.AccessibilityId("text-input");
    }

    @Override
    public By formsInputTextResult() {
        return MobileBy.xpath("//android.widget.TextView[@content-desc=\"input-text-result\"]");
    }
}
