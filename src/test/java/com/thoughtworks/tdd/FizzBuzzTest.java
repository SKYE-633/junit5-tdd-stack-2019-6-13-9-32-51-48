package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    void should_return_Fizz_when_number_is_3() {
        //given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.convert(number);
        //then
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Buzz_when_number_is_5() {
        //given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.convert(number);
        //then
        Assertions.assertEquals("Buzz", result);

    }

    @Test
    void should_return_Buzz_when_number_is_7() {
        //given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.convert(number);
        //then
        Assertions.assertEquals("Whizz", result);
    }
    @Test
    void should_return_FizzBuzz_when_number_is_15() {
        //given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.convert(number);
        //then
        Assertions.assertEquals("FizzBuzz", result);
    }
}