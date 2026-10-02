import java.util.Scanner;
public class Q3{
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
    System.out.println("Enter a number(interger): ");
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int reverse_value =reverse(0,num);
    if(num == reverse_value){
        System.out.println(num);
    }else{
        System.out.println(num+reverse_value);
    }
     sc.close();
}
}
