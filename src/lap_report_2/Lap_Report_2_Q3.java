package lap_report_2;

import java.util.Scanner;

public class Lap_Report_2_Q3 {
    
    public static void main(String[] args){
        
        int userInt, value;
        String userStr;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        userStr = input.nextLine();
        
        System.out.print("Enter an integer: ");
        userInt = input.nextInt();
        input.close();
        
        value = javaMethod(userStr, userInt);
        System.out.println("Result = " + value);
    }
    
    public static int javaMethod(String s, int k){
        
        int returnInt;
        char[] tempDigit = s.toCharArray();

        int div = 0, count = 0;
        int[] num = new int[3];
        
        //count number of '?'
        for(int i = 0; i < tempDigit.length; i++){
            if(tempDigit[i] == '?'){
                num[count++] = i;
            }
        }

        //only 1 '?'
        if(count == 1){
            if(tempDigit[0] == '?'){
                //first '?'
                for(int j = 1; j <= 9; j++){
                    String tempStr = "";
                    tempDigit[0] = (char)(j + '0');
                    //convert to string
                    for(int m = 0; m < tempDigit.length; m++){
                        tempStr += tempDigit[m];
                    }
                    //convert to integer
                    returnInt = Integer.parseInt(tempStr);
                    //check divisibility
                    if(returnInt%k == 0){
                        div++;
                    }
                }
            }
            else{
                //first '?'
                for(int j = 0; j <= 9; j++){
                    String tempStr = "";
                    tempDigit[num[0]] = (char)(j + '0');
                    //convert to string
                    for(int m = 0; m < tempDigit.length; m++){
                        tempStr += tempDigit[m];
                    }
                    //convert to integer
                    returnInt = Integer.parseInt(tempStr);
                    //check divisibility
                    if(returnInt%k == 0){
                        div++;
                    }
                }  
            }  
        }
        
        //only 2 '?'
        if(count == 2){
            if(tempDigit[0] == '?'){
                //first '?'
                for(int j = 1; j <= 9; j++){
                    tempDigit[0] = (char)(j + '0');
                    //second '?'
                    for(int n = 0; n <= 9; n++){
                        tempDigit[num[1]] = (char)(n + '0');
                        String tempStr = "";
                        //convert to string
                        for(int m = 0; m < tempDigit.length; m++){
                            tempStr += tempDigit[m];
                        }
                        //convert to integer
                        returnInt = Integer.parseInt(tempStr);
                        //check divisibility
                        if(returnInt%k == 0){
                            div++;
                        }
                    }
                }
            }
            else{
                //first '?'
                for(int j = 0; j <= 9; j++){
                    tempDigit[num[0]] = (char)(j + '0');
                    //second '?'
                    for(int n = 0; n <= 9; n++){
                        tempDigit[num[1]] = (char)(n + '0');
                        String tempStr = "";
                        //convert to string
                        for(int m = 0; m < tempDigit.length; m++){
                            tempStr += tempDigit[m];
                        }
                        //convert to integer
                        returnInt = Integer.parseInt(tempStr);
                        //check divisibility
                        if(returnInt%k == 0){
                            div++;
                        }
                    }
                }
            }
        }
        
        //only 3 '?'
        if(count == 3){
            if(tempDigit[0] == '?'){
                //first '?'
                for(int j = 1; j <= 9; j++){
                    tempDigit[0] = (char)(j + '0');
                    //second '?'
                    for(int n = 0; n <= 9; n++){
                        tempDigit[num[1]] = (char)(n + '0');
                        //third '?'
                        for(int i = 0; i <= 9; i++){
                            tempDigit[num[2]] = (char)(i + '0');
                            String tempStr = "";
                            //convert to string
                            for(int m = 0; m < tempDigit.length; m++){
                                tempStr += tempDigit[m];
                            }
                            //convert to integer
                            returnInt = Integer.parseInt(tempStr);
                            //check divisibility
                            if(returnInt%k == 0){
                                div++;
                            }
                        }
                    }
                }
            }
            else{
                //first '?'
                for(int j = 0; j <= 9; j++){
                    tempDigit[num[0]] = (char)(j + '0');
                    //second '?'
                    for(int n = 0; n <= 9; n++){
                        tempDigit[num[1]] = (char)(n + '0');
                        //third '?'
                        for(int i = 0; i <= 9; i++){
                            tempDigit[num[2]] = (char)(i + '0');
                            String tempStr = "";
                            //convert to string
                            for(int m = 0; m < tempDigit.length; m++){
                                tempStr += tempDigit[m];
                            }
                            //convert to integer
                            returnInt = Integer.parseInt(tempStr);
                            //check divisibility
                            if(returnInt%k == 0){
                                div++;
                            }
                        }
                    }
                }
            }
        }
        return div;
    }
}
