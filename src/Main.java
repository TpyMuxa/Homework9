public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
        }
        System.out.println("Сумма трат за месяц составила " + paymentsPerMonth + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
        System.out.println("Задание 2");
        int minCostDay = arr[0];
        int maxCostDay = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxCostDay < arr[i]) {
                maxCostDay = arr[i];
            }
            if (minCostDay > arr[i]) {
                minCostDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minCostDay + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxCostDay + " рублей");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
        System.out.println("Задание 3");
        double paymentsPerMonth = 0;
        double averageCostMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            paymentsPerMonth = paymentsPerMonth + arr[i];
        }
        averageCostMonth = paymentsPerMonth / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageCostMonth);

        System.out.println("\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}