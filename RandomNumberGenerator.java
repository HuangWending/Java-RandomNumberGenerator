import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入随机数的最小值：");
        int minValue = scanner.nextInt();

        System.out.print("请输入随机数的最大值：");
        int maxValue = scanner.nextInt();

        System.out.print("请输入要生成的随机数的个数：");
        int count = scanner.nextInt();

        List<Integer> randomNumbers = generateRandomNumbers(minValue, maxValue, count);

        System.out.println("生成的随机数为：");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }

    private static List<Integer> generateRandomNumbers(int minValue, int maxValue, int count) {
        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxValue - minValue + 1) + minValue;
            randomNumbers.add(randomNumber);
        }

        return randomNumbers;
    }
}
