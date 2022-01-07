package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch stopwatch = new StopWatch();

        long sum = 0;
        stopwatch.start();
        for (int i = 0; i < 9999999; i++) {
            for (int j = 0; j < 999; j++) {
                sum += i + j;
            }
        }
        stopwatch.stop();
        System.out.println("Thời gian chạy: " + stopwatch.getElapsedTime());
    }
}
