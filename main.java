import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int total=0;
    int grade;
    int average;
    int counter=0;

    while (counter < 10){
        System.out.println("Enter your grade:");
        grade = input.nextInt();
        total = total + grade;
        counter++;
    }
    average =total/10;
    System.out.println("your average is"+average);
    }
}