package com.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MessageTest {

    Message service;

    @BeforeEach
    void setUp() {
        service = new Message();
        System.out.println("Setup done");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Teardown done"); 
    }

    @Test
    void testSetMessage() {
       
        String input = "Hello!!!";
        service.setMessage(input);
        assertEquals("Hello!!!", service.getMessage());
    }

    @Test
    void testEmptyMessage() {
        String input = "";
        service.setMessage(input);
        assertEquals("", service.getMessage());
    }
}
