public class test {
//    public static String changeString(String s) {
//        return "Wub a lub a dub dub " + s;
//    }
//
//    public static void main(String[] args) {
//        String changeMe = "hello codeup!";
//
//        changeMe = changeString(changeMe);
//
//        System.out.println(changeMe);
//    }



    public static void main(String[] args) {
        getPower(2,4);
    }
//        count(5);
//    }
//    public static void count(int n) {
//        if (n <= 0) {
//            System.out.println("All done!");
//            return;
//        }
//        System.out.println(n);
//        count(n - 1);
//    }

//    public static long getPower(int base, int exponent) {
//        long result = 1;
//        for (int i = 1; i <= exponent; i++) {
//            result = result * base;
//        }
//        return result;
//    }

    public static long getPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else if (exponent == 2) {
            return base * base;
        }
        return base * getPower(base, exponent - 1);
    }
}
