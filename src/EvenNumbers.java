import java.util.Arrays;
import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.print("Добро пожаловать!\nВведите количество элементов массива: ");
        Scanner scanner = new Scanner(System.in);
        // Ввод размера массива:
        int sizeIn = 0;
        while (true) {
            try{
                sizeIn = scanner.nextInt();
                if(sizeIn < 1) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.print("Вами введено не число, введите число: ");
                scanner.nextLine();
            }
        }
        System.out.println(sizeIn); // проверка
        // Ввод массива:
        int count = 0;
        int[] arrayIn = new int[sizeIn];
        for (int j = 0; j < sizeIn; j++){
            System.out.print("Введите " + (j + 1) + " из " + sizeIn + " элементов массива: ");
            arrayIn[j] = scanner.nextInt();
            if (arrayIn[j]%2==0) {
                count++;
            }
        }
        scanner.close();
        System.out.println(Arrays.toString(arrayIn)); // проверка
        System.out.println("Вы ввели " + count + " чётных элементов массива");
    }
}
