import gen.GrammaLexer;
import gen.GrammaParser;
import gen.my.ConverterToJava;
import gen.my.Visitor;
import gen.my.Walker;
import gen.my.base.Base;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        CharStream inputStream = null;

        try {
            if (args.length == 0) {
                inputStream = CharStreams.fromString(obj.readFileAsString("src/test/java/codeWithError.txt"));
            }
            else {
                inputStream = CharStreams.fromString(obj.readFileAsString(args[0]));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        GrammaLexer lexer = new GrammaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        GrammaParser parser = new GrammaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new Walker());

        ParseTree tree =  parser.program();

        Visitor visitor = new Visitor();

        Base result = visitor.visit(tree);
        if(Walker.isErrors()) {
            return;
        }

        ConverterToJava converter = new ConverterToJava();
        String className = "src/main/java/files/Test.java";
        converter.convertToJava(Visitor.code, Paths.get(className));


        String command = "javac " + className;
        String output = obj.executeCommand(command);
    }

    private String executeCommand(String command) {
        StringBuilder output = new StringBuilder();
        Process p;

        try {
           p = Runtime.getRuntime().exec(command);
           p.waitFor();

           BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

           String line;
           while ((line = reader.readLine()) != null) {
               output.append(line).append("\n");
           }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    private String readFileAsString(String filePath) throws IOException {
        StringBuilder fileData = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        char[] buf  = new char[1024];

        int numRead = 0;
        while ((numRead = reader.read(buf)) != -1) {
            String readData = String.valueOf(buf, 0, numRead);
            fileData.append(readData);
        }

        reader.close();;

        return fileData.toString();
    }

}
