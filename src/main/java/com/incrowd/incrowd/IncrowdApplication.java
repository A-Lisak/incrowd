package com.incrowd.incrowd;

import com.incrowd.incrowd.controller.RatingController;
import com.incrowd.incrowd.model.EstablishmentList;
import com.incrowd.incrowd.model.FSAAuthorityList;
import mypackage.NewsArticleInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import javax.xml.bind.JAXBContext;

@SpringBootApplication
public class IncrowdApplication {


    public static void main(String[] args) {

        SpringApplication.run(IncrowdApplication.class, args);



        System.out.println("ffffffffffffffffffffffffff");
        RatingController ratingController = new RatingController();

        try {
            ratingController.da();
        } catch (Exception e) {
            e.getCause();
        }
//	String ii =	ratingController.readStringFromURL(String requestURL)
    }

    @Bean
    public RestTemplate getRestTemplateBean() {
        return new RestTemplate();
    }

}


