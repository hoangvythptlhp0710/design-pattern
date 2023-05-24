package structuralPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{
    private String name;
    private List<FileSystemComponent> components;

    public Directory(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    @Override
    public void displayStructure() {
        System.out.println("Directory: " + name);
    }

    @Override
    public double getTotalSize() {
        double total = 0;
        for (FileSystemComponent fileSystemComponent: components) {
            total += fileSystemComponent.getTotalSize();
        }
        return total;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }
}
