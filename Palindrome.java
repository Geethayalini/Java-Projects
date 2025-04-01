import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a string: ");
String original = scanner.nextLine();
if (isPalindrome(original)){
    System.out.println(original + " is a palindrome.");
}
else {
System.out.println(original + " is not a palindrome.");
}
scanner.close();
}    
public static boolean isPalindrome(String str){
    str = str.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
    int left = 0, right = str.length() - 1;
    while(left < right){
        if (str.charAt(left) != str.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}
