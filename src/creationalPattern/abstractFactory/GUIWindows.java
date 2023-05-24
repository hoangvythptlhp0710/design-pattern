package creationalPattern.abstractFactory;

public class GUIWindows implements GUILibrary{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckBox();
    }
}
