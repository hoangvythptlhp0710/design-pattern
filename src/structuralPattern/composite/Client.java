package structuralPattern.composite;

public class Client {

    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory dir1 = new Directory("folder1");
        Directory dir2 = new Directory("folder2");

        File file1 = new File("a", 2.3);
        File file2 = new File("b", 2.4);
        File file3 = new File("c", 2.5);
        root.addComponent(dir1);
        root.addComponent(dir2);


        dir1.addComponent(file1);
        dir2.addComponent(file2);
        dir2.addComponent(file3);

        root.displayStructure();

        System.out.println("Total Size: " + root.getTotalSize() + " bytes");
    }

}
