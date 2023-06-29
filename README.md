# Java-RandomNumberGenerator
Java随机数程序
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
导入所需的Java类库，包括ArrayList、List、Random和Scanner。它声明了一个名为RandomNumberGenerator的类，并在main方法中开始程序的执行。创建了一个Scanner对象用于读取用户的输入。
        System.out.print("请输入随机数的最小值：");
        int minValue = scanner.nextInt();

        System.out.print("请输入随机数的最大值：");
        int maxValue = scanner.nextInt();

        System.out.print("请输入要生成的随机数的个数：");
        int count = scanner.nextInt();
向用户显示提示消息，并使用scanner.nextInt()方法读取用户输入的最小值、最大值和生成的随机数的个数，然后将它们分别存储在minValue、maxValue和count变量中。
        List<Integer> randomNumbers = generateRandomNumbers(minValue, maxValue, count);
调用generateRandomNumbers方法，并将minValue、maxValue和count作为参数传递给该方法。generateRandomNumbers方法将返回一个包含生成的随机数的List。
        System.out.println("生成的随机数为：");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
    }
打印出"生成的随机数为："的消息，并使用for循环遍历randomNumbers列表中的每个随机数，然后将它们逐行打印到控制台上。
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
定义了generateRandomNumbers方法。它创建一个Random对象，然后使用for循环生成指定数量的随机数。生成的随机数的范围在minValue和maxValue之间（包括最小值和最大值）。每个随机数都被添加到randomNumbers列表中。最后，方法返回包含生成的随机数的列表。
