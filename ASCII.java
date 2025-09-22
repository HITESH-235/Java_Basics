public class ASCII {
    public static void main(String args[]){
        // converting char to ascii value
        char ch = 'A'; // for char values use single quotes (double for strings only)
        int asciiVal = ch;
        System.out.println(asciiVal); // java automat. prints ascii value when char-->int

        // nums(0-9): 48-57;
        // capitals(A-Z): 65-90;
        // smalls(a-z): 97-122;

        //converting ascii values back to char
        asciiVal = 97;
        ch = (char)asciiVal; // just use explicit typecasting to char* type
        System.out.println(ch); // 'a'
    }
    
}
