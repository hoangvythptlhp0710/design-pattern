package structuralPattern.facade;

public class MPEG4Codec implements VideoCodec{
    @Override
    public void compress(VideoFile videoFile) throws InterruptedException {
        System.out.println("Compressing to MPEG4 codec...");
        Thread.sleep(5000);
        System.out.println("Done!");
    }
}
