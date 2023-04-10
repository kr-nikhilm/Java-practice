package File;

import java.io.File;

public class FileInformation {
    public static void main(String[] args) {
        File file = new File("File/Hello.txt");
        if (file.exists()) {
            System.out.println("Absolute Path:" + file.getAbsolutePath());
            System.out.println("Can Read:" + file.canRead());
            System.out.println("Can Write:" + file.canWrite());
            System.out.println("File Size:" + file.length());
        }
    }
}
