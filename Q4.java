import java.util.Scanner;
public class Q4 {
   
public static int product(int product, int num) {

    if(num==0 || num <0){
        System.out.println("Invalid Input");
    }else{
    product = 1;

    while (num > 0) {
        int digit = num % 10;
        product = product * digit;
        num = num / 10;
    }
    }
    return product;

}

public static int sum(int sum, int num) {
    sum = 0;

    while (num > 0) {
        int digit = num % 10;
        sum = sum + digit;
        num = num / 10;
    }

    return sum;
}

public static void main(String[] args){
    System.out.println("Enter a number : ");
    Scanner sc =new Scanner(System.in);
    int num =sc.nextInt();
    int subtraction=product(0,num)-sum(0,num);
    System.out.println(subtraction);
    sc.close();
}
}


