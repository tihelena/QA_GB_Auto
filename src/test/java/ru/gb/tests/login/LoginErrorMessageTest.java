package ru.gb.tests.login;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class LoginErrorMessageTest extends BaseTest {

    public static final String VALID_EMAIL_ADDRESS = "Please enter a valid email address";



    @Test
    @Description("Проверяем сообщение об ошибке при невалидной email.")
    public void checkWrongEmail() {
        openApp()
                .clickLoginMenuButton()
                .clickEmailInput()
                .inputEmail("elena")
                .clickPasswordInput()
                .inputPassword("12345678")
                .clickLoginButton()
                .checkLoginErrorText(VALID_EMAIL_ADDRESS);

    }
}

