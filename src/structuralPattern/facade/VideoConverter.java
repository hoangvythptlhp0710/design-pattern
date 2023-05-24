package structuralPattern.facade;

public class VideoConverter {

    private VideoCodec codec;
    private VideoFile videoFile;

    public VideoCodec getCodec() {
        return codec;
    }

    public void setCodec(VideoCodec codec) throws InterruptedException {
        this.codec = codec;
        codec.compress(videoFile);
    }

    public VideoFile getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public void convert(VideoFile videoFile) throws InterruptedException {
        System.out.println("Converting video: " + videoFile.getFilePath());
        codec.compress(videoFile);
    }
}
