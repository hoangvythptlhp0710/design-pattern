package structuralPattern.facade;

public class VideoFile {
    private String filePath;
    public VideoFile(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}
