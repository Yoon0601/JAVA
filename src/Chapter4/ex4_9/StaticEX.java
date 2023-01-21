package Chapter4.ex4_9;

class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        /* 배열 a와 b를 연결한 새로운 배열 리턴 */
        int tmp[]=new int[a.length+b.length];
        int i=0;
        for(;i<a.length;i++){
            tmp[i]=a[i];
        }
        for(;i<a.length+b.length;i++){ //4+5=9
            tmp[i]=b[i-a.length]; //if(i=0) : b[-4], if(i=1) : b[-3] ...
        }
        return tmp;
    }
    public static void print(int[] a) {
        /* 배열 a 출력 */
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]+" ");
        }
        System.out.print("]");
    }
}
public class StaticEX {
    public static void main(String[] args) {

        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }

}
