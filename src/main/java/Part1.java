import java.util.*;
public class Part1 {
    public static void main(String[] args, boolean Charges) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        String age;
        age = in.nextLine();
        System.out.print(Charges);
    }
    public static double Charges(double age, double charges){
        charges = 5 * age + 300;
        return charges;
    }
}
