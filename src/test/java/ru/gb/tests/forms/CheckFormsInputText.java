package ru.gb.tests.forms;

import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.gb.base.BaseTest;
import ru.gb.listeners.AllureListener;

@Listeners(AllureListener.class)
public class CheckFormsInputText extends BaseTest{

    public static final String INPUT_MESSAGE = "Hello world!";

    @Test
    @Description("Проверяем введенный в поле ввода текст.")
    public void CheckInputMessage() {
        openApp()
                .clickFormsMenuButton()
                .clickInputField()
                .inputText(INPUT_MESSAGE)
                .createScreenshot()
                .checkInputText(INPUT_MESSAGE);
    }

}
