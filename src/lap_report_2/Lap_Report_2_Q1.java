package lap_report_2;

import java.util.Scanner;

public class Lap_Report_2_Q1 {

    public static void main(String[] args) {
        
        String str;
	Scanner input = new Scanner(System.in);
	System.out.print("Input: ");
        str = input.nextLine();
        input.close();
	    
        String[] temp = str.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll(" ", "").split(",");
        int[] arr = new int[temp.length];
        
        for(int i = 0; i < temp.length; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < (arr.length - i - 1); j++){
                int tempnum;
                if(arr[j] > arr[j + 1]){
                    tempnum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tempnum;
                }
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        int n, element;
        double value;
        n = arr.length;
        
        if(n % 2 == 1){
            element = (n + 1)/2;
            System.out.println("Median = " + (double)arr[element - 1]);
        }
        else{
            value = ((arr[(n/2) - 1] + arr[((n + 2)/2) - 1]) / (double)2);
            System.out.println("Median = " + value);
        }
        System.out.println("hello world");
    }
    
}
