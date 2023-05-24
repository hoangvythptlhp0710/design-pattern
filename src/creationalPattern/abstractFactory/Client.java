package creationalPattern.abstractFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        GUILibrary guiLibrary;
        String os = new Scanner(System.in).nextLine();
        if (os.contains("windows")) {
            guiLibrary = new GUIWindows();
        }
        else {
            guiLibrary = new GUIMac();
        }
        Button button = guiLibrary.createButton();
        Checkbox checkbox = guiLibrary.createCheckBox();
        button.render();
        checkbox.render();
    }


}
