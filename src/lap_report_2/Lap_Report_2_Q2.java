package lap_report_2;

import java.util.Scanner;

public class Lap_Report_2_Q2 {
    public static String sumOfPower2(int decimal){
        
        StringBuilder str = new StringBuilder("");
        int binary[] = new int[50];    
        int j = 0, index = 0;   
        
        while(decimal > 0){    
            binary[index++] = decimal%2;    
            decimal = decimal/2;    
        }    

        for(int i = 0; i < index; i++){ 
            if(binary[i] == 1){
                int value = (int) Math.pow(2, j);
                if(i != index - 1)
                    str.append(value).append(" + ");
                else
                    str.append(value);
            }
            j++;
        }    
        return str.toString();
        
    }
    
    public static void main(String[] args){
        String str;
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        input.close();
        
        str = sumOfPower2(num);
        
        System.out.println(num + " = " + str);
    }
}
