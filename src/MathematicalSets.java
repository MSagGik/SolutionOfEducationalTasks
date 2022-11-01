import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MathematicalSets {
    public static void main(String[] args) {
        //  ввод первого множества:
        Set<Integer> setsOne = new HashSet<>();
        System.out.print("Введите первую строку: ");
        setsIn(setsOne);

        //  ввод второго множества:
        Set<Integer> setsSecond = new HashSet<>();
        System.out.print("Введите вторую строку: ");
        setsIn(setsSecond);

        // создание нового списка пересекающегося множества:
        Set<Integer> intersection = new HashSet<>(setsOne);
        intersection.retainAll(setsSecond);
        System.out.println("Пересечение множеств: " + intersection);
        // создание нового списка первого множества исключая второе множество:
        Set<Integer> difference = new HashSet<>(setsOne);
        difference.removeAll(setsSecond);
        System.out.println("Первое множество за исключением второго: " + difference);

    }
    public static Set<Integer> setsIn(Set<Integer> setsIn) {
        //  ввод множества:
        Scanner scanner = new Scanner(System.in);
        String[] setsInString = scanner.nextLine().split("");
        Integer[] setsOneIn = new Integer[setsInString.length];
        for (int i = 0; i < setsInString.length; i++) {
            setsOneIn[i] = Integer.valueOf(setsInString[i]);
            setsIn.add(setsOneIn[i]);
        }
        return setsIn;

    }
}
