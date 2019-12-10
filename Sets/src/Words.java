import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class Words{
    String words;

    Words(String words){
        this.words =words;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Words){
            Words other = (Words) obj;
            if(words.equals(other.words)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return words.hashCode();
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> sentences = new ArrayList<>();
        //Reading through file
        FileReader fr = new FileReader("illiad.txt");
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


        HashSet<String> uniqueWords = new HashSet<>();
        for (String s: sentences) {
           Words newWords = new Words(s);
            uniqueWords.add(newWords.words);
        }
        System.out.println(uniqueWords.size());

    }


}
