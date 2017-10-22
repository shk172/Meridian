package main.java.meridian;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/form")
    public Form form(@RequestParam(value="rss", defaultValue="http://feeds.bbci.co.uk/news/rss.xml?edition=int") String link) {
        return new Form(counter.incrementAndGet(), link);
    }
}