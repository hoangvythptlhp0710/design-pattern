package creationalPattern.abstractFactory;

public class WindowsCheckBox implements Checkbox {
    @Override
    public void render() {
        System.out.println("this is Windows checkbox");
    }
}
