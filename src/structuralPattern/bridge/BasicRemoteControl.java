package structuralPattern.bridge;

public class BasicRemoteControl implements RemoteControl{
    private Device device;

    public BasicRemoteControl(Device device) {
        this.device = device;
    }
    @Override
    public void volumeUp() {
        System.out.println("Basic Remote: Volume Up");
        device.volumeUp();
    }

    @Override
    public void volumeDown() {
        System.out.println("Basic Remote: Volume Down");
        device.volumeDown();
    }

    @Override
    public void powerOff() {
        System.out.println("Basic Remote: Power Off");
        device.powerOff();
    }

    @Override
    public void powerOn() {
        System.out.println("Basic Remote: Power On");
        device.powerOn();
    }

    @Override
    public void mute() {
        System.out.println("Mute!");
        device.setVolume(0);
    }


}
