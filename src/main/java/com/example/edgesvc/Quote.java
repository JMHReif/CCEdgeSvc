package com.example.edgesvc;

/**
 * Created by markheckler on 12/17/16.
 * Updated by jmhreif on 09/14/17.
 */
public class Quote {
    private Long id;
    private String text, source;

    public Quote() {
    }

    public Quote(Long id, String text, String source) {
        this.id = id;
        this.text = text;
        this.source = source;
    }
}
