package structuralPattern.bridge;

public class Client {
    public static void main(String[] args) {
        // Create TV device and basic remote control
        Device tv = new TV();
        RemoteControl basicRemote = new BasicRemoteControl(tv);

        // Test basic remote control
        basicRemote.powerOn();
        basicRemote.volumeUp();
        basicRemote.volumeDown();
        basicRemote.powerOff();

        // Create radio device and advanced remote control
//        Device radio = new Radio();
        RemoteControl advancedRemote = new AdvancedRemote(tv);

        // Test advanced remote control
        advancedRemote.powerOn();
        advancedRemote.volumeUp();
        advancedRemote.mute();
        advancedRemote.powerOff();
    }
}
