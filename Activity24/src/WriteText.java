import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteText{

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("CreateFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("Hii! Chetan");
            bufferedWriter.newLine();
            bufferedWriter.write("Learning");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Error!");
        }

    }

}