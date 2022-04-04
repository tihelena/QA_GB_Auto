package ru.gb.pages;

import io.qameta.allure.Step;
import ru.gb.locators.LocatorService;
import ru.gb.locators.interfaces.SwipePageLocators;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SwipePage {
    private SwipePageLocators locator() {
        return LocatorService.SWIPE_PAGE_LOCATORS;
    }

    @Step("Проверяем наличие элемента на экране")
    public SwipePage isSwipeCardVisible() {
        $(locator().swipeCard()).shouldBe(visible);
        return new SwipePage();
    }
}
