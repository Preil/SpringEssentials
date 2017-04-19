package com.oreilly.entities;

import org.springframework.stereotype.Component;

/**
 * Ilya 17.04.2017.
 */

@Component
public class Cubs implements Team {
    public String getName() {
        return "Chicago Cubs";
    }
}
