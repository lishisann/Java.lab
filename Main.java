import java.util.Arrays;
import java.util.Scanner; 

public class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);


        //Первая задача
        double s;

        System.out.println("Введите дробное число:");

        s = scanner.nextDouble();

        lab1 d = new lab1();

        System.out.println("Дробная часть равна" + " " + d.fraction(s));


        //Третья задача
        char c;

        System.out.println("Введите символ от 0 до 9:");

        c = scanner.next().charAt(0);

        lab1 num = new lab1();

        System.out.println("Ваш символ в виде часла равен" + " " + num.charToNum(c));


        //Пятая задача
        int a;

        System.out.println("Введите число:");

        a = scanner.nextInt();

        lab1 tr = new lab1();

        System.out.println("Ваш результат:" + " " + tr.is2Digits(a));


        //Седьмая задача
        int k, b, n;

        System.out.println("Введите диапазон и значение (a, b, число): ");

        k = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();

        lab1 g = new lab1();

        System.out.println("Ваш результат:" + " " + g.isInRange(k, b, n));


        //Девятая задача
        int q, w, e;

        System.out.println("Введите 3 числа: ");

        q = scanner.nextInt();
        w = scanner.nextInt();
        e = scanner.nextInt();

        lab1 r = new lab1();

        System.out.println("Результат равенства ваших чисел:" + " " + r.isEqual(q, w, e));


        //2 Задание
        //Первая задача
        int l;

        System.out.println("Введите значение: ");

        l = scanner.nextInt();

        lab1 p = new lab1();

        System.out.println("Значение по модулю:" + " " + p.abs(l));


        //Третья задача
        int del;

        System.out.println("Введите число: ");

        del = scanner.nextInt();

        lab1 tri = new lab1();

        System.out.println("Если число делится на 3 или 5 - true, если и на 3 и на 5 - false. Ваш результат:" + " " + tri.is35(del));


        //Пятая задача
        int m1,m2,m3;

        System.out.println("Введите 3 числа: ");

        m1 = scanner.nextInt();
        m2 = scanner.nextInt();
        m3 = scanner.nextInt();

        lab1 maxx = new lab1();

        System.out.println("Максимальное значение:" + " " + maxx.max3(m1,m2,m3));

        //Седьмая задача
        int s1,s2;

        System.out.println("Введите 2 числа: ");

        s1 = scanner.nextInt();
        s2 = scanner.nextInt();


        lab1 summ = new lab1();

        System.out.println("Если сумма ваших чисел входит в диапазон от 10 до 19, то вывод 20, иначе вывод вашей суммы. Ваш результат:" + " " + summ.sum2(s1,s2));


        //Девятая задача
        int d7;

        System.out.println("Введите число от 1 до 7 (включительно): ");

        d7 = scanner.nextInt();

        lab1 days = new lab1();

        System.out.println("Ваш день недели по числу:" + " " + days.day(d7));


        //3 задание
        //Первая задача
        int x1;

        System.out.println("Введите значение, до которого нужно вывести числа: ");

        x1 = scanner.nextInt();

        lab1 dip = new lab1();

        System.out.println("Числа:" + " " + dip.listNums(x1));


        //Третья задача
        int x2;

        System.out.println("Введите значение, до которого нужно вывести четные числа: ");

        x2 = scanner.nextInt();

        lab1 dip2 = new lab1();

        System.out.println("Четные числа:" + " " + dip2.chet(x2));


        //Пятая задача
        int x3;

        System.out.println("Введите число: ");

        x3 = scanner.nextInt();

        lab1 cot = new lab1();

        System.out.println("Количество знаков в вашем числе:" + " " + cot.numLen(x3));


        //Седьмая задача
        int sq;

        System.out.println("Введите значение стороны квадрата: ");

        sq = scanner.nextInt();

        lab1 squ = new lab1();

        System.out.println("Ваш квадрат:");
        squ.square(sq);


        //Девятая задача
        int trr;

        System.out.println("Введите значение стороны правостороннего треугольника: ");

        trr = scanner.nextInt();

        lab1 trig = new lab1();

        System.out.println("Ваш треугольник:");
        trig.rightTriangle(trr);


        //4 задание
        //Первая задача
        int xx;
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива через пробел: ");

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введите число: ");

        xx = scanner.nextInt();

        lab1 ind = new lab1();

        System.out.println("Индекс первого вхождения числа:" + " " + ind.findFirst(arr, xx));


        //Третья задача
        System.out.println("Введите размер массива:");
        int size1 = scanner.nextInt();
        int[] arrg = new int[size1];

        System.out.println("Введите элементы массива через пробел: ");

        for (int i = 0; i < size1; i++) {
            arrg[i] = scanner.nextInt();
        }

        lab1 maxabs = new lab1();

        System.out.println("Максимальное значение по модулю:" + " " + maxabs.maxAbs(arrg));


        //Пятая задача
        System.out.println("Введите размер массива:");
        int sizee = scanner.nextInt();
        int pos;
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        int[] arrgg = new int[sizee];

        System.out.println("Введите элементы первого массива через пробел: ");

        for (int i = 0; i < sizee; i++) {
            arrgg[i] = scanner.nextInt();
        }

        System.out.println("Введите элементы второго массива через пробел: ");

        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        System.out.println("Введите номер позиции: ");

        pos = scanner.nextInt();

        lab1 posit = new lab1();

        int[] result = posit.add(arrgg, arr2, pos);
        System.out.println("Результат: " + Arrays.toString(result));


        //Седьмая задача
        System.out.println("Введите размер массива:");
        int siize = scanner.nextInt();
        int[] aarr = new int[siize];

        System.out.println("Введите элементы массива через пробел: ");

        for (int i = 0; i < siize; i++) {
            aarr[i] = scanner.nextInt();
        }

        lab1 rev = new lab1();

        int[] res = rev.reverseBack(aarr);
        System.out.println("Перевернутый массив: " + Arrays.toString(res));

        //Девятая задача
        System.out.println("Введите размер массива:");
        int ssize = scanner.nextInt();
        int[] argr = new int[ssize];
        int xi;

        System.out.println("Введите элементы массива через пробел: ");

        for (int i = 0; i < ssize; i++) {
            argr[i] = scanner.nextInt();
        }

        System.out.println("Введите число для нахождения индексов: ");

        xi = scanner.nextInt();

        lab1 indexes = new lab1();

        int[] resu = indexes.findAll(argr,xi);
        System.out.println("Перевернутый массив: " + Arrays.toString(resu));
        }
    }
