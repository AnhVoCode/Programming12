package model;

import ui.Website;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Website web = new Website("https://jsoup.org/");
        System.out.println(web.getHtml());
    }
}
