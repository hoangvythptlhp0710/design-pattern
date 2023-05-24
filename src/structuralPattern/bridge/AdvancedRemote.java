package structuralPattern.bridge;

public class AdvancedRemote implements RemoteControl{
    private Device device;

    public AdvancedRemote(Device device) {
        this.device = device;
    }
    @Override
    public void volumeUp() {
        System.out.println("Advanced Remote: Volume Up");
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.println("Advanced Remote: Volume Down");
        device.volumeDown();
    }

    @Override
    public void powerOff() {
        System.out.println("Advanced Remote: Power Off");
        device.powerOff();
    }

    @Override
    public void powerOn() {
        System.out.println("Advanced Remote: Power On");
        device.powerOn();
    }

    @Override
    public void mute() {
        System.out.println("Mute!");
        device.setVolume(0);
    }

}
