package com.example.RemoteApi_August;

public class MovieResponse {
    private int budget;
    private String original_title;
    private String tagline;
    private String revenue_total;

    public MovieResponse() {
    }

    public MovieResponse(int budget, String original_title, String tagline, String revenue_total) {
        this.budget = budget;
        this.original_title = original_title;
        this.tagline = tagline;
        this.revenue_total = revenue_total;
    }

}
