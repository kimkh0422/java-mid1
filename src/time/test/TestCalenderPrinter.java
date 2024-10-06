package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();

        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        
        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }
       LocalDate datIterator = firstDayOfMonth;
        while(datIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ", datIterator.getDayOfMonth());
            if(datIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            datIterator = datIterator.plusDays(1);
        }
    }
}