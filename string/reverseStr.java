package string;

import java.util.Scanner;

public class reverseStr {

    public static void reverseString(char[] s) {
        int low = 0;
        int high = s.length-1;
        while(low < high){
            char t = s[low];
            s[low] = s[high];
            s[high] = t;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        for(int i=0; i<n; i++){
            s[i] = sc.next().charAt(0);
        }

        reverseString(s);

        for(char c : s){
            System.out.print(c + " ");
        }
    }
}
