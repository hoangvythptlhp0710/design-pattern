package structuralPattern.bridge;

public class TV implements Device{

    private int volume;
    @Override
    public void powerOn() {
        System.out.println("TV: Power On");
    }

    @Override
    public void powerOff() {
        System.out.println("TV: Power Off");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV: Volume Up");
        volume++;
    }

    @Override
    public void volumeDown() {
        System.out.println("TV: Volume Down");
        volume--;
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("TV: Set Volume to " + volume);
        this.volume = volume;
    }
}
