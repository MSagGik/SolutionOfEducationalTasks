public class ListTemperature {
    public static void main(String[] args) {
        int[] temperatureIn = new int[] {-2, -5, -2, -4, 3, -6, -2, -1, 5, 1, 1, 0, -1, 0, 3, -1, 2, 5, 2, 4, 4, 0, 6, 1, 4, 6, -1, 2, 4, 7, 11};
        int count = 0;
        int countSum = 0;
        for (int i = 0; i < temperatureIn.length; i++) {
            if(temperatureIn[i] > 10) {
                count++;
            }
            countSum += temperatureIn[i];
        }
        String medium = String.format("%.2f", (double) countSum/temperatureIn.length);
        System.out.println("Количество дней в заданном месяце с температурой более 10 зрадусов: " + count +
                "\nСредняя температура равна: " + medium + " грудусов");
    }
}
