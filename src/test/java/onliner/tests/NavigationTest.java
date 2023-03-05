package onliner.tests;

import framework.BaseTest;
import io.qameta.allure.Description;
import onliner.pageObject.pages.CatalogPage;
import onliner.pageObject.pages.MainPage;
import org.testng.annotations.Test;


public class NavigationTest extends BaseTest {
    @Test
    @Description("Переход на страницу 'Ноутбуки, компьютеры, мониторы'. Ожидаемый результат: Страница 'Ноутбуки, компьютеры, мониторы' загрузилась.")
    public void navigationMenuTest() {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu("Каталог");
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToMainMenuItem("Компьютеры");
        catalogPage.navigateToSubMenuItems("Ноутбуки, компьютеры, мониторы");
        catalogPage.navigateToSubMenuCategory("Игровые ноутбуки");
    }
}
