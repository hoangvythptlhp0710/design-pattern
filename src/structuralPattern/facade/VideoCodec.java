package structuralPattern.facade;

public interface VideoCodec {
    void compress(VideoFile videoFile) throws InterruptedException;
}
