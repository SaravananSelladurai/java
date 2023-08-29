import java.util.Scanner;

public class sumofnum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int Num = sc.nextInt();
        int count =0;
        int sum1;
        int itr = 1;
        while(itr<Num-1){
            sum1 = 0;
            int j =  itr;
            while(sum1 <= Num){
                System.out.println(" 1st loop sum = "+sum1+" j = "+j);
                sum1 += j;
                j++;
                if(sum1 == Num){
                    break;
                }
            }
            if(sum1==Num){
                System.out.println("sum = "+sum1+" j = "+j);
                count++;
            }
            itr++;
        }
        System.out.println("The count is : "+count);
    }
}