package com.epam.training.student_Albert_Gharagyozyan.fundamental.main_task;

public class Task4ArgsSum {
    public static void main(String[] args) {
        int sum = 0;
        int i = args.length - 1;
        for (; i >= 0; i--) {
            int num = Integer.parseInt(args[i]);
            sum += num;
        }
        System.out.println(sum);
    }
}
