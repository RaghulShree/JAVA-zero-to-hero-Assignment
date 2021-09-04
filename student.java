import java.util.Scanner;
public class student {
    public static void main(String arg[]) {
        int roll;
        String name;
        float marks;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll No:");
        roll=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter Mark:");
        marks=sc.nextFloat();
        System.out.println("Roll No:"+ roll +"\nName:" + name + "\nMarks:"+ marks);
    }
    
}
