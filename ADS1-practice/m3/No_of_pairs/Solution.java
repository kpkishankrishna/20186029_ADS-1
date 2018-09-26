import java.util.*;
class Dups {
    Dups(){

    }
    public void pairs(int[] a, int len) {
        Arrays.sort(a);
        int count = 1;
        int answer = 0;
    for (int i = 1; i < len; i++) {     
        if (a[i] == a[i - 1]){
            count += 1;             
        }
        else
        {
            answer = answer + (count * (count - 1)) / 2;
            count = 1;
        }
    } 
    answer = answer + (count * (count - 1)) / 2; 
    System.out.println(answer);

}
}
class Solution {
    public static void main(String[] args) {
        Dups d = new Dups();
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        d.pairs(array, size);

    }
}