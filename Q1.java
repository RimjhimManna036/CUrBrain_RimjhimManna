import java.util.Scanner;
public class Q1 {
     public static int count (int count,int number){
    
   if ( number==0){
      return 1;
   }
   else{
    count =0;
    while(number!=0){
        number=number/10;
        count++;
    }
    return count;
   }
}
   
   public static void odd_even(int count){
     if(count%2 ==0){
        System.out.println("True");
     }
     else{
        System.out.println("False");
     }
}
    
public static void main(String[] args){
     System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    int count_value=count(0,number);
    odd_even(count_value);
    sc.close();
    }
}
