package at.kilga.Experiment;

public class sumRuftSumAuf {// Stack overflow test
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        sum(a, b);
    }

    public static void sum(int a, int b) {
        int c = b;
        int d = a;
        sum(c, d);
    }
}
