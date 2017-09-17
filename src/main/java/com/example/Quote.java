package com.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by markheckler on 12/17/16.
 * Updated by jmhreif on 09/14/17.
 */
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Quote {
    private Long id;
    @NonNull
    private String text, source;
}
