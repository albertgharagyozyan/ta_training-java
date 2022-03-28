package com.epam.training.student_Albert_Gharagyozyan.fundamental.main_task;

public class Task5MonthName {
    public static void main(String[] args) {
        int MonthNumber = Integer.parseInt(args[0]);
        String[] month = {"January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"};
        System.out.println(month[MonthNumber - 1]);
    }
}
