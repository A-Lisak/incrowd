package com.incrowd.incrowd.model;

public class NewsArticle {

    private String articleURL;
    private int newsArticleID;
    private String publishDate;
    private String taxonomies;
    private String teaserText;
    private String subtitle;
    private String thumbnailImageURL;
    private String title;
    private BodyText bodyText;
    private String galleryImageURLs;
    private String videoURL;
    private String optaMatchId;

    public String getArticleURL() {
        return articleURL;
    }

    public void setArticleURL(String articleURL) {
        this.articleURL = articleURL;
    }

    public int getNewsArticleID() {
        return newsArticleID;
    }

    public void setNewsArticleID(int newsArticleID) {
        this.newsArticleID = newsArticleID;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getTaxonomies() {
        return taxonomies;
    }

    public void setTaxonomies(String taxonomies) {
        this.taxonomies = taxonomies;
    }

    public String getTeaserText() {
        return teaserText;
    }

    public void setTeaserText(String teaserText) {
        this.teaserText = teaserText;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getThumbnailImageURL() {
        return thumbnailImageURL;
    }

    public void setThumbnailImageURL(String thumbnailImageURL) {
        this.thumbnailImageURL = thumbnailImageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BodyText getBodyText() {
        return bodyText;
    }

    public void setBodyText(BodyText bodyText) {
        this.bodyText = bodyText;
    }

    public String getGalleryImageURLs() {
        return galleryImageURLs;
    }

    public void setGalleryImageURLs(String galleryImageURLs) {
        this.galleryImageURLs = galleryImageURLs;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getOptaMatchId() {
        return optaMatchId;
    }

    public void setOptaMatchId(String optaMatchId) {
        this.optaMatchId = optaMatchId;
    }
}
