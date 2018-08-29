package com.example.demo.controller;

import org.springframework.core.convert.converter.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class SecureController {

    public static void main(String[] args) {

//        new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();


//        List list= Arrays.asList("1.Lambdas", "2.Default Method", "3.Stream API", "4.Date and Time API");
//        String str;
//        list.forEach(System.out::println);
//
//        list.forEach(x ->System.out.println(x));

//        Runnable r=() -> System.out.println("Hello world");

//        new Thread(
//                () -> System.out.println("hello world")
//        ).start();


//        Consumer<Integer> c = (int x) -> { System.out.println(x);};


//        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);

//        new Thread(
//                () -> System.out.println("Hello from thread")
//        ).start();

//New way:
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//        list.forEach(n -> System.out.println(n));
//
//        list.forEach(System.out::println);


//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//
//        System.out.println("Print all numbers:");
//        evaluate(list, (n)->true);
//
//        System.out.println("Print no numbers:");
//        evaluate(list, (n)->false);
//
//        System.out.println("Print even numbers:");
//        evaluate(list, (n)-> n%2 == 0 );
//
//        System.out.println("Print odd numbers:");
//        evaluate(list, (n)-> n%2 == 1 );
//
//        System.out.println("Print numbers greater than 5:");
//        evaluate(list, (n)-> n > 5 );

//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
//        int sum = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
//        System.out.println(sum);





    }

//    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
//        for(Integer n: list)  {
//            if(predicate.test(n)) {
//                System.out.println(n + " ");
//            }
//        }
//    }

}