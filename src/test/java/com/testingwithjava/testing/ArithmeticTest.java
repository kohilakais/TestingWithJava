package com.testingwithjava.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    public Arithmetic arithmetic;

    @BeforeEach
    public void setUp(){
        arithmetic = new Arithmetic();

    }

    @DisplayName("testing with number 1")
    @Test
    public void testNumber(){
        String fizzbuzz = arithmetic.play(1);
        Assertions.assertEquals(fizzbuzz, "1");
    }

    @DisplayName("Play testing with number = 3")
    @Test
    public void testFizz(){
        String fizzbuzz = arithmetic.play(3);
        Assertions.assertEquals(fizzbuzz, "Fizz");
    }

    @DisplayName("Play testing with number = 5")
    @Test
    public void testBuzz(){
        String fizzbuzz = arithmetic.play(5);
        Assertions.assertEquals(fizzbuzz, "Buzz");
    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    public void testZero(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> arithmetic.play(0));
    }


    @AfterEach
    public void tearDown(){
        arithmetic = null;
    }

}