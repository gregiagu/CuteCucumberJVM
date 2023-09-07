package io.github.gregiagu.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.gregiagu.tgif.IsItFriday;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TenMinutesTutorialDefinitions {

    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }
    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
    @Given("today is Friday")
    public void todayIsFriday() {
        today = "Friday";
    }
    @Given("today is {string}")
    public void today_is(String today) {
        this.today = today;
    }
}