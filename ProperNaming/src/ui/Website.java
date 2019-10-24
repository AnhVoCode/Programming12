package ui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Website {
    Document doc;

    public Website(String url) throws IOException {
        doc = Jsoup.connect(url).get();
    }

    public String getHTML(){
        return doc.toString();
    }

}
