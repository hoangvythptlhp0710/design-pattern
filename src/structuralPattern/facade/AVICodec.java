package structuralPattern.facade;

public class AVICodec implements VideoCodec{
    @Override
    public void compress(VideoFile videoFile) throws InterruptedException {
        System.out.println("Compressing to AVI codec...");
        Thread.sleep(5000);
        System.out.println("Done!");
    }
}
