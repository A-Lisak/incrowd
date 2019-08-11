package com.incrowd.incrowd.model;

public class NewsArticleInformation {

    private String clubName;
    private String clubWebsiteURL;
    private NewsArticle newsArticle;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubWebsiteURL() {
        return clubWebsiteURL;
    }

    public void setClubWebsiteURL(String clubWebsiteURL) {
        this.clubWebsiteURL = clubWebsiteURL;
    }

    public NewsArticle getNewsArticle() {
        return newsArticle;
    }

    public void setNewsArticle(NewsArticle newsArticle) {
        this.newsArticle = newsArticle;
    }
}
