import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution1
        int Length = sc.nextInt();
        System.out.println("Length Is "+ Length);
        int Breath = sc.nextInt();
        System.out.println("Breath Is "+ Breath);

        if ( Length == Breath ){
            System.out.println("Square");} else {
            System.out.println("Rectangle");}
        System.out.println(Length==Breath?"Square": "Rectangle");

        Solution2
        int x;
        System.out.println("enter x : ");
        x = sc.nextInt();
        if ( x < 0) {
            System.out.println(-x); } else {
            System.out.println(x);
        }

        Solution3
        int CP = sc.nextInt();
        int SP = sc.nextInt();
     if(CP<SP)   System.out.println("profit : " + (SP-CP));
     else   System.out.println("Loss : " + (CP-SP));

        Solution4
        int num = sc.nextInt();
        if( num > 0 ){
            System.out.println("The Entered Number Is " + num);
        }

        Solution6
        int Marks = sc.nextInt();
        if ( Marks <100 && Marks >90 ) {
            System.out.println("A+"); } else if ( Marks <90 && Marks>80)  {
            System.out.println("A"); } else if ( Marks<80 && Marks>70) {
            System.out.println("B+"); } else if ( Marks<70 && Marks>60){
            System.out.println("B");} else if ( Marks<60 && Marks>50) {
            System.out.println("C"); } else if ( Marks<50 && Marks>40 ){
            System.out.println("D");} else if ( Marks< 40 && Marks>30){
            System.out.println("E"); } else if ( Marks<30 && Marks>0){
            System.out.println("F");

        Solution 5
        int n1 = 6 ,n2 = 8 , Resultant;
        String sym = "*";
        switch ( sym ) {
            case "+":
                Resultant = n1 + n2;
                System.out.println(Resultant);
                break;
            case "-":
                Resultant = n1 - n2;
                System.out.println(Resultant);
                break;
            case "/":
                Resultant = n1 / n2;
                System.out.println(Resultant);
                break;
            case "*":
                Resultant = n1 * n2;
                System.out.println(Resultant);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
