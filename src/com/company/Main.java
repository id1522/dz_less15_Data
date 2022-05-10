package com.company;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите дату: ");// введите дату последнего вторника:
        GregorianCalendar calendar = new GregorianCalendar();
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        calendar.set(Calendar.YEAR, year);

        int month = scan.nextInt();
        calendar.set(Calendar.MONTH, month - 1);

        int day = scan.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, day); // +7 для вывода следуюзего вторника

        DateFormat df = new SimpleDateFormat("yyy MMM dd EEEE");
        System.out.println(df.format(calendar.getTime()));

    }
}

