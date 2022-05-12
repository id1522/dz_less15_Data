package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год: ");// введите дату последнего вторника:
        int year = scan.nextInt();
        calendar.set(Calendar.YEAR, year);
        System.out.println("Введите месяц: ");
        int month = scan.nextInt();
        calendar.set(Calendar.MONTH, month - 1);
        System.out.println("Введите дунь: ");
        int day = scan.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, day); // +7 для вывода следуюзего вторника

        DateFormat df = new SimpleDateFormat("yyy MMM dd EEEE");
        System.out.println(df.format(calendar.getTime()));
    }
}

