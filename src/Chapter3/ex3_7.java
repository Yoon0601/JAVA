package Chapter3;

public class ex3_7 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        double sum=0;
        System.out.print("랜덤한 정수들 ");
        for(int i=0;i<arr.length;i++){
            int x=(int)(Math.random()*10+1);
            sum+=x;
            System.out.print(x+" ");
        }
        System.out.print("\n평균은 "+sum/10);
    }
}
