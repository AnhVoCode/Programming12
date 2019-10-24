import java.util.List;

public class WordCounter {
    public int countLongWords(List<String> words, int longWordLength){
        int count = 0;
        String longestWord = "";
        for(String word:words){
            if (word.length()> longWordLength){
                count++;
            }
            if (word.length()>longestWord.length()){
                longestWord = word;
            }
        }
        return count;
    }

}
