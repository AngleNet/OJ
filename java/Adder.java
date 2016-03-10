
import java.util.Scanner;
class Adder{
    public static String add(String s1, String s2){
        int len1 = s1.length()-1;
        int len2 = s2.length()-1;
        char[] arr1 = s1.trim().toCharArray();
        char[] arr2 = s2.trim().toCharArray();
        int sum = 0;
        int carryUp = 0;
        String result = "";
        while (len1-- >= 0 && len2-- >= 0){
            sum = Character.getNumericValue(arr1[len1]) + 
                Character.getNumericValue(arr2[len2]) + carryUp;
            carryUp = sum / 10;
            if(sum <=  9) {
                result = Integer.toString(sum) + result;
            }else {
                result = Integer.toString(sum % 10) + result; 
            }
        }
        while(len1-- > 0){
            sum = Character.getNumericValue(arr1[len1]) +
                carryUp;
            carryUp = sum / 10;
            if(sum <= 9){
                return s1.trim().substring(0, len1) + 
                    Integer.toString(sum) + result;
            }else{
                result = Integer.toString(sum) + result;
            }
        }
        while(len2-- > 0){
            sum = Character.getNumericValue(arr2[len2]) +
                carryUp;
            carryUp = sum / 10;
            if(sum <= 9){
                return s2.trim().substring(0, len1) + 
                    Integer.toString(sum) + result;
            }else{
                result = Integer.toString(sum) + result;
            }
        }
        if(carryUp != 0){
            return Integer.toString(carryUp) + result;
        }
        return result;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        System.out.println(add(s1, s2));
    }
}