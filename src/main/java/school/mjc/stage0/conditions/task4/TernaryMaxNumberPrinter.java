package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max = 0;
        max = (first > second) ? (first > third ? first : third) : (second > third ? second : third);
        System.out.println(max);
    }
}
