package Chapter4.ex4_10;

import java.util.Scanner;

class Dictionary {
    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future","hope"};
    public static String kor2Eng(String word) {
        /*검색 코드 작성*/
        for(int i=0;i<kor.length;i++){
            if(word.equals(kor[i])){
                if(i%2==0){
                    System.out.print(kor[i]+"은 ");
                }
                else{
                    System.out.print(kor[i]+"는 ");
                }
                return eng[i];
            }
        }
        return "false";
    }
}
public class DicApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("한영 단어 프로그램 입니다.");
        while(true){
            System.out.print("한글 희망?");
            String word=sc.next();
            if(word.equals("그만")) break;
            String eng=Dictionary.kor2Eng(word);
            if(eng.equals("false")){
                System.out.println(word+"는 저희 사전에 없습니다.");
            }
            else{
                System.out.println(eng);
            }

        }

    }

}
