public class Enum_Class  {
    public static void main(String[] args) {
        enum Day {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY};
         Day var= Day.TUESDAY;
        System.out.println(var);
        System.out.println(Day.valueOf("FRIDAY"));
        System.out.println(var.name());
        System.out.println(var.ordinal());
        System.out.println();
        System.out.println(var.toString());
        System.out.println();
        System.out.println(var.getClass()); // New-outerclass, $-separator, Day-enum, 1-first local class(main)
        // prints class New$1Day
    }
}
