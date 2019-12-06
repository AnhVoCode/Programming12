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
        ArrayList<String> sentences = new ArrayList<>();
        //Reading through file
        FileReader fr = new FileReader("iliad");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        int pos = 0;
        for (int i = 0; i < lines.size(); i++) {
            String l = lines.get(i);
            for (int k = 0; k<l.length(); k++){
                    if (l.substring(k, k + 1).equals(".")) {
                        sentences.add(l.substring(pos,k + 1));
                        pos = k + 1;
                    }
            }
            pos =0;
        }
        fr.close();
        br.close();

        for (String s: sentences){
            String[] words = s.split("\\s+|\\W+");
            for(int i =0; i<words.length;i++){
                String removeSameCases = words[i].toLowerCase()
                        .replace(",","")
                        .replace(";","")
                        .replace(":","")
                        .replace("?","");


                uniqueWords.add(removeSameCases);
            }
        }
        System.out.println(uniqueWords);
        System.out.println("Number of unique words in the text: "+uniqueWords.size());
    }
}
