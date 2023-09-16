public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
        System.out.println("Задание 1");
        int paymentsPerMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            paymentsPerMonth = paymentsPerMonth + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("Сумма трат за месяц составила " + paymentsPerMonth + " рублей");
    }
}