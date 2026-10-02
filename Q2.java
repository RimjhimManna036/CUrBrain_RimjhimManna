import java.util.Scanner;
public class Q2 {
    public static int reverse(int reverse,int num){
        if(num==0){
            return 0;
        }else{
        reverse =0;
        int digit=0;
        while(num!=0){
          digit=num%10;
          reverse =reverse*10 +digit;
          num =num/10;
        }
        return reverse;
    }
    }
public static void main(){
    System.out.println("Enter a integer: ");
    Scanner sc =new Scanner(System.in);
    int num=sc.nextInt();
    int reverse_value=reverse(0,num);
    System.out.println(2*reverse_value);
    sc.close();
}
}