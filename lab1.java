public class lab1 {

    public double fraction (double x) {
        return x % 1;
    }

    public int charToNum (char x) {
        return x - '0';
    }

    public boolean is2Digits (int x) {
        return 10 < x && x < 100;
    }


    public boolean isInRange(int a, int b, int num) {
        return (a <= num & num <= b || a >= num & num >= b);
    }


    public boolean isEqual(int a, int b, int c) {
        return (a == b & a == c);
    }

    public int abs(int x) {
        return x >= 0 ? (x) : (-x);
    }

    public boolean is35(int x) {
        return (x % 3 == 0 ^ x % 5 == 0);
    }

    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public String day(int x) {
        return switch (x) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Это не день недели";
        };
    }

    public String listNums(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    public String chet(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    public int numLen(long x) {
        x = Math.abs(x);

        if (x == 0) return 1;

        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (x - i - 1 <= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }


    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        int i = 0;
        for (; i < pos; i++) result[i] = arr[i];
        for (int j = 0; j < ins.length; j++) result[i++] = ins[j];
        for (int j = pos; j < arr.length; j++) result[i++] = arr[j];
        return result;
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) count++;
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }

}


