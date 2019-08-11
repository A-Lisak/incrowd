package com.incrowd.incrowd.controller;


//import com.incrowd.incrowd.model.NewsArticleInformation;

import mypackage.NewsArticleInformation;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RatingController {

    public void da() throws Exception {
//        URL url = new URL("http://rssblog.whatisrss.com/feed/");
        URL url = new URL("https://www.brentfordfc.com/api/incrowd/getnewsarticleinformation?id=173860");
        HttpURLConnection http = (HttpURLConnection) url.openConnection();
        http.addRequestProperty("User-Agent", "Mozilla/4.76");
        InputStream is = http.getInputStream();
        JAXBContext jaxbContext = JAXBContext.newInstance(NewsArticleInformation.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        NewsArticleInformation countres = (NewsArticleInformation) jaxbUnmarshaller.unmarshal(is);

    }
}



