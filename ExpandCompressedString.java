// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        
        int n = str.length();
        int i=0;
        while(i<n){
            char currentChar = str.charAt(i);
            i++;
            StringBuilder digit = new StringBuilder();
            while(i<n&&Character.isDigit(str.charAt(i))){
                digit.append(str.charAt(i));
                i++;
            }
            int count = digit.length() > 0 ? Integer.parseInt(digit.toString()) : 1;

            for(int j=0;j<count;j++){
                result.append(currentChar);
            }
        }
        System.out.print(result.toString());
    }
}
