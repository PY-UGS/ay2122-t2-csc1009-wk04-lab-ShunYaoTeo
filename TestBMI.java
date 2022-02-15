import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight1 = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height1 = input.nextDouble();

        BMI user = new BMI(weight1, height1);

        System.out.println("BMI is " + user.getBmiValue());
        System.out.print(user.getInterpretation());

    }
}
