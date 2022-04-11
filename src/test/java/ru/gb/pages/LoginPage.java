package ru.gb.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import ru.gb.locators.LoginPageLocators;

public class LoginPage {

    // Метод позволяет работать с локаторами для нужной нам страницы.
    private LoginPageLocators locator() {
        return new LoginPageLocators();
    }

    @Step("Кликаем по полю 'email'")
    public LoginPage clickEmailInput() {
        Selenide.$(locator().inputEmail()).click();
        return new LoginPage();
    }

    @Step("Вводим текст в поле 'email'")
    public LoginPage inputEmail(String email) {
        Selenide.$(locator().inputEmail()).sendKeys(email);
        return new LoginPage();
    }

    @Step("Кликаем по полю 'password'")
    public LoginPage clickPasswordInput() {
       Selenide.$(locator().inputPassword()).click();
        return new LoginPage();
    }

    @Step("Вводим текст в поле 'password'")
    public LoginPage inputPassword(String password) {
        Selenide.$(locator().inputPassword()).sendKeys(password);
        return new LoginPage();
    }

    @Step("Кликаем по кнопке 'логин' в форме")
    public LoginPage clickLoginButton() {
        Selenide.$(locator().loginButton()).click();
        return new LoginPage();
    }

    @Step("Проверяем текст ошибки")
    public LoginPage checkLoginErrorText(String text) {
        Selenide.$(locator().loginErrorText()).shouldHave(Condition.text(text));
        return new LoginPage();
    }
}

