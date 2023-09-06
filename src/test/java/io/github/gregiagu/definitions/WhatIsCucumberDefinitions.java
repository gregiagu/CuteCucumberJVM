package io.github.gregiagu.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhatIsCucumberDefinitions {
    @Given("the Maker has chosen a word")
    public void the_maker_has_chosen_a_word() {
        assertTrue(true);
    }
    @When("the Breaker makes a guess")
    public void the_breaker_makes_a_guess() {
        assertTrue(true);
    }
    @Then("the Maker is asked to score")
    public void the_maker_is_asked_to_score() {
        assertTrue(true);
    }
}
