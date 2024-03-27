import java.util.HashSet;
import java.util.Scanner;

// Q 1] w.a.p to print given string is palindrome or not.
// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a String:");
// String str = sc.nextLine();
// String cpy = str, rev = "";
// int length = str.length();
// for (int i = length - 1; i >= 0; i--) {
// rev = rev + str.charAt(i);
// }
// if (cpy.equals(rev)) {
// System.out.println(str + " is palindrome.");
// } else {
// System.out.println(str + " is not palindrome.");
// }
// }
// }
// Q 2] w.a.p to print given number is palindrome or not.
// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number:");
// int num = sc.nextInt();
// int cpy = num;
// int rev = 0;
// while (num > 0) {
// rev = rev * 10 + num % 10;
// num /= 10;
// }
// if (cpy == rev) {
// System.out.println(cpy + " is palindrome number .");
// } else {
// System.out.println(cpy + " is not a palindrome.");
// }
// }
// }

// Q 3] w.a.p to print given string is pangram or not.
// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string: ");
// String str = sc.nextLine();
// boolean check = pangram(str.toLowerCase());
// if (check == true) {
// System.out.println("Your string is Pangram.");
// } else {
// System.out.println("Your string is not a Pangram.");
// }
// }

// private static boolean pangram(String str) {
// int length = str.length();
// if (length <= 26) {
// return false;
// } else {
// for (char ch = 'a'; ch <= 'z'; ch++) {
// if (str.indexOf(ch) < 0) {
// return false;
// }
// }
// }
// return true;
// }
// }
// Q 4] w.a.p to print given number is prime or not.

// public class PracticeRev {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int num = sc.nextInt();
//         int count = 0;

//         if (num > 1) {
//             for (int i = 1; i <= num; i++) {
//                 if (num % i == 0)
//                     count++;

//             }
//             if (count == 2) {
//                 System.out.println("Prime Number.");
//             } else {
//                 System.out.println("Not Prime Number.");
//             }
//         } else {
//             System.out.println("Not Prime Number.");
//         }

//     }
// }

// Q 5] w a p to print revers the string:

// public class PracticeRev {
// static StringBuilder revers1(String str) {
// StringBuilder sb = new StringBuilder();
// StringBuilder rev = sb.reverse();
// return rev;
// }

// static StringBuffer revers2(String str) {
// StringBuffer sb = new StringBuffer(str);
// StringBuffer rev = sb.reverse();
// System.out.println("Your String is: " + rev);
// return rev;

// }

// static String revers3(String str) {
// int length = str.length();
// String rev = "";
// for (int i = length - 1; i >= 0; i--) {
// rev = rev + str.charAt(i);
// }
// return rev;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string:");
// String str = sc.nextLine();
// System.out.println("Your string in revers format: " + revers1(str));
// System.out.println("Your string in revers format: " + revers2(str));
// System.out.println("Your string in revers format: " + revers3(str));
// }
// }
// public class PracticeRev {
// static int revers1(int num) {
// int rev = 0;
// while (num != 0) {
// rev = rev * 10 + num % 10;
// num /= 10;

// }
// return rev;
// }

// static StringBuffer revers2(int num) {
// StringBuffer sb = new StringBuffer(String.valueOf(num));
// StringBuffer rev = sb.reverse();
// return rev;
// }

// static StringBuilder revers3(int num) {
// StringBuilder sb = new StringBuilder();
// sb.append(num);
// StringBuilder rev = sb.reverse();
// return rev;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int num = sc.nextInt();
// System.out.println("Revers number is: " + revers1(num));
// System.out.println("Revers number is: " + revers2(num));
// System.out.println("Revers number is: " + revers3(num));
// }
// }
// Q 6] w.a.p to given arrays are intersection are not.
// public class PracticeRev {
// public static void main(String[] args) {
// int a1[]={4,2,8,4,3};
// int a2[]={1,0,9,7,5};
// for (int i = 0; i < a1.length; i++) {
// for (int j = 0; j < a2.length; j++) {
// if(a2[i]==a1[j]){
// System.out.println(a2[i]+"\t");
// }
// }
// }
// }
// }
// Q 7] w.a.p to print numbers of digit count.
// public class PracticeRev{
// public static void main(String[] args) {
// int num=123456;
// int count=0;
// while (num>0) {
// num=num/10;
// count++;
// }
// System.out.println(count);
// }
// }
// Q 8] w.a.p to print sum of digits in given numbers.
// public class PracticeRev{
// public static void main(String[] args) {
// int num =1234;
// int sum=0;
// while (num>0) {
// sum=sum+num%10;
// num/=10;

