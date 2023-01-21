package Chapter6.ex6_7;

import java.util.Scanner;

public class WordCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(">> ");
            String s = sc.nextLine();
            if (s.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            String word[]=s.split(" ");
            System.out.println("어절 개수는 "+word.length);
        }
    }
}
