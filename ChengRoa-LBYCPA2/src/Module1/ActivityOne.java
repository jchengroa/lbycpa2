/**
 * Author: John Carlo Cheng Roa
 * Institution: De La Salle University
 * College: Gokongwei College of Engineering
 * Department: Department of Electronics and Computer Engineering
 * Course: LBYCPA2
 * Section: EQ3
 * Date Created: 9/10/2025
 * Date Submitted: 9/11/2025
 * **/

package Module1;
import java.text.DecimalFormat;

class Computation {
    public String[] calculateLgn(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(Math.pow(2, t[i]));
        }
        return results;
    }

    public String[] calculateSqrtn(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(Math.pow(t[i], 2));
        }
        return results;
    }

    public String[] calculateLinearN(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(t[i]);
        }
        return results;
    }

    public String[] calculateNlgn(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            double t2 = t[i];
            double n = t2 / (Math.log(t2) / Math.log(2));
            results[i] = formatNumber(n);
        }
        return results;
    }

    public String[] calculateNsqrd(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(Math.sqrt(t[i]));
        }
        return results;
    }

    public String[] calculateNcubed(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(Math.cbrt(t[i]));
        }
        return results;
    }

    public String[] calculateTwoN(long[] t) {
        String[] results = new String[t.length];
        for (int i = 0; i < t.length; i++) {
            results[i] = formatNumber(Math.log(t[i]) / Math.log(2));
        }
        return results;
    }

    public String[] calculateNFactorial(long[] t) {
        String[] results = new String[t.length];

        for (int i = 0; i < t.length; i++) {
            long times = t[i];
            long factorial = 1;
            long n = 1;
            while (factorial < times) {
                n++;
                if(Long.MAX_VALUE / n < factorial) {
                    break;
                }
                factorial = factorial * n;
            }
            results[i] = String.valueOf(n-1);
        }
        return results;
    }

    private static String formatNumber(double num) {
        DecimalFormat df = new DecimalFormat("0.00E0");
        return df.format(num);
    }
}

class Draw {
    public void header() {
        System.out.println("|---------------------------------------------------------------------------------------------|");
        System.out.println("|         |  1 SECOND | 1  MINUTE |   1 HOUR  |   1 DAY   |  1 MONTH  |   1 YEAR  | 1 CENTURY |");
        System.out.println("|---------------------------------------------------------------------------------------------|");
    }

    public void rows(String func, String... values) {
        System.out.printf("|%-9s", func);
        for (String val : values) {
            System.out.printf("|%10s ", val);
        }
        System.out.println("|\n|---------------------------------------------------------------------------------------------|");
    }
}

public class ActivityOne {
    public static void main(String[] args) {
        Computation comp = new Computation();
        Draw draw = new Draw();
        draw.header();

        long second = 1000000;
        long minute = 60 * second;
        long hour = 60 * minute;
        long day = 24 * hour;
        long month = 30 * day;
        long year = 365 * day;
        long cent = 100 * year;
        long[] t = {second, minute, hour, day, month, year, cent};

        draw.rows("lg n", comp.calculateLgn(t));
        draw.rows("sqrt(n)", comp.calculateSqrtn(t));
        draw.rows("n", comp.calculateLinearN(t));
        draw.rows("n lg n", comp.calculateNlgn(t));
        draw.rows("n^2", comp.calculateNsqrd(t));
        draw.rows("n^3", comp.calculateNcubed(t));
        draw.rows("2^n", comp.calculateTwoN(t));
        draw.rows("n!", comp.calculateNFactorial(t));
    }
}