// }
// System.out.println(sum);
// }
// }
// Q 9] w.a.p print intersection of two arrays( means same element in these
// arrays.)
// public class PracticeRev {
// public static void main(String[] args) {
// int[] a1 = { 1, 2, 3, 4 };
// int[] a2 = { 5, 6, 0, 7 };
// HashSet<Integer> has = new HashSet<>();
// for (int i = 0; i < a2.length; i++) {
// has.add(a1[i]);
// }
// System.out.println("Same Element in these array:");
// for (int i = 0; i < a2.length; i++) {
// if (has.contains(a2[i])) {
// System.out.println(a2[i]);
// }
// }
// }
// }
// Q 10] w.a.p to insert elements in stack using array.
// public class PracticeRev{
// int a[]=new int[5];
// int top=0;
// private boolean push(int x){
// top++;
// a[top]=x;
// System.out.println("your insert element is :"+x);
// return true;
// }
// private int pop(){
// int x=a[top--];
// System.out.println("Your element is poped: "+x);
// return x;
// }
// private int peek(){
// return a[top];
// }
// public static void main(String[] args) {
// PracticeRev pr= new PracticeRev();
// pr.push(10);
// pr.push(60);
// pr.push(100);
// pr.push(80);
// pr.pop();
// System.out.println("Your Topmost element is: "+pr.peek());
// }
// }
// Q 11] wap to print array list after insert element at specific position.

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the 5 elements: ");
// int a[] = new int[6];
// for (int i = 0; i < a.length - 1; i++) {
// a[i] = sc.nextInt();

// }
// System.out.println("Before inserting element:");
// for (int i : a) {
// System.out.print(i + "\t");
// }
// System.out.println("\nEnter the loction:");
// int location = sc.nextInt();
// System.out.println("Enter the element:");
// int element = sc.nextInt();
// for (int i = a.length - 1; i > location; i--) {
// a[i] = a[i - 1];

// }
// a[location] = element;
// System.out.println("After the insert element:");
// for (int i : a) {
// System.out.print(i + "\t");

// }
// }

// }
// Q 12] wap to print count number of character int string.
// public class PracticeRev {
// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the string: ");
// String str = sc.nextLine();
// int strLength = str.length();
// System.out.println("Enter a character : ");
// String charstr = sc.nextLine();
// str = str.replace(charstr, "");
// int charLength = str.length();
// System.out.println("Total number of character in this string: " + (strLength
// - charLength));

// }
// }
// Q 13] wap to print reverse array
// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the 5 element: ");
// int a[] = new int[5];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();

// }
// System.out.print("Before reversing array: ");
// for (int i : a) {
// System.out.print(i + "\t");

// }
// simpleRevers(a);
// usingTemp(a);

// }

// private static void usingTemp(int[] a) {
// System.out.print("\nAfter a reversing array: ");
// for (int i = a.length-1; i > -1; i--) {
// System.out.print(a[i]+"\t");

// }
// }

// private static void simpleRevers(int[] a) {
// int low=0;
// int high=a.length-1;
// while (low<high) {
// int temp=a[low];
// a[low]=a[high];
// a[high]=temp;
// low++;
// high--;
// }
// System.out.print("\nAfter a reversing array: ");
// for (int i : a) {
// System.out.print(i+"\t");

// }
// }
// }

// Q 14] wap to print of how many numbers even and odd in array

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the 5 element: ");
// int a[] = new int[5];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();

// }
// int count1 = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 == 0) {
// count1++;
// }
// }
// int count2 = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 != 0) {
// count2++;
// }
// }
// System.out.println("Sum of Even number: " + count1);
// System.out.println("Sum of odd number: " + count2);
// }
// }
// Q 16] wap a program to print the sum of even and odd numbers in array list.

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the 5 element: ");
// int a[] = new int[5];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();

