package structuralPattern.facade;

public class VideoConverterFacade {

    public void convertVideo(String filePath, String format) throws InterruptedException {
        VideoFile videoFile = new VideoFile(filePath);
        VideoCodec videoCodec;

        if (format.equalsIgnoreCase("mp4")) {
            videoCodec = new MPEG4Codec();
        }
        else if (format.equalsIgnoreCase("mkv")) {
            videoCodec = new MKVCodec();
        }
        else if (format.equalsIgnoreCase("avi")) {
            videoCodec = new AVICodec();
        }
        else {
            throw new UnsupportedOperationException("Unsupported video codec");
        }
        VideoConverter converter = new VideoConverter();
        converter.setVideoFile(videoFile);
        converter.setCodec(videoCodec);
    }

}
