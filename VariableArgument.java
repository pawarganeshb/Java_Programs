public class VariableArgument {
    static int sum(int...arr)
    {
        int sum=0;
        for (int i =0;i<arr.length;i++)   
        {
            sum+=arr[i];
        }
        return sum;

    }
    // static int sum(int a,int...arr) // Atleast one argument is required.
    // {
    //     int sum=0;
    //     for (int i =0;i<arr.length;i++)   
    //     {
    //         sum+=arr[i];
    //     }
    //     return sum;

    // }
    public static void main(String[] args) {
        System.out.println("This is one argument: "+sum());
        System.out.println("The sum of 12,12 and 4 is: "+sum(12,12,4));
        System.out.println("The sum of 12,12,2,6 and 4 is: "+sum(12,12,2,6,4));
        System.out.println("The sum of 12,12,2,6,4 and 4 is: "+sum(12,12,2,6,4,4));
    }
    
}