// }
// int sum1 = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 == 0) {
// sum1 = sum1 + a[i];
// }
// }
// int sum2 = 0;
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 != 0) {
// sum2 = sum2 + a[i];
// }
// }
// System.out.println("Sum of Even number: " + sum1);
// System.out.println("Sum of odd number: " + sum2);
// }
// }

// Q 17] wap to print position of even and odd numbers.

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a 5 numbers: ");
// int a[] = new int[5];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();

// }
// System.out.print("Position of Even numbers: ");
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 == 0) {
// System.out.print((i + 1) + "\t");
// }

// }
// System.out.print("\nPosition of odd numbers: ");
// for (int i = 0; i < a.length; i++) {
// if (a[i] % 2 != 0) {
// System.out.print((i + 1) + "\t");
// }

// }
// }
// }
// Q 18] wap to print revers string using recursive method
// public class PracticeRev {
// static String revrsstr(String str) {
// if (str == null || str.length() <= 1) {
// return str;
// }
// return revrsstr(str.substring(1)) + str.charAt(0);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a string: ");
// String str = sc.nextLine();
// System.out.println("Your Revers string is: " + revrsstr(str));

// }

// }
// Q 19] wap to print factorial of number using recursive method.
// public class PracticeRev {
// static int factorial(int num) {
// if (num == 0 || num == 1) {
// return 1;

// }
// return num * factorial(num - 1);
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int n = sc.nextInt();
// System.out.print("Factorial of " + n + " is: " + factorial(n));
// }
// }
// Q 20] wap to print factorial number using index method.
// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a number: ");
// int num = sc.nextInt();
// int fact = 1;
// for (int i = 1; i <= num; i++) {
// fact = i * fact;
// }
// System.out.println("Factorial is: " + fact);
// }
// }

// Q 21] wap to print the swaps number.
// public class PracticeRev {
// static void swap1(int a, int b) {
// int temp = a;
// a = b;
// b = temp;
// System.out.println("After swaping: " + a + " " + b);
// }

// static void swap2(int a, int b) {
// a = a ^ b;
// b = a ^ b;
// a = a ^ b;
// System.out.println("After swaping: " + a + " " + b);
// }

// static void swap3(int a, int b) {
// b = a + b - (a = b);
// System.out.println("After swaping: " + a + " " + b);
// }
// static void swap4(int a, int b){
// a=a*b;
// b=a/b;
// System.out.println("After swaping: " + a + " " + b);

// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the 2 numbers:");
// int a = sc.nextInt();
// int b = sc.nextInt();
// System.out.println("Before swaping: " + a + " " + b);
// swap1(a, b);
// System.out.println("Before swaping:" + a + " " + b);
// swap2(a, b);
// System.out.println("Before swaping:" + a + " " + b);
// swap3(a, b);
// System.out.println("Before swaping:" + a + " " + b);
// swap4(a, b);
// }

// }
// Q 22] wap to print sorted names in this arrays.

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a 5 names for sorting: ");
// String names[] = new String[5];
// for (int i = 0; i < names.length; i++) {
// names[i] = sc.nextLine();

// }
// String temp;
// System.out.print("Before sorting: ");
// for (String s : names) {
// System.out.print(s + "\t");

// }
// for (int i = 0; i < names.length; i++) {
// for (int j = i + 1; j < names.length; j++) {
// if (names[i].compareTo(names[j]) > 0) {
// temp = names[i];
// names[i] = names[j];
// names[j] = temp;

// }

// }

// }
// System.out.print("\nAfter sorting: ");
// for (String s : names) {
// System.out.print(s + "\t");

// }

// }
// }

// Q 23] Wap program to print numbers of digits using differance ways.
// public class PracticeRev {
// static int iterative(int num, int count) {
// while (num != 0) {
// num /= 10;
// count++;
// }
// return count;
// }

// static int recursive(int num) {
// if (num == 0) {
// return 0;

// }
// return 1 + recursive(num / 10);
// }

// static int convert(int num) {
// return String.valueOf(num).length();
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int count = 0;
// System.out.println("Enter the numbers: ");
// int num = sc.nextInt();
// System.out.println("Numbers of digits are: " + iterative(num, count));
// System.out.println("Numbers of digits are: " + recursive(num));
// System.out.println("Numbers of digits are: " + convert(num));

// }
// }

// Q 24] wap program to print number of even and odd numbers in this array. 

// public class PracticeRev {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number: ");
// int num = sc.nextInt();
// int ecount = 0;
// int ocount = 0;
// int temp;
// while (num != 0) {

// if (num % 2 == 0) {
// ecount++;

// } else {
// ocount++;
// }
// num /= 10;

// }
// System.out.println("Total numbers are even: " + ecount);
// System.out.println("Total numbers are odd: " + ocount);

// }
// }
// public class PracticeRev {
//     public static void main(String[] args) {
//         int n = 10;
//         int a = -1;
//         int b = 1;
//         for (int i = 0; i <= n; i++) {
//             int c = a + b;
//             System.out.print(c + "\t");
//             a = b;
//             b = c;

//         }
//     }
// }

//  Q 25] wap program to print duplicate element in array.

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str[] = { "Java", "Python", "C++", "JS", "Java" };
//         boolean flag = false;
//         /*
//          * for (int i = 0; i < str.length; i++) {
//          * for (int j = i + 1; j < str.length; j++) {
//          * if (str[i] == str[j]) {
//          * System.out.println("Duplicate string is: " + str[i]);
//          * flag = true;
//          * }
//          * 
//          * }
//          * 
//          * }
//          * if (flag == flag) {
//          * System.out.println("Duplicate element is not found.");
//          * 
//          * }
//          */
//         HashSet<String> has = new HashSet<>();
//         for (String s : str) {
//             if (has.add(s) == false) {
//                 System.out.println("Duplicate element is found: " + s);
//                 flag = true;
//             }

//         }
//         if (flag == false) {
//             System.out.println("Duplicate element is not found.");
//         }
//     }
// }

// Q 25]wap to print missing number in array.

// public class PracticeRev {
//     public static void main(String[] args) {
//         int a[] = { 1, 2, 3, 4, 5, 7, 8, 9, 10};
//         int sum1 = 0;
//         for (int i : a) {
//             sum1 += i;

//         }
//         System.out.println("sum of array is: " + sum1);
//         int sum2 = 0;
//         for (int i = 1; i <= 10; i++) {
//             sum2 = sum2 + a[i];

//         }
//         System.out.println("sum of within range: " + sum2);
//         System.out.println("Missing number is: " + (sum2 - sum1));
//     }
// }

// Q 26] wap program to print 1 to 10 number using loop.

// public class PracticeRev{
//     public static void printnum(int n) {
//         if(n==0){
//             return;
//         }
//         System.out.print(n+"\t");
//          printnum(n+1);

//     }
//     public static void main(String[] args) {
//        printnum(1);
//     }

// } 
// Q 26] wap program print sum of n natural number using recursion.
// public class PracticeRev {
//     public static int printsum(int n) {

//         if (n != 0) {
//             return n + printsum(n - 1);
//         } else
//             return n;
//     }

//     public static void main(String[] args) {
//         System.out.println(printsum(10));
//     }
// }
// public class PracticeRev {
//     public static void printpermution(String str, String permution) {
//         if (str.length() == 0) {
//             System.out.print(permution + "\t");
//         }
//         for (int i = 0; i < str.length(); i++) {
//             char newchar = str.charAt(i);
//             String newstr = str.substring(0, i) + str.substring(i + 1);
//             printpermution(newstr, permution + newchar);
//         }
//     }

//     public static void main(String[] args) {
//         printpermution("str", "");

//     }
// }
// Q 27 wap to print sorting array using selection method: 
// public class PracticeRev {
//     public static void main(String[] args) {
//         int a[] = { 70, 20, 92, 87, 61 };
//         int min, temp = 0;
//         System.out.print("Before sorting: ");
//         for (int i : a) {
//             System.out.print(i + "\t");

//         }
//         for (int i = 0; i < a.length; i++) {
//             min = i;
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[j] < a[min]) {
//                     min = j;
//                 }

//             }
//             temp = a[i];
//             a[i] = a[min];
//             a[min] = temp;

//         }
//         System.out.print("\nAfter sorting:  ");
//         for (int i : a) {
//             System.out.print(i + "\t");

//         }
//     }
// }
// public class PracticeRev {
//     public static void main(String[] args) {
//         int a[] = { 70, 20, 92, 87, 61 };
//         int j, temp = 0;
//         for (int i = 0; i < a.length; i++) {
//             temp = a[i];
//             j = i;
//             while (j > 0 && a[j - 1] > temp) {
//                 a[j] = a[j - 1];
//                 j = j - 1;

//             }
//             a[j] = temp;

//         }
//         System.out.println("After the sorting: ");
//         for (int i : a) {
//             System.out.print(i);

//         }
//     }
// }

//Q 30] wap to print two string are anagram or not.

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str1 = "ganesh";
//         String str2 = "anhges";
//         boolean status = IsAnagram(str1, str2);
//         if (status == true) {
//             System.out.println("Both strings are Anagrams.");

//         } else {
//             System.out.println("Both strings are not Anagram.");

//         }
//     }

//     private static boolean IsAnagram(String str1, String str2) {
//         char[] count = new char[256];
//         for (int i = 0; i < str1.length(); i++) {
//             ++count[str1.charAt(i)];
//             --count[str2.charAt(i)];

//         }
//         for (int i = 0; i < count.length; i++) {
//             if (count[i] != 0)
//                 return false;

//         }
//         return true;

//     }
// }

// Q 30] wap to print both string are anagram or not with usign stringBuilder method.

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str1 = "aab";
//         String str2 = "bba";
//         boolean status = IsAnagram(str1, str2);
//         if (status == true) {
//             System.out.println("Given string are anagram.");
//         } else {
//             System.out.println("Given string are not anagram.");
//         }
//     }

//     private static boolean IsAnagram(String str1, String str2) {
//         char[] count = new char[256];
//         for (int i = 0; i < str1.length(); i++) {
//             ++count[str1.charAt(i)];
//             --count[str2.charAt(i)];

//         }
//         for (int i = 0; i < count.length; i++) {
//             if (count[i] != 0) {
//                 return false;
//             }

//         }
//         return true;

//     }
// }

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str1 = "aab";
//         String str2 = "bac";
//         boolean status = isanagram(str1, str2);
//         if (status == true) {
//             System.out.println("Given string are Anagram.");

//         } else {
//             System.out.println("Given string are not Anagram.");
//         }

//     }

//     private static boolean isanagram(String str1, String str2) {
//         char[] count = new char[256];
//         for (int i = 0; i < str1.length(); i++) {
//             ++count[str1.charAt(i)];
//             --count[str2.charAt(i)];

//         }
//         for (int i = 0; i < count.length; i++) {
//             if (count[i] != 0) {
//                 return false;
//             }

//         }

//         return true;

//     }
// }

// Q 30] wap to print of number of word.

// public class PracticeRev {
//     public static void main(String[] args) {
//         String string = "I am your future husband.";
//         int count = CountNumberOfWord(string);
//         System.out.println("Total words in string:- " + count);
//     }

//     private static int CountNumberOfWord(String string) {
//         int count = 0;
//         if (string.charAt(0) != ' ') {
//             ++count;
//         }
//         for (int i = 0; i < string.length(); i++) {
//             if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ')
//                 count=1;

//         }
//         return count;

//     }
// }

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str = "I will try.";
//         int count = CountNumberOfWord(str);
//         System.out.println("Total words is: " + count);
//     }

//     private static int CountNumberOfWord(String string) {
//         int count = 0;
//         if (string.charAt(0) != ' ') {
//             ++count;
//         }
//         for (int i = 0; i < string.length(); i++) {
//             if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' ') {
//                 ++count;
//             }
//         }
//         return count;

//     }
// }

// Q  31] Insert element in specific element..
// public class PracticeRev {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the 5 element: ");
//         int a[] = new int[6];
//         for (int i = 0; i < a.length - 1; i++) {
//             a[i] = sc.nextInt();
//         }
//         System.out.print("Before inserting: ");
//         for (int i : a) {
//             System.out.print(i + " ");

//         }

//         System.out.print("\n Enter the location: ");
//         int location = sc.nextInt();

//         System.out.print("\nEnter the value: ");
//         int value = sc.nextInt();

//         for (int i = a.length - 1; i > location; i--) {
//             a[i] = a[i - 1]; 
//         }
//         a[location] = value;
//         System.out.print("After t he insertig: ");
//         for (int i : a) {
//             System.out.print(i + " ");

//         }
//     }
// }

// Q 32] linked list implimention.

// public class PracticeRev {
// Node head;
// private int size;

// PracticeRev() {
// this.size = 0;
// }

// class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// ++size;
// }
// }

// public void addfirst(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// newNode.next = head;
// head = newNode;
// }

// public void addlast(int data) {
// Node newNode = new Node(data);
// if (head == null) {
// head = newNode;
// return;
// }
// Node currNode = head;
// while (currNode.next != null) {
// currNode = currNode.next;

// }
// currNode.next = newNode;
// }

// public void deletefirst() {
// if(head == null){
// System.out.println("list is empty...!");
// return;
// }
// --size;
// head = head.next;
// System.out.println("Deleted...!");

// }
// public void deletelast(){
// if(head == null){
// System.out.println("list is empty...!");
// return;
// }
// --size;
// if(head.next == null){
// head = null;
// return;
// }
// Node lastNode = head;
// Node secondNode = head.next;
// while (secondNode.next!=null) {
// secondNode = secondNode.next;
// lastNode = lastNode.next;

// }
// lastNode.next = null;
// System.out.println("Deleted....!");
// }
// public void print(){
// if(head == null){
// System.out.println("list is empty...!");
// return;
// }
// Node currNode = head;
// while(currNode!= null){
// System.out.print(currNode.data+"->");
// currNode = currNode.next;
// }
// System.out.println("null");
// }

// public static void main(String[] args) {
// PracticeRev pra = new PracticeRev();
// pra.addfirst(50);
// pra.addfirst(40);

// pra.addfirst(30);
// pra.addfirst(20);
// pra.addfirst(10);
// pra.print();

// pra.addlast(60);
// pra.print();

// pra.deletefirst();
// pra.print();

// pra.deletelast();
// pra.print();
// System.out.println(pra.size);
// }
// }

// Q 33] wap program to print revers list.

// public class PracticeRev {
//     Node head;

//     class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void add(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = newNode;
//             return;
//         }
//         Node currNodse = head;
//         while (currNodse.next == null) {
//             currNodse = currNodse.next;

//         }
//         currNodse.next = newNode;
//     }

//     public void revers() {
//         if (head == null) {
//             return;
//         }
//         Node preNode = head;
//         Node currNode = head.next;
//         while (currNode != null) {
//             Node nextNode = currNode.next;
//             currNode.next = preNode;

//             preNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = preNode;
//     }

//     public void print() {
//         if (head == null) {
//             System.out.println("list is empty...");
//             return;
//         }
//         Node currNode = head;
//         while (currNode != null) {
//             System.out.println(currNode.data + "-> ");
//             currNode = currNode.next;

//         }
//         System.out.println("null");

//     }

//     public static void main(String[] args) {
//         PracticeRev p = new PracticeRev();
//         p.add(1);
//         p.add(2);
//         p.add(3);
//         p.add(4);
//         p.add(5);

//         p.print();

//         p.revers();
//         p.print();
//     }
// }

// public class PracticeRev {
//     public static void main(String[] args) {
//         String str = "AVINASH";
//         String rev = "";
//         int len = str.length();
//         for (int i = len - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }
public class PracticeRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int cpy = n;
        int temp = 0;
        int rem;
        while (n != 0) {
            rem = n % 10;
            temp += rem * rem * rem;
            n /= 10;

        }
        if (temp == cpy) {
            System.out.println("Armstrong");
        } else
            System.out.println("Not Armstrong.");
    }
}

// Do practice String compression
// Both string Rotation
// numbers of vowels and consont