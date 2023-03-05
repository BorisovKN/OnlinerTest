package onliner.tests;

/*1. Перейти на автобарахолка
* 2. отфильтровать авто по цене до 100000$
* 3. отфильтровать авто по типу кузова седан
* 4. отфильтровать авто по типу коробки передач автоматическая
* 5. проверить работу фильтра
 */

import framework.BaseTest;
import onliner.pageObject.pages.AutobaraholkaPage;
import onliner.pageObject.pages.MainPage;
import org.testng.annotations.Test;

public class FiltrationAuto extends BaseTest {
    @Test
    public void onlinerAutoBaraholcka(){
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu("Автобарахолка");
        AutobaraholkaPage autobaraholkaPage = new AutobaraholkaPage();
        autobaraholkaPage.currencySelection();
        autobaraholkaPage.inPutPrice();
        autobaraholkaPage.choiceOfBodyType();
        autobaraholkaPage.choiceOfTransmission();
        autobaraholkaPage.autoFilter();
    }

}
