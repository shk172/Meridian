package main.java.meridian;

import java.util.HashSet;

public class Form {
    private final long id;
    private final Feed content;
    private String link;
    private String type;

    public Form(long id, String link) {
        this.id = id;
        this.link = link;
        this.type = "";
        this.content = getArticles(link);
    }
    
    public Form(long id, String link, String type) {
        this.id = id;
        this.link = link;
        this.type = type;
        this.content = getArticles(link);
    }
    
    private Feed getArticles(String link){
        this.link = link;

    	FeedParser parser = new FeedParser(link);
    	Feed feed = parser.readFeed();
    	
        return feed;
    }
    public long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }
    
    public Feed getContent() {
    	return content;
    }

}