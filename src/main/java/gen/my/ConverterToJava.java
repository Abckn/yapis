package gen.my;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class ConverterToJava {

    private final List<String> myCode = new ArrayList<>();

    public void convertToJava(List<String> myCode, Path path ) {

        this.myCode.add("package files;");
        this.myCode.add("public class Test {");
        this.myCode.addAll(myCode);
        this.myCode.add("}");


        try {
            Files.createFile(path);
        }
        catch (Exception e) {
            System.out.println("file exists");
        }


        try {
            Files.write(path, this.myCode, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
