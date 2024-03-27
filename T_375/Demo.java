public class Demo {
    public void Count(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenCount++;

            } else {
                oddCount++;
            }
        }
        System.out.println("Number of Even Digit: " + evenCount);
        System.out.println("Number of Odd digit: " + oddCount);
    }

    public static void main(String[] args) {
        int num = 1232;
        getDigit(num);
        int[] arr = { 1, 2, 3, 4, 5,6,7,8,9,10,11 };
        Demo d = new Demo();
        d.Count(arr);
        String str = " ert yui opl kjh gfd saz xcv bnm";
        getPangram(str);
    }

    private static void getDigit(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Total Digit are: " + count);

    }

    private static void getPangram(String str) {
        if (str.length() < 26) {
            System.out.println("Not Panagram");
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (str.indexOf(i) < 0) {
                    System.out.println("Not Panagram");
                    break;
                }

            }
        }
        System.out.println("It is Panagram");
    }

}