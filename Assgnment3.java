import java.util.Scanner;

public class Assignment3 {
    //Solution 1
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);

        Solution 2
         int a = 5 , b = 10;
         a = a+b; //15
         b = a-b; //5
         a = a-b; //10

         System.out.println(a +" "+ b);

         Solution 3
         int a = 1 , b = 3, c = 2;
         int sum = a+b+c;
         System.out.println("Total "+ sum);

         Solution 4
         int a = 55 , b = 70;
         System.out.println(a<50 && a < b);
         System.out.println(a < 50 || a < b);

