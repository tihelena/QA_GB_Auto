package ru.gb.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import ru.gb.base.BaseTest;
import ru.gb.pages.FormsPage;

public class FormsSteps extends BaseTest {
    FormsPage formsPage;

    @Given("^User is on Login page$")
    public void user_is_on_forms_page() {
        formsPage = openApp().clickFormsMenuButton();
    }
    @When("^User set field text:  (\\w+)$")
    public void user_set_field_text_hello(String text) {
       formsPage.clickInputField().inputText(text);
    }
    @Then("User should see test field: (\\w+)$")
    public void user_should_see_test_field_hello(String test) {
       formsPage.checkInputText(test);
    }
}
