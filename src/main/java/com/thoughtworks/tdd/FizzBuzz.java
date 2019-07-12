package com.thoughtworks.tdd;

public class FizzBuzz {

    public String convert(int number) {
        String result = "";
        if(number%3==0){
            result += "Fizz";
        }
        if(number%5==0){
            result +="Buzz";
        }
        if(number%7==0){
            result +="Whizz";
        }
        if(number%7==0){
            result += "Whizz";
        }
        if(result == ""){
            return String.valueOf(number);
        }
        return result;
    }

}
