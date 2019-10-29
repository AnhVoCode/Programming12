import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Anh");
        name.add("Samantha");
        name.add("William");
        name.add("Justin");
        WordCounter word = new WordCounter();
        System.out.println( word.countLongWords(name,5));


    }
}
