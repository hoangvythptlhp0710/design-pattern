package structuralPattern.facade;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        VideoConverterFacade converterFacade = new VideoConverterFacade();

        // Convert video file to MP4 format
        converterFacade.convertVideo("input.mp4", "mp4");

        // Convert video file to AVI format
        converterFacade.convertVideo("input.avi", "avi");
//
//        // Convert video file to MKV format
        converterFacade.convertVideo("input.mkv", "mkv");
    }
}
