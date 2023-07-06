package ss4.exercise;

import ss1.practice.SystemDate;
import ss3.exercise.Exercise1;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class StopWatch {
    double startTime, endTime;

    private StopWatch() {
        System.out.println(java.time.LocalTime.now());
    }

    public double getStartTime() {
        return this.startTime;
    }

    public double getEndTime() {
        return this.endTime;
    }

    public double getStart() {
        return this.startTime = System.currentTimeMillis();
    }

    public double getStop() {
        return this.endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        System.out.println("Start at: " + time.getStart());
        Exercise1.deleted();//nhúng bài tập ở class khác sang, phải tạo tên method khác main, class.method

        System.out.println("Stop at: " + time.getStop());
        System.out.println("Duration: " + time.getElapsedTime());
    }
}
