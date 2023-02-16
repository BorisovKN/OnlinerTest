package onliner;

import framework.BaseTest;
import framework.PropertyReader;
import framework.elements.Label;
import framework.elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigationTest extends BaseTest {
    private static final String NAV_MENU_ITEM = "//span[@class='b-main-navigation__text' and text()='%s']";
    private static final TextBox PAGE_TITLE_XPATH = new TextBox(By.xpath("//div[@class='catalog-navigation__title' and text()='Каталог']"));
    private static final String NAVIGATE_MENU = "//span[@class='catalog-navigation-classifier__item-title-wrapper' and contains(text(),'%s')]";
    private static final String NAV_SUBMENU_CATEGORY = "//div[@class='catalog-navigation-list__category']//span[@class='catalog-navigation-list__dropdown-title' and contains(text(),'Игровые ноутбуки')]";
    private static final String NAV_SUBMENU_ITEM = "//div[@class='catalog-navigation-list__aside-title' and contains(text(),'Ноутбуки, компьютеры, мониторы')]";

    @Test
    public void onlinerTest(){
        Label manMenuItem = new Label(By.xpath(String.format(NAV_MENU_ITEM, "Каталог")));
        manMenuItem.clickAndWait();



        if (!PAGE_TITLE_XPATH.isDisplayed()) {
            System.out.println("ERROR: Страница Каталог не была загружена!!!");
        }
        Label navMenuOnCatalogPage = new Label(By.xpath(String.format(NAVIGATE_MENU, "Компьютеры")));
        navMenuOnCatalogPage.click();

        Label navSubMenuItem = new Label(By.xpath(NAV_SUBMENU_ITEM));
        Label navSubMenuCategory = new Label(By.xpath(NAV_SUBMENU_CATEGORY));
        navSubMenuItem.moveTo();
        navSubMenuCategory.clickAndWait();

//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath(NAV_SUBMENU_ITEM)))
//                .moveToElement(driver.findElement(By.xpath(NAV_SUBMENU_CATEGORY)))
//                .click().build().perform();
    }
}
