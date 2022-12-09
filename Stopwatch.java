package day6Practiceproblem.LogicalProgram;

import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long start,end;
        double time;
        System.out.println("Type any number to start the stopwatch");
        start =sc.nextLong();
        start=System.currentTimeMillis();
        System.out.println("Type any number to stop the stopwatch");
        end=sc.nextLong();
        end=System.currentTimeMillis();
        time=(end-start)/1000.0;
        System.out.println(time);
    }
}
