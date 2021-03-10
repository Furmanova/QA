package de.moemax.steps;

import de.moemax.pages.FilterMarkePage;
import io.cucumber.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class FilterMarkeSteps implements En {
    FilterMarkePage filterMarkePage;

    public FilterMarkeSteps() {

        When("I search for the {}", (String make) -> {
            filterMarkePage = page(FilterMarkePage.class);
            filterMarkePage.clickMarkeBtn(make);

        });

        And("I am checking the {} of goods", (String quantity) -> {
            filterMarkePage.checkQuantityOfGoods(quantity);
        });

        Then("I see the filter {} is applied", (String make) -> {
            $(By.xpath("//li/div/div/span")).shouldHave(text(make));
        });
    }
}
