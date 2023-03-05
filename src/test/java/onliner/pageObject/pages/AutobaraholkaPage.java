package onliner.pageObject.pages;

import framework.BasePage;
import framework.elements.Button;
import framework.elements.InPut;
import framework.elements.Label;

import framework.elements.TextBox;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;


public class AutobaraholkaPage extends BasePage {
    private static final By PAGE_LOCATOR = By.xpath("//h1[contains(@class,'title_big-alter') and contains(text(),'Автобарахолка')]");
    private static final Button BTN_CURRENCY = new Button(By.xpath("//a[text()='USD']"));
    private static final InPut PRICE_INPUT = new InPut(By.xpath("//div[@class='vehicle-form__row vehicle-form__row_condensed-alter']//input[@placeholder='до']"));
    private static final InPut CHECKBOX_BODY_TYPE = new InPut(By.xpath("//div[@class='vehicle-form__checkbox-sign' and contains(text(),'Седан')]/../../input"));
    private static final InPut CHECKBOX_TRANSMISSION = new InPut(By.xpath("//div[@class='vehicle-form__checkbox-sign' and contains(text(),'Автоматическая')]/../../div[@class='i-checkbox__faux']"));
    private static final TextBox AUTO_FILTER = new TextBox(By.xpath("//span[contains(text(), 'Найдено')]"));

    public AutobaraholkaPage() {
        super(PAGE_LOCATOR, "'Autobaraholka' page");
    }

    public void currencySelection(){
        BTN_CURRENCY.scrollIntoView();
        BTN_CURRENCY.click();
    }
    public void inPutPrice(){
        PRICE_INPUT.scrollIntoView();
        PRICE_INPUT.sendKeys("100000");
    }

    @Step("Фильтрация авто по типу кузова: седан.")
    public void choiceOfBodyType() {
        CHECKBOX_BODY_TYPE.clickViaJS();
    }

    @Step("Фильтрация авто по типу коробки передач: автоматическая.")
    public void choiceOfTransmission() {
        CHECKBOX_TRANSMISSION.scrollIntoView();
        CHECKBOX_TRANSMISSION.clickViaJS();
    }

    @Step("Проверка на найденные авто с учетом фильтрации.")
    public void autoFilter() {
        Assert.assertTrue(AUTO_FILTER.isDisplayed(), "Таких объявлений найдено не было!");
    }

}
