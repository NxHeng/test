package lap_report_2;

//import java.util.Arrays;
import java.util.Scanner;

public class Lap_Report_2_Q4 {
    public static void main(String[] args){
        String tempstr = "";
        Scanner input = new Scanner(System.in);
        // Array a
        System.out.print("Array a: ");
        tempstr = input.nextLine();
        String[] tempA = tempstr.split(",| ");
        //check less than 10
        while(tempA.length > 10){
            System.out.println("The lengths of the arrays are at most 10.");
            System.out.print("Array a: ");
            tempstr = input.nextLine();
            tempA = tempstr.split(",| ");
        }
        int[] a = new int[tempA.length];
        for(int i = 0; i < tempA.length; i++){
            a[i] = Integer.parseInt(tempA[i]);
        }
        // Array b
        System.out.print("Array b: ");
        tempstr = input.nextLine();
        String[] tempB = tempstr.split(",| ");
        //check same length
        while(tempB.length != tempA.length){
            System.out.println("Please input the same number of integers");
            System.out.print("Array b: ");
            tempstr = input.nextLine();
            tempB = tempstr.split(",| ");
        }
        int[] b = new int[tempB.length];
        for(int i = 0; i < tempB.length; i++){
            b[i] = Integer.parseInt(tempB[i]);
        }
        input.close();
        System.out.println(permutation(a, b, 0));
    }
    public static int permutation(int[] a, int[] b, int index){
        int tempsum = 0; 
        int max = 0;
        if(index == a.length){
//            System.out.println(Arrays.toString(a));
//            System.out.println(Arrays.toString(b));
            int sum = 0;
            for(int i = 0; i < a.length; i++){
//                System.out.println("loop " + i);
                sum += a[i] ^ b[i];
//                System.out.println("i = " + i + " --> " + sum);
            }
//            System.out.println("---------");
            return sum;
        }
        else{
            for(int i = index; i < a.length; i++){
                int temp = a[index];
                a[index] = a[i];
                a[i] = temp;
                tempsum = permutation(a, b, index + 1);
                if(tempsum > max){
                    max = tempsum;
                }
                temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
        return max;
    }
}
