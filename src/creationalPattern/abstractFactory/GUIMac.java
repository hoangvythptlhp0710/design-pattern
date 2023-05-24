package creationalPattern.abstractFactory;

public class GUIMac implements GUILibrary{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacCheckBox();
    }
}
