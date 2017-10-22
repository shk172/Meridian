package main.java.meridian;
import java.util.HashSet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception {
    	SpringApplication.run(Application.class, args);
    	
    	/*
    	FirebaseWrapper firebase = new FirebaseWrapper("https://wherethingshappened.firebaseio.com/locations");
    	FeedParser parser = new FeedParser("http://feeds.bbci.co.uk/news/rss.xml?edition=int");
    	Feed feed = parser.readFeed();
    	//System.out.println(feed);
    	
        for (FeedMessage message : feed.getMessages()) {
        	System.out.println(message.getDescription());
        	/*
        	HashSet<String> parseResults = GeoParser.parse(message.getTitle(), message.getDescription());
        	if(!parseResults.isEmpty()){
        		MapInfo info = new MapInfo(parseResults, message.getTitle(), message.getDescription());
        		HashSet<Json> jsons = info.toJSON();
        		for(Json json : jsons){
        			firebase.post(json.key, json.data);	
        			System.out.println(json.data);
        		}
        	}
        }
        */
        
        
    }
}
