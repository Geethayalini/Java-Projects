import java.io.File;
import java.io.IOException;

class FileOperationsExample {
    public static void main(String args[]) {
        try {
            // Create a file object
            File file = new File("example.txt");
            
            // Create a new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            // Check file properties
            System.out.println("File exists: " + file.exists());
            System.out.println("Can read: " + file.canRead());
            System.out.println("Can write: " + file.canWrite());
            System.out.println("File name: " + file.getName());
            
            // Delete the file
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
            
            // Create a directory
            File directory = new File("exampleDir");
            if (directory.mkdir()) {
                System.out.println("Directory created: " + directory.getName());
            } else {
                System.out.println("Failed to create directory or it already exists.");
            }
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
