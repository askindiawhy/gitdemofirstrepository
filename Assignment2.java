import java.util.Scanner;

public class Assignment2 {

    //Solution 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Name of the student is " + name);

        System.out.println("Enter Your Roll No");
        int rollno = sc.nextInt();
        System.out.println("Roll no. of Student IS " + rollno);

        System.out.println("Enter Your Subject Name");
        String Subject = sc.nextLine();
        System.out.println("Name of subject is " + Subject);

        Solution 2
        String A = sc.next();
        String B = sc.next();
        System.out.print(A);
        System.out.print(B);

        Solution3
        System.out.println("Enter Your First Subject Marks");
        int num_1 = sc.nextInt();

        System.out.println("Enter Your Second Subject Marks");
        int num_2 = sc.nextInt();

        System.out.println("Enter Your Third Subject Marks");
        int num_3 = sc.nextInt();

        int sum = num_1 + num_2 + num_3;
        System.out.println("Total Marks " + sum);

        int sum_1 = sum*100/300;
        System.out.println("Total Percentage " + sum_1);

        Solution 4
        int m = 3;
        System.out.println(m);

        int n = 4;
        int o = 5;
        int sum = n + o;
        System.out.println(sum);

        int p = 18;
        int q = 20;
        int sum_1 = p + q;
        System.out.println(sum_1);

        int r = 49;
        int s = 27;
        int sum_2 = r + s;
        System.out.println(sum_2);

        Solution 5

        System.out.println("Enter your name");
        String name1 = "Hellow";
        String name2 = "World";
        System.out.println(name1+name2);

        String name3 = "Happy";
        String name4 = "Faces";
        System.out.println(name3+name4);

        String name5 = "Sunny";
        String name6 = "Day";
        System.out.println(name5+name6);

        String name7 = "Good";
        String name8 = "Morning";
        System.out.println(name7+name8);










    }
}
