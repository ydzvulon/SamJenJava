package com.jenjavasamtest;

import static com.jenjavasam.App.main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
        String request[] = { "book/create",
                "author='Jack London' title='The Sea-Wolf' publish_year=1904 genere='adventure novel'" };
        main(request);
    }
}
