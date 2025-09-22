public class lab1 {

    //1
    public double fraction (double x) {
        return x % 1;
    }

    //2
    public int charToNum (char x) {
        return x - '0';
    }

    //3
    public boolean is2Digits(int x) {
        int absX = Math.abs(x);
        return absX >= 10 && absX <= 99;
    }


    //4
    public boolean isInRange(int a, int b, int num) {
        return (a <= num & num <= b || a >= num & num >= b);
    }

    //5
    public boolean isEqual(int a, int b, int c) {
        if (a == b && a == c) {
            return true;
        } else {
            return false;
        }
    }

    //6
    public int abs(int x) {
        if (x >= 0) {
            return x;
        } else {
            return -x;
        }
    }

    //7
    public boolean is35(int x) {
        if (x % 3 == 0 || x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }


    //8
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    //9
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        } else {
            return sum;
        }
    }

    //10
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

    // 11
    public String listNums(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    // 12
    public String chet(int x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            s.append(i);
            s.append(" ");
        }
        return s.toString();
    }

    // 13
    public int numLen(long x) {
        x = Math.abs(x);

        if (x == 0) {
            return 1;
        }

        int count = 0;
        while (x > 0) {
            x /= 10;
            count++;
        }
        return count;
    }

    // 14
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 15
    public void rightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (x - i - 1 <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 16
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // 17
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    // 18
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        int i = 0;
        for (; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int j = 0; j < ins.length; j++) {
            result[i++] = ins[j];
        }
        for (int j = pos; j < arr.length; j++) {
            result[i++] = arr[j];
        }
        return result;
    }

    // 19
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // 20
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value == x) {
                count++;
            }
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


