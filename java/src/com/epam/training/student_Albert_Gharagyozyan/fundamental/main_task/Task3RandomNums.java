package com.epam.training.student_Albert_Gharagyozyan.fundamental.main_task;

public class Task3RandomNums {

    public static void main(String[] args) {
        int i;
        int times = Integer.parseInt(args[0]);
        System.out.println(times);
        for (i = 0; i < times; i++) {
            int num = (int) (Math.random() * 111);
            System.out.print(num + " ");
        }


    }
}