package com.example.edgesvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestOperations;

import java.util.Arrays;
import java.util.List;

/**
 * Created by markheckler on 12/17/16.
 * Updated by jmhreif on 09/14/17.
 */
@RestController
public class QuoteController {
    private RestOperations restOperations;

    @Value("${quotesvc.uri}")
    private String quoteSvcUri;

    public QuoteController(RestOperations restOperations) {
        this.restOperations = restOperations;
    }

    @GetMapping("/test")
    public String getTest() {
        return "Testing. One, two, three.";
    }

    @GetMapping("/quote")
    public Quote getRandomQuote() {
        return this.restOperations.getForObject(quoteSvcUri + "/random", Quote.class);
    }
}
