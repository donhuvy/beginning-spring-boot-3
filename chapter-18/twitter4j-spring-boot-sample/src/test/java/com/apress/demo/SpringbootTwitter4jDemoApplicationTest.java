package com.apress.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import twitter4j.TwitterException;

import java.util.List;

@Disabled
@SpringBootTest
public class SpringbootTwitter4jDemoApplicationTest {
    @Autowired
    private TweetService tweetService;

    @Test
    public void testGetTweets() throws TwitterException {
        List<String> tweets = tweetService.getLatestTweets();

        for (String tweet : tweets) {
            System.err.println(tweet);
        }
    }
}
