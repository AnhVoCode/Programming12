package ui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class Website {
    Document document;

    public Website(String url) throws IOException {
        document = Jsoup.connect(url).get();
    }

    public String getHtml(){
        return document.toString();
    }

}
