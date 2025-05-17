import java.util.Scanner;
public class InputDemo{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name=scanner.nextLine();

        System.out.println("Enter your dream job: ");
        String job=scanner.nextLine();

        System.out.println("My name is "+ name + " and I want to become a "+ job + ".");
        scanner.close();
}
}