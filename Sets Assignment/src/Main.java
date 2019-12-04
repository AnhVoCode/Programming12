import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Set<String> uniqueWords = new HashSet<>();
        ArrayList<String> lines = new ArrayList<>();
        //Reading through file
        FileReader fr = new FileReader("iliad");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while (line!= null){
            lines.add(line);
            if(!line.trim().equals("")){
               String[] words = line.split("");

               for(String word: words){
                   String cleanedUpwords = word.toLowerCase().replace(",","").replace(";","").replace("?","");
               }
            }
            line = br.readLine();
        }



    }
}
