package com.jenjavasamtest;

import org.junit.jupiter.api.Test;

import static com.jenjavasam.App.main;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */    @Test
    void testApp() {
        assertEquals(1, 1);
        String action = "book/create";
        String argpairs = "author='Jack London' title='The Sea-Wolf' publish_year=1904 genere='adventure novel'";
        String[] request = {action, argpairs};
        main(request);
    }
}
