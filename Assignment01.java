import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        int x = 2 , y = 4;
        System.out.println("Product is  " + x*y);

       //Area Of Rectangle
        int Length = 7 , Breathe = 4;
        System.out.println("Area Of Rectangle  " + 7*4);

        //Voulme of cube
        int a = 4 , b = 4 , c = 4;
        System.out.println("Voume of cube " + a*b*c);

        //Solution 2
        char ch = 'U';
        int h = ch;
        System.out.println(h);


        int X=2;
        int Y=3;
        int C=X;
        X=Y;
        Y=C;
        System.out.println(X);
        System.out.println(Y);

        //Solution 4
        int h,i,j;
        System.out.println("Enter Two Numbers ");
        Scanner sc =new Scanner(System.in);
        h = sc.nextInt();
        i = sc.nextInt();
        System.out.println("Before Swapping " + h + " " + i );
        j = h;
        h = i;
        i = j;
        System.out.println("After Swapping " + h + " " + i );


