package ru.gb.pages;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.Step;
import ru.gb.locators.LocatorService;
import ru.gb.locators.interfaces.FormsPageLocators;

import java.io.File;

import static com.codeborne.selenide.Selenide.$;


public class FormsPage {

    private FormsPageLocators locator() {
        return (FormsPageLocators) LocatorService.FORMS_PAGE_LOCATORS;
    }

    @Step("Кликаем в поле ввода")
    public FormsPage clickInputField() {
        $(locator().formsInputField()).click();
        return new FormsPage();
    }

    @Step("Вводим текст в поле ввода")
    public FormsPage inputText(String message) {
        $(locator().formsInputField()).sendKeys(message);
        return new FormsPage();
    }

    @Step("Делаем скриншот экрана")
    public FormsPage createScreenshot() {
        File actualScreenShot = $(MobileBy.AccessibilityId("Forms-screen")).screenshot();
        return new FormsPage();
    }

    @Step("Проверяем введенный в поле текст")
    public FormsPage checkInputText(String message) {
        $(locator().formsInputTextResult()).shouldHave(Condition.text(message));
        return new FormsPage();
    }
}