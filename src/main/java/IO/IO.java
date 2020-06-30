package IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO {
    public static void main(String[] args) {
        // TODO PATH FILES ITD - FILES          help

        Path file1 = Paths.get("C","Users","user","Desktop","dwa.txt").toAbsolutePath();

        Path file2 = Paths.get("C","Users","user","IdeaProjects","Java_zaawansowana","text123.txt.txt");


        Path fil = Paths.get("C","Users","user","Desktop", "dwa.txt");
        Path fil2 = Paths.get("C:\\Users\\user\\Desktop\\dwa.txt");

        Path dir1 = Paths.get("C","Users","user","Desktop");


        file1.toAbsolutePath();




        System.out.println(Files.exists(fil));
        System.out.println(Files.exists(fil2));
        System.out.println(Files.exists(file1));
        System.out.println(Files.exists(file2));


        System.out.println(file1);

    }
}
