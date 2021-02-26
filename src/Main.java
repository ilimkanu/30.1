import com.sun.org.apache.xpath.internal.operations.Neg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativeValueException {
        Scanner scanner = new Scanner(System.in);
        Integer cylheight = 11;

        List<Integer> initvolume = new ArrayList();
        initvolume.add(3);
        initvolume.add(-6);
        initvolume.add(11);
        initvolume.add(-5);
        initvolume.add(22);

        System.out.println("Введите радиус основания");
        int rad = scanner.nextInt();

        try {
            checkInput(rad);
        } catch (NegativeValueException e) {
            throw new NegativeValueException("Введите положительное число");
        }

        System.out.println("Введите высоту цилиндра");
        int height = scanner.nextInt();

        try {
            checkInput(height);
        } catch (NegativeValueException e) {
            throw new NegativeValueException("Введите положительное число");
        }

        int res = height * rad;
        System.out.println("Объем цилиндра = " + res);

        countVolume(initvolume.get(0), cylheight);
        countVolume(initvolume.get(1), cylheight);
        countVolume(initvolume.get(2), cylheight);
        countVolume(initvolume.get(3), cylheight);
        countVolume(initvolume.get(4), cylheight);
    }

    public static void checkInput(int rad) throws NegativeValueException {
        if (rad < 0) {
            throw new NegativeValueException("Введите положительное число");
        }
    }

    public static void countVolume(Integer inputrad, Integer inputheight) throws NegativeValueException {
        System.out.println(inputrad * inputheight);
        if (inputrad < 0) {
            throw new NegativeValueException("Введите положительное число");
        }
    }
}
