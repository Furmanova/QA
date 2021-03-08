package de.moemax.steps;

import de.moemax.pages.FilterMarkePage;
import io.cucumber.java8.En;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.Assert.assertTrue;

public class FilterMarkeSteps implements En {
    FilterMarkePage filterMarkePage;

    public FilterMarkeSteps() {

        When("I search for the {}", (String make) -> {
            filterMarkePage = page(FilterMarkePage.class);
            filterMarkePage.clickMarkeBtn(make);

        });

        Then("I am checking the {} of goods", (String quantity) -> {
            assertTrue(filterMarkePage.checkQuantityOfGoods(quantity));
        });

        Then("I see the filter {} is applied", (String make) -> {
            filterMarkePage.filterSelection(make);
        });
    }
}
