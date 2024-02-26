////public class Stopwatch {
////}
////
//
//import java.util.Scanner;
//
//public class Stopwatch {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("스톱워치를 시작하려면 Enter 키를 누르세요.");
//        scanner.nextLine();
//
//        long startTime = System.currentTimeMillis();
//        System.out.println("스톱워치가 시작되었습니다. 멈추려면 Enter 키를 누르세요.");
//        scanner.nextLine();
//
//        long stopTime = System.currentTimeMillis();
//        long elapsedTime = stopTime - startTime;
//
//        System.out.println("경과 시간: " + elapsedTime + "밀리초");
//        scanner.close
import java.util.Scanner;

public class Stopwatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("스톱워치를 시작하려면 Enter 키를 누르세요.");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();
        System.out.println("스톱워치가 시작되었습니다. 멈추려면 Enter 키를 누르세요.");
        scanner.nextLine();

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        long seconds = elapsedTime / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;

        seconds %= 60;
        minutes %= 60;
        hours %= 24;

        System.out.printf("경과 시간: %02d:%02d:%02d%n", hours, minutes, seconds);
        scanner.close();
    }
}
