package createBuildPattern.factoryMethodPattern;


/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 *  * should have some core business logic which needs different products to be
 *  * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    //注意:这里的返回类型为HtmlButton和WindowsButton所共有的接口:Button
    public abstract Button createButton();
}
