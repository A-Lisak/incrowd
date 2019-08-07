package com.incrowd.incrowd.model;

public class Establishment {
    private String RatingValue;



    public Establishment(String ratingValue) {
        RatingValue = ratingValue;
    }

    public String getRatingValue() {
        return RatingValue;
    }

    public void setRatingValue(String ratingValue) {
        RatingValue = ratingValue;
    }

    @Override
    public String toString() {
        return "Establishment{" +
                "RatingValue='" + RatingValue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Establishment that = (Establishment) o;

        return RatingValue != null ? RatingValue.equals(that.RatingValue) : that.RatingValue == null;
    }

    @Override
    public int hashCode() {
        return RatingValue != null ? RatingValue.hashCode() : 0;
    }
}
