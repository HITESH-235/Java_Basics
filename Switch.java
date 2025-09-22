// import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Without breaks: ");
        // switch(n) {
        //     case 1:
        //         System.out.println("Monday");
        //     case 2:
        //         System.out.println("Tuesday");
        //     case 3:
        //         System.out.println("Wednesday");
        //     case 4:
        //         System.out.println("Thursday");
        //     case 5:
        //         System.out.println("Friday");
        //     case 6:
        //         System.out.println("Saturday");
        //     case 7:
        //         System.out.println("Sunday");
        //     default:
        //         System.out.println("Enter a valid number");
        // }
        // System.out.println();
        // System.out.println("With breaks: ");
        // switch(n) {
        //     case 1: 
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter a valid number");
        // }
        String day = "Sunday";
        // switch(day) {
        //     case "Saturday", "Sunday":
        //         System.out.println("8am");
        //         break;
        //     case "Monday":
        //         System.out.println("6am");
        //         break;
        //     default:
        //         System.out.println("7am");
        // }
        // Using an ->, you dont need a break statement
        // switch(day) {
        //     case "Saturday", "Sunday" -> System.out.println("8am");
        //     case "Monday"-> System.out.println("6am");
        //     default-> System.out.println("7am");
        // }

        // we can also assign a value to an existing variable in the switch statement under a case
        // e.g.
        String res = "";
        // switch(day) {
        //     case "Saturday", "Sunday" -> res = "8am";
        //     case "Monday"-> res = "6am";
        //     default-> res = "7am";
        // }
        // System.out.println(res);

        // to do this directly;
        res = switch(day) {
            case "Saturday", "Sunday" ->"8am";
            case "Monday"->"6am";
            default->"7am";
        };
        System.out.println(res);
        // using -> returns the value, but when using ":" write yield as well:
        res = switch(day) {
            case "Saturday", "Sunday" : yield "8am";
            case "Monday" : yield "6am";
            default : yield "7am";
        }; // does the same task
    }
}
