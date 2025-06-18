import java.util.Random;
import java.util.Scanner;

public class kazuate {
    public static void main(String[] args) {
        Random rand = new Random();
        int answer = rand.nextInt(90) + 10; // プログラマが設定する2桁の正の整数
        int maxTries = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("2桁の正の整数を当ててください。チャンスは" + maxTries + "回です。");

        for (int i = 1; i <= maxTries; i++) {
            System.out.print(i + "回目の入力: ");
            int guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("当たり！");
                break;
            } else {
                int diff = Math.abs(guess - answer);
                if(guess < 10 || guess > 99) {
                    System.out.println("2桁の正の整数を入力してください。");
                    i--; // 無効な入力の場合、カウントを戻す
                    continue;
                }else if (guess > answer) {
                    System.out.print("設定された数より大きいです。");
                } else {
                    System.out.print("設定された数より小さいです。");
                }
                if (diff >= 20) {
                    System.out.print(" 20以上差があります。");
                }
                System.out.println();
                if (i == maxTries) {
                    System.out.println("残念！正解は " + answer + " でした。");
                }
            }
        }
        scanner.close();
    }
}