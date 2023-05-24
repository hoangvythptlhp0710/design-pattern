package structuralPattern.facade;

public class MKVCodec implements VideoCodec{
    @Override
    public void compress(VideoFile videoFile) throws InterruptedException {
        System.out.println("Compressing to MKV codec...");
        Thread.sleep(5000);
        System.out.println("Done!");
    }
}
