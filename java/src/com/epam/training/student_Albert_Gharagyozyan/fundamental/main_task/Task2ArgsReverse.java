package com.epam.training.student_Albert_Gharagyozyan.fundamental.main_task;

public class Task2ArgsReverse {
    public static void main(String[] args) {
        int i = args.length;
        for (; i > 0; i--) {
            System.out.print(args[i - 1] + " ");
        }
    }
}
