package io.github.gregiagu.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WhatIsCucumberDefinitions {
    @Given("the Maker has chosen a word")
    public void the_maker_has_chosen_a_word() {
        System.out.println("Given the Maker has chosen a word");
    }
    @When("the Breaker makes a guess")
    public void the_breaker_makes_a_guess() {
        System.out.println("When the Breaker makes a guess");
    }
    @Then("the Maker is asked to score")
    public void the_maker_is_asked_to_score() {
        System.out.println("Then the Maker is asked to score");
    }
}
