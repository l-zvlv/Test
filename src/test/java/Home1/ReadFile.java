package Home1;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try (BufferedReader fl = new BufferedReader (new FileReader("C:\\Users\\lzvlv_000\\Desktop\\home.txt")))
        {
            String sl = fl.readLine();
            if (sl.contains("world")) {
            System.out.println("Присутствует необходимое слово");
        }
           else {
                System.out.println("Необходимое слово не найдено");
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
