package framework.elements;

import org.openqa.selenium.By;

public class InPut extends BaseElement{
    public InPut(By by){
        super(by);
    }
    public InPut(By by, String name){
        super(by, name);
    }
    @Override
    protected String getElementType() {
        return null;
    }
}
