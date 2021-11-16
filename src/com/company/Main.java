package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final int day = 1440;

    public static void main(String[] args) {
        task();
    }

    //1) Электронные часы показывают время в формате от 00:00 до 23:59.
//
//
//
//Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
    private static void task() {
        StringBuilder min = new StringBuilder();
        StringBuilder hour = new StringBuilder();
        int hours;
        int leftMin;
        int count = 0;
        for (int totalMin = 0; totalMin < day; totalMin++) {
            min.delete(0, min.length());
            hour.delete(0, hour.length());

            hours = totalMin / 60;
            leftMin = totalMin % 60;
            if (hours < 10) {
                hour.append(0).append(hours);
            } else {
                hour.append(hours);
            }
            if (leftMin < 10) {
                min.append(0).append(leftMin);
            } else {
                min.append(leftMin);
            }
            if (min.charAt(0) == hour.charAt(1) && min.charAt(1) == hour.charAt(0)) {
                System.out.println(hour + ":" + min);
                count += 1;
            }
        }
        System.out.println("За сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия - " + count + " раз");
    }


}
