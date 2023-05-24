package structuralPattern.bridge;

public interface Device {

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    void setVolume(int volume);
}
