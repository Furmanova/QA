package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProductCategoryPage {
    @FindBy(css = ".sortBox-form-desktop .sortBox-formSelect")
    SelenideElement inputPriceFilter;
    @FindBy(xpath = "//*[@id=\"productcategory\"]/main/div[2]/div[2]/div/div[1]/form/select/option[4]")
    SelenideElement selectedHighestPrice;
    public void selectedPrice(String priceFilter) {
        inputPriceFilter.selectOption(priceFilter);
    }
    public SelenideElement receiverHighestPrice() {
        return selectedHighestPrice;
    }
}
