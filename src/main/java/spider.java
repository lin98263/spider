import java.util.Scanner;
public class spider {

    public static void main(String[] args) {

        String champion, lane;

        Scanner scanner = new Scanner(System.in);
        System.out.print("輸入欲查詢英雄:");
        champion = scanner.next();
        System.out.print("輸入欲查詢路線(top/jungle/mid/adc/support):");
        lane = scanner.next();

    }
}