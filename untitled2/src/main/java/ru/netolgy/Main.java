package ru.netolgy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] people = new int [70];
        Arrays.fill(people, 0, 5, 10_000/5);
        Arrays.fill(people, 5, 20, 25_000/15);
        Arrays.fill(people, 20, 60, 50_000/40);
        Arrays.fill(people, 60, 70, 100_000/10 );




        System.out.println(people);
    }
}