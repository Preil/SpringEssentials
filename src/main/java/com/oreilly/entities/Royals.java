package com.oreilly.entities;

import org.springframework.stereotype.Component;

/**
 * Ilya 17.04.2017.
 */
@Component
public class Royals implements Team {
    public String getName() {
        return "Kansas City Royals";
    }
}
