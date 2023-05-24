package structuralPattern.composite;

public class File implements FileSystemComponent{
    private String name;
    private double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void displayStructure() {
        System.out.println("File: " + name);
    }

    @Override
    public double getTotalSize() {
        return size;
    }
}
