package creationalPattern.abstractFactory;

public class MacCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("This is MacOs CheckBox");
    }
}
